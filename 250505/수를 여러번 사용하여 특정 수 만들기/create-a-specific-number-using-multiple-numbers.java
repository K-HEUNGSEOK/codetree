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
        for(int i = 0 ; i < 5 ; i ++){
            for(int j = 0; j < 5; j ++){
                int x = a *i;
                int z = b * j;
                int total = x + z;

                if (total > c){
                    break;
                }
                ans = Math.max(total,ans);
            }
        }
        System.out.println(ans );
    }
}