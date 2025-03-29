package groom;


import java.util.Scanner;

//이분 탐색
public class Weekly4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        double d = (double) m / n ;
        long per = (long) (d * 100);
        long target = per + 1;

        if (per >= 99) {
            System.out.println("X");
            return;
        }

        long left = 0, right = (long) 1e12, answer = -1;

        while (left <= right) {
            long mid = (left + right) / 2;
            long newPer = ((m + mid) * 100) / (n + mid);

            if (newPer >= target) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
