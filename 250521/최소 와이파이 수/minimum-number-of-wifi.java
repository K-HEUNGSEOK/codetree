import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = sc.nextInt();
            if (arr[i] == 1){
                cnt ++;
            }
        }
        if (m == 0){
            System.out.println(cnt);
        }
        else if((2 * m + 1) > n){
            System.out.println(1);
        }
        else if (n % 2 == 0) System.out.println(n / (2 * m + 1));
        else {
            System.out.println(n / (2 * m + 1) + 1);
        }
    }
}
