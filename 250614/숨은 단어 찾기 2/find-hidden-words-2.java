import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static char[][] arr;
    static int n, m;
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};

    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new char[n][m];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.next().toCharArray();
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++) {
                if (arr[i][j] != 'L') continue;
                for(int k = 0 ; k < 8; k ++){
                    int cnt = 0;
                    int curX = i;
                    int curY = j;
                    for(int l = 0 ; l < 2; l ++) {
                        int nx = curX + dx[k];
                        int ny = curY + dy[k];
                        if (!isRange(nx, ny)) break;
                        if (arr[nx][ny] != 'E') break;
                        cnt ++;
                        curX = nx;
                        curY = ny;
                    }
                    if (cnt >= 2){
                        ans ++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    static boolean isRange(int x , int y){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}