import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int ans = Math.max(b - a, c - b) - 1;
System.out.println(ans);
    }
}
