import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        int n  = sc.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        for(int i = 0 ; i < n ; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i ++){
            for(int j = x[i] ; j <= y[i]; j ++){
                arr[j] ++;
            }
        }
        boolean check = false;
        for (int i : arr) {
            if (i >= n){
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

