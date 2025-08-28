import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1 ; i <= n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;

        
        for(int i = 1; i <= n ; i ++){
            int temp = 0;
            for(int j = 1; j <= n ; j ++){
                if(i == j) continue;
                
                temp += arr[j] * Math.abs(i-j);
           
            }
            ans = Math.min(ans, temp);
        }

        System.out.print(ans);
    }

}