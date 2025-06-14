import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static int[] fibo;
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = i + 1; j < n ; j ++){
                for(int k = j + 1; k < n ; k ++){
                    if (check(arr[i],arr[j],arr[k])){
                        ans += Math.max(ans,getTotal(arr[i],arr[j],arr[k]));
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static int getTotal(int i, int i1, int i2) {
        return i + i1 + i2;
    }

    private static boolean check(int i, int j, int k) {
        //1. 자리수부터 정한다.
        int maxNum = Math.max(i,j);
        maxNum = Math.max(maxNum,k);
        while (maxNum > 0){
            int a = i % 10;
            int b = j % 10;
            int c = k % 10;
            int total = a + b + c;
            if (total > 9) {
                return false;
            }

            if (a > 0 ) i/=10;
            if (b > 0 ) j/=10;
            if (c > 0 ) k/=10;
            maxNum/=10;
        }
        return true;
    }
}