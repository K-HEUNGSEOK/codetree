import java.util.*;
import java.io.*;

public class Main {
    static int N, K;
    static int[][] arr;
    
    static class Pair implements Comparable<Pair> {
        int n, m, num;

        public Pair(int n, int m, int num) {
            this.n = n;
            this.m = m;
            this.num = num;
        }

        @Override
        public int compareTo(Pair pair) {
            if (this.num != pair.num) {
                return pair.num - this.num; // 1. 값(num) 내림차순
            } else if (this.n != pair.n) {
                return this.n - pair.n;     // 2. 행(n) 오름차순
            }
            return this.m - pair.m;         // 3. 열(m) 오름차순
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int row = sc.nextInt() - 1;
        int col = sc.nextInt() - 1;

        // K번 이동 시작
        for (int i = 0; i < K; i++) {
            // --- 매 이동마다 새로 준비해야 할 것들 ---
            // 1. 이번 턴에 갈 수 있는 후보들을 담을 우선순위 큐 (가장 큰 버그 수정!)
            PriorityQueue<Pair> pq = new PriorityQueue<>();
            // 2. 이번 턴의 BFS 탐색을 위한 방문 기록
            boolean[][] visited = new boolean[N][N];
            // 3. 이번 턴의 BFS 탐색을 위한 큐
            Queue<Pair> q = new LinkedList<>();

            // 현재 위치를 BFS 시작점으로 설정
            visited[row][col] = true;
            q.add(new Pair(row, col, arr[row][col]));
            
            int startNum = arr[row][col]; // 이번 턴의 이동 기준이 되는 숫자

            // BFS를 통해 현재 위치에서 갈 수 있는 '모든' 영역 탐색
            while (!q.isEmpty()) {
                Pair current = q.poll();
                
                int[] dy = {0, 1, 0, -1};
                int[] dx = {1, 0, -1, 0};

                for (int d = 0; d < 4; d++) {
                    int ny = current.n + dy[d];
                    int nx = current.m + dx[d];

                    // 이동 가능 조건: 범위 안 && 방문 안함 && 기준 숫자보다 작음
                    if (0 <= ny && ny < N && 0 <= nx && nx < N && !visited[ny][nx] && arr[ny][nx] < startNum) {
                        visited[ny][nx] = true;
                        // 다음 탐색을 위해 BFS 큐에 추가
                        q.add(new Pair(ny, nx, arr[ny][nx]));
                        // 최종 후보지로 삼기 위해 우선순위 큐에도 추가
                        pq.add(new Pair(ny, nx, arr[ny][nx]));
                    }
                }
            }

            // BFS 종료 후, 이동할 후보지가 없으면 전체 이동을 멈춤
            if (pq.isEmpty()) {
                break;
            }

            // 우선순위 큐에서 최고의 후보지를 꺼내 다음 위치로 삼음
            Pair nextPos = pq.poll();
            row = nextPos.n;
            col = nextPos.m;
        }

        // 모든 이동이 끝난 후 최종 위치를 출력
        System.out.print((row + 1) + " " + (col + 1));
    }
}