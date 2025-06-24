import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        int ans = 0;
        for(int i = 0 ; i * a <= c; i ++){
            int cnt = a * i;
            int numb = (c - cnt) / b; //b의 역할
            cnt += numb*b;
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}
