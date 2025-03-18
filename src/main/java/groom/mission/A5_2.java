package groom.mission;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class A5_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr1 = new int[2];
        arr1[0] = Integer.parseInt(str.split(" ")[0]);
        arr1[1] = Integer.parseInt(str.split(" ")[1]);

        int N = Integer.parseInt(br.readLine());

        int[][] arr2 = new int[N][2];
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            arr2[i][0] = Integer.parseInt(str.split(" ")[0]);
            arr2[i][1] = Integer.parseInt(str.split(" ")[1]);
        }

        int Q = Integer.parseInt(br.readLine());

        String str2 = br.readLine();

        for (int i = 0; i < Q; i++) {
            if (Objects.equals(str2.split(" ")[i], "L")) {
                boolean flag = true;
                for (int j = 0; j < N; j++) {
                    if(arr2[j][0] == arr1[0]-1 && arr2[j][1] == arr1[1]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    arr1[0]--;
                }
            } else if (Objects.equals(str2.split(" ")[i], "R")) {
                boolean flag = true;
                for (int j = 0; j < N; j++) {
                    if(arr2[j][0] == arr1[0]+1 && arr2[j][1] == arr1[1]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    arr1[0]++;
                }
            } else if (Objects.equals(str2.split(" ")[i], "U")) {
                boolean flag = true;
                for (int j = 0; j < N; j++) {
                    if(arr2[j][0] == arr1[0] && arr2[j][1] == arr1[1]+1){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    arr1[1]++;
                }
            } else if (Objects.equals(str2.split("")[i], "D")) {
                boolean flag = true;
                for (int j = 0; j < N; j++) {
                    if(arr2[j][0] == arr1[0] && arr2[j][1] == arr1[1]-1){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    arr1[1]--;
                }
            }
        }
        System.out.println(arr1[0]+ " " + arr1[1]);
    }
}
