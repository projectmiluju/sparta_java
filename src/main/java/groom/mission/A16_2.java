package groom.mission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A16_2 {
    static final int MAXN = 20001;
    static final int INF = Integer.MAX_VALUE;
    static int N;
    static int[] dist = new int[MAXN]; // 거리 배열
    static int[] parent = new int[MAXN]; // 부모 배열
    static List<int[]>[] tree = new ArrayList[MAXN]; // 인접 리스트: [연결노드, 가중치]

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        // 인접 리스트 초기화
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        // 간선 입력 (노드 번호 1-based)
        for (int i = 2; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            tree[i].add(new int[]{a, l});
            tree[a].add(new int[]{i, l});
        }

        // 1. 1번에서 가장 먼 노드 u 찾기 (트리 지름의 한 끝)
        Arrays.fill(dist, 0);
        dfsDist(1);

        int u = 1;
        for (int i = 2; i <= N; i++) if (dist[u] < dist[i]) u = i;

        // 2. u에서 가장 먼 노드 v 찾기 (트리 지름의 반대편)
        Arrays.fill(dist, 0);
        dfsDist(u);

        int v = 1;
        for (int i = 2; i <= N; i++) if (dist[v] < dist[i]) v = i;

        // 3. u에서 부모 정보 parent[] 기록 (지름 경로 역추적)
        Arrays.fill(parent, 0);
        dfsParent(u);

        // 4. 지름 경로 중 어느 점에서 불을 붙일 때 "최소 최대 거리"가 되는지 탐색
        int answer = INF;
        for (int i = v; i != 0; i = parent[i]) {
            // i 기준 양쪽으로 최대 거리 (i~u, i~v)
            answer = Math.min(answer, Math.max(dist[i], dist[v] - dist[i]));
        }

        System.out.println(answer);
    }

    // DFS(스택)로 거리 계산
    static void dfsDist(int start) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{start, 0}); // {현재노드, 부모}
        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            int node = cur[0], prev = cur[1];
            for (int[] next : tree[node]) {
                int adj = next[0], weight = next[1];
                if (adj == prev) continue;
                dist[adj] = dist[node] + weight;
                stack.push(new int[]{adj, node});
            }
        }
    }

    // DFS(스택)로 부모 추적
    static void dfsParent(int start) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{start, 0}); // {현재노드, 부모}
        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            int node = cur[0], prev = cur[1];
            for (int[] next : tree[node]) {
                int adj = next[0], weight = next[1];
                if (adj == prev) continue;
                parent[adj] = node;
                stack.push(new int[]{adj, node});
            }
        }
    }
}
