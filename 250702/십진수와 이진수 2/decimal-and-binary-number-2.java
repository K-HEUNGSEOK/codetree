import javax.print.DocFlavor;
import java.io.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        //n 이 주어지면 10진수로 바꾸고 17배 하고 다시 2진수로 바꾼다.
        String n = sc.next();
        printBinary(n);
    }
    static void printBinary(String n){
        int num = changeNumber(n);
        StringBuilder sb = new StringBuilder();
        while (num > 0){
            sb.append(num % 2);
            num /= 2;
        }
        System.out.println(sb.reverse().toString());
    }
    static int changeNumber(String n){
        int num = 0;
        for(int i = 0 ; i < n.length(); i ++){
            num = num * 2 + Integer.parseInt(n.charAt(i) +"");
        }
        return num * 17;
    }
}
