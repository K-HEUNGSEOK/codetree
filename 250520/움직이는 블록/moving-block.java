import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int target = total / n;
        int cnt = 0;

        for (int i : arr) {
            if (i > target){
                cnt += i - target;
            }
        }
        System.out.println(cnt);

    }
}
