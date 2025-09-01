import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n, cnt, ans;
    static StringBuilder sb = new StringBuilder();
    static int[][] graph;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        graph = new int[n][n];
        ans = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                graph[i][j] = sc.nextInt();
            }
        }
        boolean flag = false;

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0; j < n ; j ++){
                if (graph[i][j] == 1){
                    ans ++;
                    flag = true;
                    cnt = 1;
                    DFS(i,j);
                    sb.append(cnt).append(" ");
                }
            }
        }

        if (!flag) {
            System.out.println(0);
            return;
        }
        System.out.println(ans);
        String[] split = sb.toString().split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < split.length; i ++){
            list.add(Integer.parseInt(split[i]));
        }
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i + " ");
        }
    }
    static boolean isRange(int x,int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
    static void DFS(int x, int y){
        graph[x][y] = 0;
        for(int i = 0 ; i < 4; i ++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isRange(nx,ny) && graph[nx][ny] == 1){
                cnt ++;
                graph[nx][ny] = 0;
                DFS(nx,ny);
            }
        }
    }
}