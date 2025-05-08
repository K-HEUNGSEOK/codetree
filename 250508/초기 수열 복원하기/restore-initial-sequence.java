    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws FileNotFoundException {
         
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] sum = new int[n -1];
            int [] arr = new int[n];

            for(int i = 0 ; i < n -1; i ++){
                sum[i] = sc.nextInt();
            }

            for(int a = 1; a <= 1000; a ++){
                arr[0] = a;
                boolean[] checked = new boolean[1001];
                checked[a] = true;
                boolean end = true;
                for(int i = 1; i < n ; i++){
                    arr[i] = sum[i -1] - arr[i-1];
                    if (arr[i] < 0 || checked[arr[i]]){
                        end = false;
                        break;
                    }
                    checked[arr[i]] = true;

                }

                if (end){
                    for (int i : arr) {
                        System.out.print(i + " ");
                    }
                    break;
                }
            }
        }
    }