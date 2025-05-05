import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c= sc.nextInt();
        int ans = 0 ;
        for(int i = 0 ; i * a <= c; i++){
            int cnt = a * i;

            int numB = (c - cnt) / b;

            cnt += numB * b;
            ans = Math.max(ans,cnt);
        }
        System.out.println(ans);
    }
}