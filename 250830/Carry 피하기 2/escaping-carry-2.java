import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = -1;

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                for(int k = 0 ; k < n ; k ++){
                    if (i == j || j == k || i == k) continue;

                    //1.캐리 검사
                    if (carryCheck(arr[i], arr[j], arr[k])){
                        ans = Math.max(ans, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }
        System.out.println(ans);
    }
    static boolean carryCheck(int a, int b, int c){
        while (a != 0 || b != 0 || c != 0){
            int f = a % 10;
            int s = b % 10;
            int t = c % 10;

            if (f + s + t >= 10) return false;

            a /= 10;
            b /= 10;
            c /= 10;
        }
        return true;
    }
}