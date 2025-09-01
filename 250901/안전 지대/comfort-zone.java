import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n, m, team, ans, cnt;
    static int [][] graph;
    static boolean[][] ch;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        team = 1;
        ans = 0;
        graph = new int[n][m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                graph[i][j] = sc.nextInt();
            }
        }

        for(int k = 1; k <= 100; k ++){
            ch = new boolean[n][m];
            cnt = 0;
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < m ; j ++){
                    if (graph[i][j] > k && !ch[i][j]){
                        cnt ++;
                        DFS(i,j,k);
                        //안전영역과 k 초기화
                        if (cnt > ans){
                            team = k;
                            ans = cnt;
                        }
                    }
                }
            }
        }
        System.out.println(team + " " + ans);
    }
    static void DFS(int x, int y, int k){
        ch[x][y] = true;
        for(int i = 0 ; i < 4; i ++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isRange(nx,ny) && !ch[nx][ny] && graph[nx][ny] > k){
                ch[nx][ny] = true;
                DFS(nx,ny,k);
            }
        }
    }

    static boolean isRange(int x,int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}