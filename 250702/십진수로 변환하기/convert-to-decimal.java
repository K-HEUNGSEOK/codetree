import javax.print.DocFlavor;
import java.io.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digit(n));
    }
    static int digit(int n){
        int num = 0;
        char[] arr = String.valueOf(n).toCharArray();
        for(int i = 0 ; i < arr.length; i ++){
            num = num * 2 + (arr[i] -'0');
        }
        return num;
    }
}
