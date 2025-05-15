package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class A13_3 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int lastNode = 0;
    static int visitCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 노드 수
        int M = Integer.parseInt(st.nextToken()); // 간선 수
        int K = Integer.parseInt(st.nextToken()); // 시작 노드

        // 그래프 초기화
        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u); // 양방향 그래프
        }

        // 각 노드의 인접 노드 정렬 (작은 번호 우선)
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // 탐색 시작
        dfs(K);

        // 결과 출력
        System.out.println(visitCount + " " + lastNode);
    }

    static void dfs(int current) {
        visited[current] = true;
        lastNode = current;
        visitCount++;

        for (int next : graph[current]) {
            if (!visited[next]) {
                dfs(next);
                break; // 조건에 따라 한 번만 다음 노드로 이동
            }
        }
    }
}
