    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws FileNotFoundException {
     
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[1001];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            int ans = 0;
            for(int i = 1; i <= 10000; i ++){
                int count = 0;
                for(int j = 0 ; j < n ; j ++){
                    if (i <= arr[j] && arr[j] <= i + k) {
                        count++;
                    }
                }
                ans = Math.max(ans,count);
            }
            System.out.println(ans);
        }
    }