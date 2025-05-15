package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A13_4 {
    static int N, M;
    static int[] language;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 나라 수
        M = Integer.parseInt(st.nextToken()); // 항로 수

        language = new int[N + 1]; // 각 나라의 언어 (1번부터 시작)
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            language[i] = Integer.parseInt(st.nextToken());
        }

        // 그래프 초기화
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 항로 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        int maxVisit = 0;
        int nativeLang = language[1]; // 구름이가 아는 언어

        // 1번 나라의 언어를 제외한 1~10까지 모든 언어 후보에 대해 시도
        for (int learnLang = 1; learnLang <= 10; learnLang++) {
            if (learnLang == nativeLang) continue;
            maxVisit = Math.max(maxVisit, bfs(nativeLang, learnLang));
        }

        System.out.println(maxVisit);
    }

    static int bfs(int nativeLang, int learnLang) {
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();

        if (language[1] != nativeLang && language[1] != learnLang) return 0;

        visited[1] = true;
        queue.add(1);
        int count = 1;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int next : graph[cur]) {
                if (visited[next]) continue;
                if (language[next] == nativeLang || language[next] == learnLang) {
                    visited[next] = true;
                    queue.add(next);
                    count++;
                }
            }
        }
        return count;
    }
}
