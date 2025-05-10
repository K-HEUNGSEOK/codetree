import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i <= 10000; i ++){
            int cost = 0;
            for(int j = 0 ;  j < n ; j ++){
                if (i <= arr[j] && arr[j] <= i + k){
                    continue;
                }

                if (arr[j] < i){
                    cost += Math.abs(arr[j] - i);
                }else if (arr[j] > i + k){
                    cost += Math.abs((i + k) - arr[j]);
                }
            }
            ans = Math.min(ans,cost);
        }
        System.out.println(ans);
    }
}

