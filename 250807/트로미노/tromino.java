import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[][] grid = new int[200][200];
    static int[][][] shapes = new int[][][]{
            {{1, 1, 0},{1, 0, 0}, {0, 0, 0},},
            {{1, 1, 0},{0, 1, 0}, {0, 0, 0},},
            {{1, 0, 0},{1, 1, 0}, {0, 0, 0},},
            {{0, 1, 0},{1, 1, 0}, {0, 0, 0},},
            {{1, 1, 1}, {0, 0, 0}, {0, 0, 0},},
            {{1, 0, 0}, {1, 0, 0}, {1, 0, 0},}};

    public static void main(java.lang.String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                grid[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m; j ++){
                ans = Math.max(ans, getMaxSum(i,j));
            }
        }
        System.out.println(ans);
    }
    static int getMaxSum(int x, int y){
        int maxSum = 0;
        for(int i = 0 ; i < 6; i ++){
            boolean flag = true;
            int sum = 0;
            for(int dx = 0; dx < 3; dx++){
                for(int dy = 0; dy< 3; dy ++){
                    if (shapes[i][dx][dy] == 0) continue;
                    if (x + dx >= n || y + dy >= m){
                        flag = false;
                    }else{
                        sum += grid[x + dx][y + dy];
                    }
                }
            }
                if (flag) maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}