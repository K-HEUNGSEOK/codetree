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
        //1101 8 4 1 13이
        char[] arr  = sc.next().toCharArray();
        int ans = 0;
        for(int i = 0 ; i < arr.length; i ++){
            char temp = ' ';
            if (arr[i] == '0'){
                arr[i] = '1';
                temp = '0';
            }else{
                arr[i] = '0';
                temp = '1';
            }
            ans = Math.max(ans,binaryNumber(arr));
            arr[i] = temp;
        }
        System.out.println(ans);
    }
    static int binaryNumber(char[] str){
        int num = 0;
        for(int i = 0 ; i < str.length; i ++){
            num = num * 2 + str[i]-'0';
        }
        return num;
    }
}