import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[10][10];
        for(int i = 0 ; i < 10 ; i ++){
            arr[i] = sc.next().toCharArray();
        }
        int lIdxI = 0;
        int lIdxR = 0;
        int bIdxI = 0;
        int bIdxR = 0;

        int rIdxR = 0;
        int rIdxL = 0;
        for(int i = 0 ; i < 10 ; i++){
            for(int j = 0 ; j < 10; j ++){
                if (arr[i][j] == 'L'){
                    lIdxI = i;
                    lIdxR = j;
                }
                if (arr[i][j] == 'B'){
                    bIdxI = i;
                    bIdxR = j;
                }
                if (arr[i][j] == 'R'){
                    rIdxL = i;
                    rIdxR = j;
                }
            }
        }

        int total = 0 ;
        if (rIdxR == bIdxR && bIdxR == lIdxR){
            total = (Math.abs((lIdxI + lIdxR) - (bIdxI + bIdxR)))+1;
            System.out.println(total);
        }else{
            total = (Math.abs((lIdxI + lIdxR) - (bIdxI + bIdxR)));
        System.out.println(total-1);
        }
    }

//    static int solution(int[] arr, int[] copy , int n){
//
//    }
}
