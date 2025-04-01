package groom.mission;

import java.io.*;
import java.util.*;

class Island implements Comparable<Island> {
    int x, y, index;

    public Island(int x, int y, int index) {
        this.x = x;
        this.y = y;
        this.index = index;
    }

    @Override
    public int compareTo(Island other) {
        if (this.x != other.x) {
            return Integer.compare(this.x, other.x);
        } else {
            return Integer.compare(this.y, other.y);
        }
    }
}

public class A7_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Island> islands = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            islands.add(new Island(x, y, i));
        }

        Collections.sort(islands);

        int[] res = new int[N];

        for (int i = 0; i < N; i++) {
            res[islands.get(i).index] = N - i - 1;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(res[i]);
        }
    }
}