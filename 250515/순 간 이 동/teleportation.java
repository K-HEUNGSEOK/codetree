import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int first = Math.abs(b - a);
        int second = Math.abs(a - x) + Math.abs(b - y); // x까지 가서 , y로 텔레포트하고 b로 가는거
        int third = Math.abs(a - y) + Math.abs(b - x);
        int ans = Math.min(first,second);
        ans = Math.min(ans,third);
        System.out.println(ans);
    }
}
