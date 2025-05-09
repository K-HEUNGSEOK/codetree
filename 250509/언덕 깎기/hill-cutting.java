    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws IOException {
    
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[]arr = new int [n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            int ans = Integer.MAX_VALUE;
            for(int i = 0 ; i <= 100; i ++){
                int cost = 0;
                for(int j = 0 ; j < n ; j ++){
                    if (i <= arr[j] && arr[j] <= i + 17){
                        continue;
                    }
                    if (arr[j] < i){
                        int number = i - arr[j];
                        cost = cost + (number * number);
                    }else if(arr[j] > i + 17){
                        int num = arr[j] - (i + 17);
                        cost = cost + (num * num);
                    }

                }
                ans = Math.min(ans,cost);
            }
            System.out.println(ans);
        }
    }