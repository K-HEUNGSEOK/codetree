import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] arr = new char[r][c];
        for(int i = 0 ; i < r; i ++){
            for(int j = 0 ; j < c; j ++){
                arr[i][j] = sc.next().charAt(0);
            }
        }
        char current = arr[0][0];
        int ans = 0;
        for(int i = 1 ; i < r; i ++){
            for(int j = 1; j < c; j ++){
                if (arr[i][j] != current){
                    char next = arr[i][j];
                    for(int k = i + 1; k < r-1; k ++){
                        for(int l = j + 1; l < c-1 ; l ++){
                            if (next != arr[k][l]){
                                char end = arr[k][l];
                                if (end != arr[r-1][c-1]){
                                    ans ++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}