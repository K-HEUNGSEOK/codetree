
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; i ++){
            int sum = 0;
            for(int j = 0 ; j < n ; j ++){
                if(i == j) continue;
                sum += arr[j] * Math.abs(j - i);
            }
            ans = Math.min(ans,sum);
        }
        System.out.println(ans);

    }
}