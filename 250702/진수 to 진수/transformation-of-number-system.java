import javax.print.DocFlavor;
import java.io.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        //1. a 랑 b 가 주어지면 a 진수로 표현된 어떤 수 n 이 주어지면 그걸 b로 변환해라
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        changeNumber(digit(n,a), b);
    }
    static void changeNumber(int n, int b){
        StringBuilder sb = new StringBuilder();
        while (n > 0){
            sb.append(n % b);
            n/=b;
        }
        System.out.println(sb.reverse().toString());
    }
    static int digit(int n, int a){
        int num = 0;
        String str = n +"";
        for(int i = 0 ; i < str.length(); i ++){
            num = num * a + (str.charAt(i) - '0');
        }
        return num;
    }
}
