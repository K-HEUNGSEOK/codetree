import javax.swing.*;
import java.io.FileInputStream;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    static int n;
    public static void main(java.lang.String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                int cnt = 0 ; // 여기서 최대 갯수 세기
                for(int k = i ; k < 3 + i ; k ++){
                    for(int l = j ; l < 3 + j; l ++){
                        if (k >= n || l >= n) continue;
                        if (arr[k][l] == 1){
                            cnt ++;
                        }
                    }
                }
                ans = Math.max(ans, cnt);
            }
        }
        System.out.println(ans);
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}