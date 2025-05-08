    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws FileNotFoundException {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            int k = sc.nextInt();

            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            int [] count = new int[1000001];

            for(int i = 0 ; i < n ; i ++){
                for(int j = i + 1;  j < n && j <= i + k ; j ++){
                    if (arr[i] == arr[j]){
                        count[arr[i]] ++;
                    }
                }
            }
            int maxValue = 0;
            for(int i = 0 ; i < 1000001 ; i ++){
                if (count[i] > 0 && count[i] >= maxValue){
                    maxValue = i;
                }
            }
            System.out.println(maxValue);
            

        }
    }