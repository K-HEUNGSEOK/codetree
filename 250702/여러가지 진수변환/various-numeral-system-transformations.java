import javax.print.DocFlavor;
import java.io.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       changeNumber(a,b);
    }
    static void changeNumber(int a, int b){
        if (a / b != 0){
            changeNumber(a/b, b);
        }
        System.out.print(a % b);
    }
}
