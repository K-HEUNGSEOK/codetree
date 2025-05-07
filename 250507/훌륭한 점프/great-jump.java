    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        static int n;
        static int[] arr;
        static int k;
        public static void main(String[] args) throws FileNotFoundException {
        
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            k = sc.nextInt();
            arr = new int[101];

            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }

            for(int a = Math.max(arr[0],arr[n-1]) ; a <= 100; a++){
                if (isCheck(a)){
                    System.out.println(a);
                    break;
                }
            }
        }

        private static boolean isCheck(int a) {
            int lastIdx = 0;
            for(int i = 1; i < n ; i ++){
                if (arr[i] <= a){
                    if (i - lastIdx > k){
                        return false;
                    }
                    lastIdx = i;
                }
            }
            return true;
        }
    }