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
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i ++){
            if(palrindrom(i)){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean palrindrom(int num) {
        char[] arr = (num+"").toCharArray();
        int lt = 0;
        int rt = arr.length-1;
        while (rt > lt){
            if (arr[lt] == arr[rt]){
                lt ++;
                rt --;
            }else{
                return false;
            }
        }
        return true;
    }
}
