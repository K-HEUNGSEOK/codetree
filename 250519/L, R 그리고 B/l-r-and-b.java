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
        int lIdxJ = 0;
        int bIdxI = 0;
        int bIdxJ = 0;
        int rIdxI = 0;
        int rIdxJ = 0;
        for(int i = 0 ; i < 10 ; i++){
            for(int j = 0 ; j < 10; j ++){
                if (arr[i][j] == 'L'){
                    lIdxI = i;
                    lIdxJ = j;
                }
                if (arr[i][j] == 'B'){
                    bIdxI = i;
                    bIdxJ = j;
                }
                if (arr[i][j] == 'R'){
                    rIdxI = i;
                    rIdxJ = j;
                }
            }
        }
        int total = (Math.abs((lIdxI + lIdxJ) - (bIdxI + bIdxJ)));

        if (lIdxI == bIdxI && bIdxI == rIdxI){
            total += 1;
            System.out.println(total);
        }else if(lIdxJ == bIdxJ && bIdxJ == rIdxJ){
            total +=1;
            System.out.println(total);
        }else{
            total -=1;
            System.out.println(total);
        }


    }

//    static int solution(int[] arr, int[] copy , int n){
//
//    }
}
