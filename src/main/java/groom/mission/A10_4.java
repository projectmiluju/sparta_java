package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//가장 가까운 점 찾기
public class A10_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str1 = br.readLine().split(" ");
        int N = Integer.parseInt(str1[0]);
        int Q = Integer.parseInt(str1[1]);

        String[] str2 = br.readLine().split(" ");
        long[] X = new long[N];

        for (int i = 0; i < N; i++) {
            X[i] = Long.parseLong(str2[i]);
        }

        Arrays.sort(X);  // 정렬하여 이진 탐색 가능하도록 함

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Q; i++) {
            long p = Long.parseLong(br.readLine());

            // 이진 탐색을 사용하여 가장 가까운 점 찾기
            int idx = Arrays.binarySearch(X, p);
            if (idx < 0) {
                idx = -(idx + 1);  // 삽입 위치로 변환
            }

            // 후보 찾기
            long closest = Integer.MAX_VALUE;
            if (idx < N) {  // 오른쪽 값 (p보다 크거나 같은 값)
                closest = X[idx];
            }
            if (idx > 0) {  // 왼쪽 값 (p보다 작은 값)
                long leftCandidate = X[idx - 1];
                // 가장 가까운 값 선택 (여러 개일 경우 작은 값 선택)
                if (Math.abs(leftCandidate - p) < Math.abs(closest - p) ||
                        (Math.abs(leftCandidate - p) == Math.abs(closest - p) && leftCandidate < closest)) {
                    closest = leftCandidate;
                }
            }

            sb.append(closest).append("\n");
        }

        System.out.print(sb);
    }
}
