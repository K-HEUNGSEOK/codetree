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
        char[] arr = sc.next().toCharArray();
        int ans = 0;
        for(int i = 0 ; i < arr.length-1; i++){
            if (arr[i] == '(' && arr[i + 1] == '('){
                for(int j = i + 2; j < arr.length-1; j ++){
                    if (arr[j] == ')'&& arr[j+1] == ')'){
                        ans ++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}