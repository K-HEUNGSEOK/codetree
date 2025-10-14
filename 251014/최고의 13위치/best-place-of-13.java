
    import java.io.*;
    import java.io.FileInputStream;
    import java.io.IOException;
    import java.util.Scanner;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
  
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < n ; j ++){
                    arr[i][j] = sc.nextInt();
                }
            }

            int ans = 0;

            for(int i = 0 ; i < n; i ++){
                for(int j = 0 ; j <= n - 3; j ++){
                    int sum = 0;
                    for(int k = j; k < j + 3; k ++){
                        sum += arr[i][k];
                    }
                    ans = Math.max(ans,sum);
                }
            }
            System.out.println(ans);

        }
    }