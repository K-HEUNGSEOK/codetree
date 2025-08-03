import javax.swing.*;
import java.io.FileInputStream;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    public static void main(java.lang.String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        n = sc.nextInt();
        arr = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < n -2; i ++){
            for(int j = 0 ; j < n -2; j ++){
                int number = getMoney(i,j, i +2 , j + 2);

                ans = Math.max(ans, number);
            }
        }
        System.out.println(ans);
    }
    static int getMoney(int rows, int cols , int rowe, int cole){
        int cnt = 0;
        for(int i = rows ; i <= rowe; i ++){
            for(int j = cols; j <= cole ; j++){
                if (arr[i][j] == 1){
                    cnt ++;
                }
            }
        }
        return cnt;
    }
}