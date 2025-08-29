import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            int total = arr[i];
            for(int j = i + 2 ; j < n ; j ++){
                ans = Math.max(ans, total + arr[j]);
            }
        }
        System.out.println(ans);
    }
}