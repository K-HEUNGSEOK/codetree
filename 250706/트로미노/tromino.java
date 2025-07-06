import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 200;

    public static int n, m;
    public static int[][] grid = new int[MAX_NUM][MAX_NUM];

    // 가능한 모든 모양을 전부 적어줍니다.
    static int[][][] arr = {
            {{1,1,0}, {1,0,0}, {0,0,0}},
            {{1,1,0},{0,1,0},{0,0,0}},
            {{0,1,0},{1,1,0},{0,0,0}},
            {{1,0,0},{1,1,0},{0,0,0}},
            {{1,1,1},{0,0,0},{0,0,0}},
            {{1,0,0},{1,0,0},{1,0,0}},
            };

    // 주어진 위치에 대하여 가능한 모든 모양을 탐색하며 최대 합을 반환합니다.
    public static int getMaxSum(int x, int y) {
        int max = 0;

        for(int i = 0; i < 6 ; i ++){
            boolean flag = true;
            int sum = 0;
            for(int dx = 0 ; dx < 3; dx ++){
                for(int dy = 0; dy < 3; dy ++){
                    if (arr[i][dx][dy] == 0) continue;
                    if (x + dx >= n || y + dy >= m) flag = false;
                    else{sum += grid[x+dx][y+dy];}
                }
            }
            if (flag){
                max = Math.max(max,sum);
            }
        }
        return max;
    }

    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        int ans = 0;

        // 격자의 각 위치에 대하여 탐색하여줍니다.
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                ans = Math.max(ans, getMaxSum(i, j));

        System.out.print(ans);
    }
}
