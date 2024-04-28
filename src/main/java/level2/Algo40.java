package level2;

import java.util.Arrays;

public class Algo40 {

    static int[] percent = {0, 10, 20, 30, 40};  // 할인율 10% 20% 30% 40%
    static int total_join = 0, total_price = 0, min = Integer.MAX_VALUE;

    public int[] solution(int[][] users, int[] emoticons) {
        // 사용자가 구매할 이모티콘의 최소 할인 비율 구하기
        for (int[] user : users) {
            min = Math.min(min, user[0]); // 최소 할인 비율
        }
        for (int i = 0; i < 5; i++) {
            if (min <= percent[i]) {
                min = i; // index
                break;
            }
        }

        // 중복조합 돌리기
        int[] discounts = new int[emoticons.length];
        comb(discounts, 0, emoticons.length, users, emoticons);

        int[] answer = {total_join, total_price}; // 가입 유저 수, 매출액
        return answer;
    }

    private void comb(int[] discounts, int s, int n, int[][] users, int[] emoticons) {
        if (s == n) {
            cal(users, emoticons, discounts);
            return;
        }

        for (int i = s; i < n; i++) {
            for (int j = min; j < 5; j++) { // 최소 할인 비율부터
                discounts[i] = percent[j];
                comb(discounts, i + 1, n, users, emoticons);
            }
        }
    }

    private void cal(int[][] users, int[] emoticons, int[] discounts) {
        int join = 0; // 플러스 가입 수
        int price = 0; // 판매액

        for (int[] user : users) {
            int userMinDiscount = user[0];
            int userMaxPay = user[1];
            int sum = 0;

            for (int i = 0; i < discounts.length; i++) {
                if (discounts[i] < userMinDiscount) continue;
                sum += sale(emoticons[i], discounts[i]);
            }

            // 기준점 이상이면 가입, 아니면 구입
            if (userMaxPay <= sum) join++;
            else price += sum;
        }

        // static 변수 업데이트
        if (join > total_join) {
            total_join = join;
            total_price = price;
        } else if (join == total_join && price > total_price) {
            total_price = price;
        }
    }

    private int sale(int price, int percent) { // 할인 적용된 가격 구하기
        return (price / 100) * (100 - percent);
    }


    public static void main(String[] args) {
        Algo40 algo40 = new Algo40();

        int[][] user1 = {{40, 10000}, {25, 10000}};
        int[] emoticon1 = {7000, 9000};
        int[] result1 = {1, 5400};
        System.out.println(Arrays.toString(algo40.solution(user1, emoticon1)));
        if (Arrays.equals(algo40.solution(user1, emoticon1), result1)) System.out.println("Y"); else System.out.println("N");

        int[][] user2 = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
        int[] emoticon2 = {1300, 1500, 1600, 4900};
        int[] result2 = {4, 13860};
        System.out.println(Arrays.toString(algo40.solution(user2, emoticon2)));
        if (Arrays.equals(algo40.solution(user2, emoticon2), result2)) System.out.println("Y"); else System.out.println("N");
    }
}
