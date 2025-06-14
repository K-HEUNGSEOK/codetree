import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static int[][] arr;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < 19; i ++){
            for(int j = 0 ; j < 19 ; j ++){
                if (arr[i][j] != 0){
                    int current = arr[i][j];
                    int curx = i;
                    int cury = j;
                    for(int k = 0 ; k < 4; k ++){
                        int nx = curx + dx[k];
                        int ny = cury + dy[k];
                        int cnt = 1;
                        for(int l = 0 ; l < 4; l ++){
                            if (!isRange(nx,ny))break;
                            if (arr[nx][ny] != current) break;
                            nx += dx[k];
                            ny += dy[k];
                            cnt ++;
                        }
                        if (cnt == 5){
                            System.out.println(current);
                            System.out.print((i + 2 * dx[k] + 1) + " " + (j + 2 * dy[k] + 1));
                            System.exit(0);
                        }
                    }
                }
            }
        }

    }
    static boolean isRange(int nx, int ny){
        return 0 <= nx && nx < 19 && 0 <= ny && ny < 19;
    }
}