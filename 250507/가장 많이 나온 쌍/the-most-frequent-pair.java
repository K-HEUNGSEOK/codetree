import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];

        for(int i = 0 ; i < m ; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b){
                int temp = a;
                a = b;
                b = temp;
            }
            arr[i][0]= a;
            arr[i][1] = b;
        }
        int ans = 0;
        for(int i = 0 ; i < m ; i ++){
            int count = 0 ;
            for(int j = 0 ; j < m ; j ++){
               
                int x1 = arr[i][0], x2 = arr[i][1];
                if (x1 == arr[j][0] && x2 ==arr[j][1]){
                    count++;
                }

            }
            ans = Math.max(ans,count);
        }
        System.out.println(ans);

    }
}