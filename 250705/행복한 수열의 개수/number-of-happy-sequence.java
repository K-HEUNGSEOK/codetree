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
        if (m == 1){
            System.out.println(n+n);
            System.exit(0);
        }
        for(int i = 0; i < n ; i ++){
            boolean flag = false;
            int len = 1;
            for(int j = 1 ; j < n ; j ++){
                if (arr[i][j-1] == arr[i][j]){
                    len ++;
                }else{
                    len = 1;
                }
                if (len >= m){
                    flag = true;
                    break;
                }
            }
            if (flag){
                ans ++;
            }
        }

        for(int i = 0; i < n ; i ++){
            boolean flag = false;
            int len = 1;
            for(int j = 1 ; j < n ; j ++){
                if (arr[j-1][i] == arr[j][i]){
                    len ++;
                }else{
                    len = 1;
                }
                if (len >= m){
                    flag = true;
                    break;
                }
            }
            if (flag){
                ans ++;
            }
        }
        System.out.println(ans);

    }
}
