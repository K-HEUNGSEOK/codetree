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
        //1. k 0 ~ 20 까지 한다고 했을때 n * n 만큼 다 돌면서 k 를 늘려가야됨
        //2. k를 기준으로 각 칸마다 최대 채굴 비용을 계산하고 그 안에 있는 금을 계산하고 최대값을 갱신한다.
        //3. 반복한다.

        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                for(int k = 0 ; k < 20; k ++){
                    int numOfGold = getNumgold(i,j,k);

                    if (numOfGold * m >= getArea(k)){
                        ans = Math.max(ans,numOfGold);
                    }
                }
            }
        }
        System.out.println(ans);
    }
    static int getNumgold(int x, int y , int k){
        int gold = 0;
        for(int i = 0; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if (Math.abs(i - x) + Math.abs(j - y) <= k){
                    gold += arr[i][j];
                }
            }
        }
        return gold;
    }
    static int getArea(int k){
        return k * k + (k + 1) * (k + 1);
    }

}