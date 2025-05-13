import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[11][2];
        int cnt = 0;
        for(int i = 0; i < n ; i ++){
            int person = sc.nextInt();
            int position = sc.nextInt();
            arr[person][position] ++;
            if(check(arr,person,position)){
                cnt ++;
            }
        }
        System.out.println(cnt);

    }

    private static boolean check(int[][] arr, int person, int position) {
        int x = position ^ 1;

        if (arr[person][x] > 0){
            arr[person][x] = 0;
            return true;
        }
        return false;
    }

}

