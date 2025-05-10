import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = 1000000;
        for(int i = 1; i <= 10000; i ++){
            int cnt = 0;
            int section = 1;
            boolean check = true;
            for(int j = 0 ; j < n ; j ++){
                if (arr[j] > i){
                    check = false;
                break;
            }
                if (cnt + arr[j] > i){
                    cnt = 0;
                    section ++;
                }
                cnt += arr[j];
            }
            if (check && section <= m){
                ans = Math.min(ans,i);
            }
        }
        System.out.println(ans);
    }
} 