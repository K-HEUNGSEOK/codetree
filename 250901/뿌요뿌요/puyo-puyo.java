import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n , ans, number, cnt;
    static int[][] graph;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
  
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = 0;
        number = 0;
        graph = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                graph[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if (graph[i][j] != 0){
                    //여기서 해야할게 cnt가 4이상이면 터트려야하고, 블록의 크기는 그냥 갱신해야한다.
                    cnt = 1;
                    DFS(i,j);
                    if (cnt >= 4){
                        ans ++;
                    }
                    number = Math.max(number,cnt);
                }
            }
        }
        System.out.println(ans + " " + number);

    }
    static void DFS(int x , int y){

        int target = graph[x][y];
        graph[x][y] = 0;
        for(int i = 0 ; i < 4; i ++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isRange(nx,ny) && graph[nx][ny] == target){
                cnt ++;
                DFS(nx,ny);
            }
        }
    }
    static boolean isRange(int x,int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}