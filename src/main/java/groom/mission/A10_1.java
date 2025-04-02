package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//방 탈출하기
public class A10_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

//        String input = br.readLine();
//        int[] A = new int[N];
//        for (int i = 0; i < N; i++) {
//            A[i] = Integer.parseInt(input.split(" ")[i]);
//        }

        String[] input = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(br.readLine());
        }


        Arrays.sort(A);

//        for (int i = 0; i < M; i++) {
//            int index = Arrays.binarySearch(A, B[i]);
//            if (index >= 0) {
//                System.out.println(1);
//            } else {
//                System.out.println(0);
//            }
//        }

        StringBuilder sb =  new StringBuilder();
        for (int i = 0; i < M; i++) {
            int index = Arrays.binarySearch(A, B[i]);
            if (index >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}
