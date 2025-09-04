import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int n, m, ans;
    static int[][] arr;
    static int[] seq = new int[100];
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                seq[j] = arr[i][j];
            }
            if (isCheck()){
                ans ++;
            }
        }
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                seq[j] = arr[j][i];
            }
            if (isCheck())ans ++;
        }
        System.out.println(ans);
    }
    static boolean isCheck(){
        int cnt = 1;
        int maxCnt = 1;
        for(int i = 1; i < n; i ++){
            if (seq[i-1] == seq[i]) cnt ++;
            else cnt =1;
            maxCnt = Math.max(maxCnt, cnt);
        }
        if (maxCnt >= m ) return true;
        return false;
    }
}