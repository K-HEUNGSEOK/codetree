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
        for(int i = x; i <= y; i ++){
            ans = Math.max(ans,getMaxNumber(i));
        }
        System.out.println(ans);
    }

    private static int getMaxNumber(int x) {
        int sum = 0;
        while (x > 0){
            sum += x % 10;
            x/= 10;
        }
        return sum;
    }
}
