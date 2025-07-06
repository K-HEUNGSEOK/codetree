import java.io.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static int n, m;
    static int[] check = new int[101];
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
        m = sc.nextInt();
        int [][] arr= new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans= 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                check[j] = arr[i][j];
            }
            if (vaildian()){
                ans ++;
            }
        }

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                check[j] = arr[j][i];
            }
            if (vaildian()){
                ans ++;
            }
        }
        System.out.println(ans);
    }
    static boolean vaildian(){
        int cnt = 1;
        int max = 1;
        for(int i = 1 ; i < n; i ++){
            if (check[i-1] == check[i]){
                cnt ++;
            }
            else{
                cnt = 1;
            }
            max = Math.max(max,cnt);
        }
        return max >= m;
    }
}
