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


        for(int i = 0 ; i < n ; i ++){
            if (isCheck(i)) ans ++;
            if (isCheck2(i)) ans ++;
        }
        System.out.println(ans);
    }
    //가로 체크
    static boolean isCheck(int index){
        int cnt = 1;
        if (cnt == m) return true;
        for(int i = 0 ; i < n -1; i ++){
            if (arr[index][i] == arr[index][i +1]){
                cnt ++;
                if (cnt >= m) return true;
            }else{
                cnt =1;
            }
        }
        return false;
    }
    static boolean isCheck2(int index){
        int cnt =1;
        if (cnt == m) return true;
        for(int i = 0 ; i < n-1 ; i ++){
            if (arr[i][index] == arr[i+1][index]){
                cnt ++;
                if (cnt >= m)return true;
            }else{
                cnt = 1;
            }
        }
        return false;
    }
}