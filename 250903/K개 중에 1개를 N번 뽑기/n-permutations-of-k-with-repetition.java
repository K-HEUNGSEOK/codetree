import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n , k;
    static int[] param;
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        param = new int[k];
        DFS(0);
    }
    static void DFS(int v){
        if (v == k){
            for(int i = 0 ; i < k; i ++){
                System.out.print(param[i] + " ");
            }
            System.out.println();
        }else{
            for(int i = 1; i <= n; i ++){
                param[v] = i;
                DFS(v + 1);
            }
        }
    }
}