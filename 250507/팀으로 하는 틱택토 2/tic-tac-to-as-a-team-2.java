import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[3][3];

        for (int i = 0 ; i < 3; i++){
            arr[i] = sc.next().toCharArray();
        }
        int count = 0;

        for(int i =  1; i <= 9 ; i ++){
            for(int j = i+1; j<=9; j ++){

                //가로
                for(int k = 0 ; k < 3; k ++){
                    int cntA = 0;
                    int cntB = 0;
                    for(int l = 0 ; l < 3; l ++){
                        int target = arr[k][l] - '0';
                        if (target == i){
                            cntA++;
                        }
                        if (target == j){
                            cntB++;
                        }
                    }
                    if (cntA >0 && cntB > 0 && (cntA+cntB) == 3){
                        count++;
                    }
                }

                //세로
                for(int k = 0 ; k < 3; k ++){
                    int cntA = 0;
                    int cntB = 0;
                    for(int l = 0 ; l < 3; l ++){
                        int target = arr[l][k] - '0';
                        if (target == i){
                            cntA++;
                        }
                        if (target == j){
                            cntB++;
                        }
                    }
                    if (cntA >0 && cntB > 0 && (cntA+cntB) == 3){
                        count++;
                    }
                }

                int numI = 0;
                int numJ = 0;
                for(int k = 0 ; k < 3; k ++){
                    int target = arr[k][k] - '0';
                    if (target == i){
                        numI ++;
                    }
                    if(target == j){
                        numJ++;
                    }
                }
                if (numI > 0 && numJ > 0 && numJ + numI == 3){
                    count++;
                }

                int numI2 = 0;
                int numJ2 = 0;
                int cnt = 0;
                for(int k = 2 ; k >= 0; k --){
                    int target = arr[cnt][k] - '0';
                    if (target == i){
                        numI2 ++;
                    }
                    if(target == j){
                        numJ2++;
                    }
                    cnt ++;
                }
                if (numI2 > 0 && numJ2 > 0 && numJ2 + numI2 == 3){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}