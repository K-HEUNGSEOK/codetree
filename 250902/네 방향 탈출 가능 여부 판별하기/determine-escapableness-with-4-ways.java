import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n, m ;
    static boolean flag;
    static int[][] graph;
    static boolean[][] ch;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        flag = false;
        graph = new int[n][m];
        ch= new boolean[n][m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                graph[i][j] = sc.nextInt();
            }
        }
        BFS(0,0);
        if (flag){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        ch[x][y] = true;
        while (!queue.isEmpty()){
            int[] poll = queue.poll();
            for(int i = 0 ; i < 4 ; i++){
                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];
                if (nx == n -1 && ny == m -1){
                    flag = true;
                    return;
                }
                if (isRange(nx,ny) && graph[nx][ny] == 1 && !ch[nx][ny]){
                    ch[nx][ny] = true;
                    queue.offer(new int[]{nx,ny});
                }
            }
        }
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }

}