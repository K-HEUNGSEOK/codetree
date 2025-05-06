import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0 ; i < n ; i ++){
            x[i] =sc.nextInt();
            y[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i <= 10; i ++){
            boolean a = true;
            int cnt = i;
            int check = cnt * 2;
            for(int j = 0 ; j < n ; j ++){
                if (x[j] > check || y[j] < check){
                    a = false;
                    break;
                }
                check *= 2;
            }

            if (a){
                ans = Math.min(ans,i);
            }
        }
        System.out.println(ans);
    }
}