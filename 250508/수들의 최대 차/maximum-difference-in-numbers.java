    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
            
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            for(int a = 1; a <= 10000; a++){
                int cnt = 0;
                for(int i = 0 ; i < n ; i ++){
                    if (a <= arr[i] && arr[i] <= a + k){
                        cnt ++;
                    }
                }
                ans = Math.max(ans,cnt);
            }
            System.out.println(ans);
        }
    }