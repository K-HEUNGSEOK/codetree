import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n,m;
    static int[][] graph;
    static boolean flag;
    static int[] dx = {1,0};
    static int[] dy = {0,1};
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n][m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                graph[i][j] = sc.nextInt();
            }
        }
        flag= false;
        DFS(0,0);
        System.out.println(flag ? 1 : 0);
    }
    static void DFS(int x, int y){
            graph[x][y] = 0;
            for(int i = 0; i < 2; i ++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx == n-1 && ny == n-1){
                    flag = true;
                    return;
                }
                if (isRange(nx,ny) && graph[nx][ny] == 1){
                    graph[nx][ny] = 0;
                    DFS(nx,ny);
                }
            }
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}