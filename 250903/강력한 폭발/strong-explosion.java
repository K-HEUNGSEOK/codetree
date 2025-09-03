import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n, ans;
    static int[][] graph;
    static List<int[]> list = new ArrayList<>();
    static int[] param;
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        //폭탄을 터트리면 다 2로 바꿔버리고 숫자세고 다시 0으로 바꿔놓는 그런식으로 해야할듯

        //1번 폭탄 세로 4개 x -2; x +2;
        //2번 폭탄 상하좌우
        //3번 폭탄
        n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }

        ans = 0;
        graph = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                graph[i][j] = sc.nextInt();
                if (graph[i][j] == 1){
                    list.add(new int[]{i,j});
                }
            }
        }
        param= new int[list.size()];
        DFS(0);
        System.out.println(ans);
    }
    static void DFS(int v){
        if (v == list.size()){
            //1.맵 복사
            int[][] copy = new int[n][n];
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    copy[i][j] = graph[i][j];
                }
            }
            //2.폭탄 터트리기
            for(int i = 0 ; i < list.size(); i ++){
                int[] boom = list.get(i);
                int type = param[i];
                maxBoom(copy, type, boom[0], boom[1]);
            }
            int cnt = 0;
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    if (copy[i][j] == -1) cnt ++;
                }
            }
            ans = Math.max(ans,cnt);
            return;
        }else{
            for(int i =1 ; i<= 3; i ++){
                param[v] = i;
                DFS(v+1);
            }
        }
    }
    static int maxBoom(int[][] copy, int type, int x, int y){
        int[] dx = new int[4];
        int[] dy = new int[4];
        copy[x][y] = -1;
        switch (type){
            case 1:
                dx = new int[]{-2,-1,1,2};
                dy = new int[]{0,0,0,0};
                break;
            case 2:
                dx = new int[]{-1,0,1,0};
                dy = new int[]{0,1,0,-1};
                break;
            case 3:
                dx = new int[]{-1,-1,1,1};
                dy = new int[]{-1,1,1,-1};
                break;
        }
        for(int i = 0 ; i < 4 ; i ++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (!isRange(nx,ny) || copy[nx][ny] != 0) continue;
            copy[nx][ny] = -1;
        }
        int cnt = 0;
        for(int i = 0 ; i < n; i ++){
            for(int j = 0; j < n; j ++){
                if (copy[i][j] == -1) cnt ++;
            }
        }
        return cnt;
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y< n;
    }
}