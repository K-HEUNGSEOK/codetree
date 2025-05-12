import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        for(int i = 0 ; i < n ; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        boolean ans = false;
        for(int i = 0; i < n ; i ++){
            int max1 = 0;
            int min2 = Integer.MAX_VALUE;
            boolean possible = false;
            for(int j = 0 ; j < n ; j ++){
                if (i == j) continue;
                //x1 값중에 가장 큰거
                //x2 값중에 가장 작은거
                max1 = Math.max(max1,x[j]);
                min2 = Math.min(min2,y[j]);
            }

            if (min2 >= max1){
                possible = true;
            }else {
                possible = false;
            }

            if (possible){
                ans = true;
            }
        }
        if (ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}

