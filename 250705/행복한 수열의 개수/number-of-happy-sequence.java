import java.io.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            int cnt = 1;
            for(int j = 0 ; j <= n -m ; j ++){
                for(int k = j+1 ; k <=n-m+j ; k ++){
                    if (k >= n) break;
                    if (arr[i][k] == arr[i][k-1]){
                        cnt ++;
                    }
                }
            }
            if (cnt >= m){
                ans ++;
            }
        }

        for(int i = 0 ; i < n ; i ++){
            int cnt = 1;
            for(int j = 0 ; j <= n -m ; j ++){
                for(int k = j+1 ; k <=n-m+j ; k ++){
                    if (k >= n) break;
                    if (arr[k][i] == arr[k-1][i]){
                        cnt ++;
                    }
                }
            }
            if (cnt >= m){
                ans ++;
            }
        }
        System.out.println(ans);

    }
}
