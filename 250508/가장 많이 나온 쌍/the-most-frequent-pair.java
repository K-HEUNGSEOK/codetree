    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
        
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] x = new int[m];
            int[] y = new int[m];

            for(int i = 0 ; i < m ; i ++){
                x[i] =sc.nextInt();
                y[i] =sc.nextInt();
            }
            int ans = 0;
            for (int a = 1; a <= n ; a++){
                for(int b = a + 1; b <= n ; b++){
                    int count = 0;
                    for(int k = 0 ; k < m ; k ++){
                        if (a == x[k] && b == y[k] || b == x[k] && a == y[k] ){
                            count ++;
                        }
                    }
                    ans = Math.max(ans,count);
                }
            }
            System.out.println(ans);
        }
    }