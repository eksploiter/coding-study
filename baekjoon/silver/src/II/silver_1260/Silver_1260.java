// DFS 와 BFS

// 분류
// 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

// 문제 설명
// 그래프를 DFS 로 탐색한 결과와 BFS 로 탐색한 결과를 출력하는 프로그램을 작성하시오.
// 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
// 더 이상 방문할 수 있는 점이 없는 경우 종료한다.
// 정점 번호는 1부터 N 번 까지이다.

// 출력
// 첫재 줄에 DFS 를 수행한 결과를, 그 다음 줄에는 BFS 를 수행한 결과를 출력한다.
// V부터 방문된 점을 순서대로 출력하면 된다.

package II.silver_1260;

import java.util.*;

public class Silver_1260 {
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static boolean[] visited;

    // DFS 함수 -> 깊이 우선 탐색
    public static void dfs(int v) {
        visited[v] = true;
        System.out.println(v + " ");

        for (int next : graph.get(v)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    // BFS 함수 -> 너비 우선 탐색
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.println(v + " ");

            for (int next : graph.get(v)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int V = scanner.nextInt();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        // DFS 수행
        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();

        // BFS 수행
        visited = new boolean[N + 1];
        bfs(V);
    }
}
