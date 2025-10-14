
    import java.io.*;
    import java.io.FileInputStream;
    import java.io.IOException;
    import java.util.Scanner;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
    
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] arr = new char[n][m];
            for(int i = 0 ; i < n ; i ++){
                for(int j = 0 ; j < m ; j ++){
                    arr[i][j] = sc.next().charAt(0);
                }
            }
          

            int ans = 0;

            for(int i = 1; i < n ; i ++){
                for(int j = 1; j < m ; j ++){
                    for(int k = i + 1; k < n-1 ; k++){
                        for(int l = j +1; l < m-1; l ++){
                            if(arr[0][0] != arr[i][j] && arr[i][j] != arr[k][l] && arr[k][l] != arr[n-1][m-1]) ans ++;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }