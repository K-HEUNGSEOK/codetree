import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;

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

        int ans = 0;
        char start = arr[0][0];
        for(int i = 0 ; i < r; i ++){
            for(int j = 0 ; j < c; j ++){
                if (start != arr[i][j]){
                    char first = arr[i][j];
                    for(int k = i + 1; k < r-1; k ++){
                        for(int l = j + 1; l < c-1; l ++){
                            if (first != arr[k][l]){
                                char next = arr[k][l];
                                if (next != arr[r-1][c-1]){
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