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

        int operation = (2 * m + 1);
        if (m == 0 || cnt == 0){
            System.out.println(cnt);
        }
        else if( operation > n){
            System.out.println(1);
        }
        else if(n % operation == 0){
            System.out.println(n / operation);
        }else {
            System.out.println(n / operation + 1);
        }
    }
}
