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

        for(int i = 0; i < n ; i ++){
            boolean flag = false;
            int len = 1;
            for(int j = 1 ; j < n ; j ++){
                if (arr[i][j-1] == arr[i][j]){
                    len ++;
                }
                if (len >= m){
                    flag = true;
                    break;
                }else{
                    len = 1;
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
                }
                if (len >= m){
                    flag = true;
                    break;
                }else{
                    len = 1;
                }
            }
            if (flag){
                ans ++;
            }
        }
        System.out.println(ans);

    }
}
