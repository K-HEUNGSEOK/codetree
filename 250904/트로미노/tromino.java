import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][][] tromino = {
            {
                    {1, 0, 0},
                    {1, 1, 0},
                    {0, 0, 0}
            },
            {
                    {1, 1, 0},
                    {1, 0, 0},
                    {0, 0, 0}
            },
            {
                    {1, 1, 0},
                    {0, 1, 0},
                    {0, 0, 0}
            },
            {
                    {0, 1, 0},
                    {1, 1, 0},
                    {0, 0, 0}
            },
            {
                    {1, 1, 1},
                    {0, 0, 0},
                    {0, 0, 0}
            },
            {
                    {1, 0, 0},
                    {1, 0, 0},
                    {1, 0, 0},
            }
    };
    static int n,m,ans;
    static int SIZE = 6;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m=  sc.nextInt();
        ans =0;
        arr = new int[n][m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < n; i ++){
            for(int j = 0 ; j < m ; j ++){
                ans = Math.max(ans, getMaxSum(i,j));
            }
        }
        System.out.println(ans);
    }
    static int getMaxSum(int x, int y){
        int cnt = 0;
        for(int i = 0 ; i < SIZE; i ++){
            int sum = 0;
            boolean check = true;
            for(int j = 0; j < 3; j ++){
                for(int k = 0 ; k < 3; k ++){
                    if (tromino[i][j][k] == 0) continue;
                    if (x + j >= n || k + y >= m) check = false;
                    else{
                        sum += arr[x + j][k + y];
                    }
                }
            }
            if (check) cnt = Math.max(cnt,sum);
        }
        return cnt;
    }
}