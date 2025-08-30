import java.io.*;
import java.util.*;

public class Main {
    static int ans, n, height, width;
    static int[][] arr;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        n = 20;
        ans = 0;
        height = 0;
        width = 0;
        arr = new int[n][n];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 1; i < n ; i ++){
            for(int j = 1; j < n ; j ++){
                if (arr[i][j] != 0 && logic(i, j)){
                    return;
                }
            }
        }
    }
    static boolean logic(int x , int y){
        int color = arr[x][y];

        for(int i = 0 ; i < 8; i ++){
            int cnt = 1;
            int curx = x;
            int cury = y;
            while (true){
                int nx = curx + dx[i];
                int ny = cury + dy[i];
                if (!isRange(nx,ny)) break;
                if (arr[nx][ny] != color) break;

                cnt ++;

                curx = nx;
                cury = ny;
            }
            if (cnt >= 5){
                System.out.println(color);
                System.out.print((x + 2 * dx[i]) + " " + (y + 2 * dy[i]));
                return true;
            }
        }
        return false;
    }

    static boolean isRange(int x, int y) {
        return 1 <= x && x < n && 1 <= y && y < n;
    }
}