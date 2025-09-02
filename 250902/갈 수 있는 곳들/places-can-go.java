import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n, k, cnt;
    static int[][] graph;
    static boolean[][] ch;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        cnt = 0;
        graph = new int[n][n];
        ch = new boolean[n][n];

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                graph[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < k ; i ++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            queue.offer(new int[]{x,y});
            if (!ch[x][y]){
                ch[x][y] = true;
                cnt ++;
            }
        }
        BFS();
        System.out.println(cnt);
    }
    static void BFS(){
        while (!queue.isEmpty()){
            int[] poll = queue.poll();
            int x = poll[0];
            int y = poll[1];
            for(int i = 0 ; i < 4; i ++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (isRange(nx,ny) && graph[nx][ny] == 0 && !ch[nx][ny]){
                    ch[nx][ny] = true;
                    queue.offer(new int[]{nx,ny});
                    cnt ++;
                }
            }
        }
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}