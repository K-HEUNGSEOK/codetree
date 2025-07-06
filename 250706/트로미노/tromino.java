import java.io.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static int n,m;
    static int[][] arr;
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
       int max= 0;
        max = Math.max(check(),check2());
        System.out.println(max);

    }
    static int check2(){
        int max = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if (i + 1 < n && j + 1 < m){
                    int s = arr[i][j] + arr[i+1][j] + arr[i+1][j+1];
                    max = Math.max(max,s);
                }

                if (i + 1 < n && j + 1 < m){
                    int s = arr[i][j] + arr[i+1][j] + arr[i][j+1];
                    max = Math.max(max,s);
                }

                if (i + 1 < n && j + 1 < m){
                    int s = arr[i][j] + arr[i][j+1] + arr[i+1][j+1];
                    max = Math.max(max,s);
                }
                if (i + 1 < n && j + 1 < m){
                    int s = arr[i][j] + arr[i][j+1] + arr[i+1][j+1];
                    max = Math.max(max,s);
                }
                if (i -1 >= 0 && j + 1 < m){
                    int s = arr[i][j] + arr[i][j+1] + arr[i-1][j+1];
                    max = Math.max(max,s);
                }
            }
        }
        return max;
    }
    static int check(){
        int max = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                //가로
                if (j + 2 < m){
                    int s = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                    max = Math.max(max,s);
                }
                //세로
                if (i + 2 < n){
                    int s = arr[i][j] + arr[i+1][j] + arr[i+2][j];
                    max = Math.max(max,s);
                }
                //대각선
                if (i + 2 < n && j + 2 < m){
                    int s = arr[i][j] + arr[i+1][j+1] + arr[i+2][j+2];
                    max =Math.max(max,s);
                }
                if (i - 2 >= 0 && j + 2 < m){
                    int s = arr[i][j] + arr[i-1][j+1] + arr[i-2][j+2];
                    max =Math.max(max,s);
                }
            }
        }
        return max;
    }
    static boolean isRange(int x, int y ){
        return 0 <= x && x < n && 0 <= y && y < m;
    }
}
