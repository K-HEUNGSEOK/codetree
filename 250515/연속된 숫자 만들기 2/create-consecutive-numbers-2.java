import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b == a + 1 && b == c -1 || b == a -1 && b == c + 1){
            System.out.println(0);
        }else if (b == a+1 || b == c -1 || b == a -1 || b == c +1){
            System.out.println(1);
        }else{
            System.out.println(2);
        }
    }
}
