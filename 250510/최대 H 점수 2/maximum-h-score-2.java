import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int l;
    static int[] arr;
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 1; i <= 100; i ++){
            if (isCheck(i)){
                ans = Math.max(ans,i);
            }
        }
        System.out.println(ans);

    }

    private static boolean isCheck(int num) {
        int cnt = 0;
        int newCnt = 0;
        for(int i = 0 ; i < n ; i ++){
            if (arr[i] >= num){
                cnt ++;
            }
            if (arr[i] == num -1){
                newCnt ++;
            }
        }
        if (cnt >= num){
            return true;
        }
        int need = num - cnt; // 부족분
        if (need > l){
            return false;
        }

        if (newCnt < need){
            return false;
        }
        return true;
    }
}

