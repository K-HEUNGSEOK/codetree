import javax.print.DocFlavor;
import java.io.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
  
        Scanner sc = new Scanner(System.in);
        int offset = 100;
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0 ; i < n ; i ++){
            x[i] = sc.nextInt() + offset;
            y[i] = sc.nextInt() + offset;
        }
        int[] simulation = new int[201];
        for(int i = 0 ; i < n ; i ++){
            for(int j = x[i]; j < y[i] ; j++){
                simulation[j] ++;
            }
        }
        int max = 0;
        for(int i = 0 ; i < 201; i ++){
            if (max < simulation[i]){
                max = simulation[i];
            }
        }
        System.out.println(max);
    }
}
