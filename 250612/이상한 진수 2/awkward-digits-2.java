import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.equals("1")){
            System.out.println(0);
            System.exit(0);
        }
        char[]arr = str.toCharArray();
        if (arr[1] == '1'){
            binayNumber(arr);
        }else{
            binayNumber2(arr);
        }
    }

    private static void binayNumber(char[] arr) {
        int num = 0;
        for(int i = 0 ; i < arr.length; i ++){
            num = num * 2 + (arr[i] -'0');
        }
        System.out.println(num);
    }
    private static void binayNumber2(char[] arr) {
        arr[1] = '1';
        int num = 0;
        for(int i = 0 ; i < arr.length; i ++){
            num = num * 2 + (arr[i] -'0');
        }
        System.out.println(num);
    }
}