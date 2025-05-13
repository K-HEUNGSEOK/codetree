import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[11][2];

        for(int i = 0; i < n ; i ++){
            int person = sc.nextInt();
            int position = sc.nextInt();
            arr[person][position] ++;
        }
        int cnt = 0;
        for(int i = 1 ; i < 11; i ++){
            if (arr[i][0] > 0 && arr[i][1] > 0){
                cnt += Math.min(arr[i][0],arr[i][1]);
            }
        }
        System.out.println(cnt);
    }
}

