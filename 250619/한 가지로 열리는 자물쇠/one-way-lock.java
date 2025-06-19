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
        int n = sc.nextInt();
        int [] arr = new int[3];
        for(int i = 0 ; i < 3; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 1 ; i <= n ; i ++){
            for(int j = 1; j <= n; j ++){
                for(int k = 1; k <=n ; k ++){

                    if(check(i,j,k,arr)){
                        ans ++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    static boolean check(int a, int b , int c, int[] arr){
        int [] copy = new int[3];
        copy[0] = a;
        copy[1] = b;
        copy[2] = c;
        for(int i = 0 ; i < 3; i ++){
            if (Math.abs(arr[i] - copy[i]) <= 2){
                return true;
            }
        }
        return false;
    }
}
