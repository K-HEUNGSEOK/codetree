import javax.swing.*;
import java.io.*;

import java.lang.reflect.Method;
import java.util.*;

public class Main {
    static int n, m, ans;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        ans = 0;
        if (m == 1){
            System.out.println(n + n);
            return;
        }
        for(int i = 0; i < n ; i ++){
           ans = Math.max(ans, happySequence(i));
        }
        System.out.println(ans);
    }
    static int happySequence(int index){
        int[] width = new int[10];
        int[] height = new int[10];
        int cnt= 0;
        //각각 가로 와 세로를 봐야함
        for(int i = 0; i < n; i ++){
           int num = arr[i][0];
           height[num] ++;
        }
        for(int i = 0; i < n ; i++){
            int num = arr[index][i];
            width[num] ++;
        }
        for(int i = 0 ; i < 10 ; i ++){
            if (width[i] >= m){
                cnt ++;
                break;
            }
        }
        for(int i = 0 ; i < 10 ; i ++){
            if (height[i] >= m){
                cnt ++;
                break;
            }
        }
        return cnt;
    }
}