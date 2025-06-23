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
        int cnt = 0;
        for(int i = x ; i <= y ; i++){
            if (exsiting(i)){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean exsiting(int num) {
        int cnt = 0 ;
        int [] ch = new int[10];
        while (num > 0){
            int a = num % 10;
            ch[a]++;
            cnt ++;
            num/= 10;
        }
        boolean z = false;
        for(int i = 0 ; i < 10 ; i ++){
            if (ch[i] == cnt - 1){
                ch[i] = 0;
                z= true;
                break;
            }
        }
        if (!z) return false;
        for(int i = 0 ; i < 10 ;  i++){
            if (ch[i] > 0){
                return true;
            }
        }
        return false;
    }
}
