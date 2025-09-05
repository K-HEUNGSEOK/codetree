import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[][] arr;
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
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                for(int k = 0 ; k <= 2 * (n-1); k ++){
                    int gold = getGold(i,j,k);

                    if (gold * m >= getArea(k)){
                        ans = Math.max(ans,gold);
                    }
                }
            }
        }
        System.out.println(ans);
    }
    static int getArea(int k){
        return k * k + (k+1) * (k+1);
    }
    static int getGold(int x, int y, int k){
        int gold = 0;
        for(int i = 0; i < n ; i ++){
            for(int j = 0 ; j< n ; j ++){
                if (Math.abs(i - x ) + Math.abs(j - y) <= k){
                    gold += arr[i][j];
                }
            }
        }
        return gold;
    }
}