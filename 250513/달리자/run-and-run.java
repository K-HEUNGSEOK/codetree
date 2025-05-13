import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i ++){
            b[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;

        for(int i = 0 ; i <= 100000; i ++){
            int cost = 0;
            int[] copyA = Arrays.copyOf(a,n);
            int[] copyB = Arrays.copyOf(b,n);
            for(int j = 0; j < n-1 ; j ++){
                if (copyA[j] != copyB[j]){
                    int num = Math.abs(copyA[j] - copyB[j]);
                    cost += num;
                    copyA[j+1] += copyA[j] - copyB[j];

                }
            }
            if (cost == i){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}