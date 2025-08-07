import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    static int k,n;
    static int[] param;
    public static void main(String[] args) throws IOException {
  
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        param = new int[n];
        DFS(0);
    }
    static void DFS(int v){
        if(v == n) {
            for(int i = 0 ; i < n ; i ++){
                System.out.print(param[i] + " ");
            }
            System.out.println();
        }else{
            for(int i = 1; i <= k ; i ++){
                param[v] = i;
                DFS(v + 1);
            }
        }
    }
}