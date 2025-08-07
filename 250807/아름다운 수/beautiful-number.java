import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    static int n,ans;
    static int[] param;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ans = 0;
        param = new int[n];
        DFS(0);
        System.out.println(ans);
    }
    static boolean check(){
        int i = 0;
        int n = param.length;
        while (i < n){
            int d = param[i];
            if (i + d > n) return false;

            for(int j = i ; j < i + d; j ++){
                if (param[j] != d) return false;
            }
            i += d;
        }
        return true;
    }

    static void DFS(int v){
        if (v == n){
            if (check()){
                ans ++;
            }
        }else{
            for(int i = 1; i <= n ; i ++){
                param[v] = i;
                DFS(v + 1);
            }
        }
    }
}