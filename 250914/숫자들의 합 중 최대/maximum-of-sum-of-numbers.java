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
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;
        for(int i = x; i <= y ; i ++){
            ans = Math.max(ans, getInt(i));
        }
        System.out.print(ans);
    }
    static int getInt(int num){
        String str = num+""; 
        int cnt = 0; 
        for(int i =0; i < str.length(); i ++){
            cnt += str.charAt(i) -'0';
        }
        return cnt; 
    }
}
