    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws FileNotFoundException {
    
            Scanner sc = new Scanner(System.in);
            int n =  sc.nextInt();
            int m = sc.nextInt();

            int [] arr = new int[101];

            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            int ans = 0 ;
            for(int i = 0 ; i < n ; i ++){
                int total = 0;
                int pos = i;
                for(int j = 0 ; j < m ; j ++){
                    total += arr[pos];
                    pos = arr[pos]-1;
                }
                ans = Math.max(total,ans);
            }
            System.out.println(ans);
        }
    }