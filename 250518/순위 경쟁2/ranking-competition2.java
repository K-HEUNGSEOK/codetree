import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cntA = 0; //A
        int cntB = 0; //B
        int ans = 0; //정답
        int first = 0; //우선순위

        if(n == 1){
            System.out.println(0);
            System.exit(0);
        }
        for(int i = 0 ; i < n ; i ++){
        char c = sc.next().charAt(0);
        int score = sc.nextInt();


        if (c == 'A'){
            cntA += score;
        }else {
            cntB += score;
        }

        if (cntA > cntB){
            if (first != 2){
                first = 2;
                ans ++;
            }
        }else if(cntB > cntA){
            if (first != 1){
                first = 1;
                ans ++;
            }
        }
        else {
            if (cntA == 0 && cntB == 0 && first == 0){
                continue;
            }
            if (first != 3){
                first = 3;
                ans ++;
            }
        }

        }
        System.out.println(ans);



    }

//    static int[][] solution(int[][] a, int[][] b, int l, int r){
//
//    }
}
