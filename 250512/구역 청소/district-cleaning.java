import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[11];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        extracted(a, b, arr);
        extracted(c, d, arr);

        int cnt = 0;
        for (int i : arr) {
            if (i > 0){
                cnt ++;
            }
        }
        System.out.println(cnt );
        System.out.println(Arrays.toString(arr));

    }

    private static void extracted(int a, int b, int[] arr) {
        for(int i = a; i < b; i++){
            arr[i] ++;
        }
    }
}

