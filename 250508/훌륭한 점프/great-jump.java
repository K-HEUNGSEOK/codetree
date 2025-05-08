    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        static int n ;
        static int k;
        static int[ ] arr;
        public static void main(String[] args) throws FileNotFoundException {
           
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            k = sc.nextInt();
            arr = new int[101];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            int max = Integer.MAX_VALUE;
            for(int a = Math.max(arr[0],arr[n-1]); a <= 100; a++){
                    if (isPossible(a)){
                        max = Math.min(max,a);
                    }
            }
            System.out.println(max);
        }

        private static boolean isPossible(int value) {
            int[] check = new int[101];
            int cnt = 0;
            for(int i = 0 ; i < n ; i ++){
                if (arr[i] <= value){
                    check[cnt++] = i;
                }
            }

            for(int i = 1 ; i < cnt; i ++){
                int digit = check[i] - check[i-1];

                if (digit > k){
                    return false;
                }
            }
            return true;
        }
    }