import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] a = new int[3];
        int [] b = new int[3];
        for(int i = 0 ; i < 3; i ++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < 3; i ++){
            b[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 1; i <= n ; i ++){
            for(int j = 1; j <= n ; j ++){
                for(int k = 1; k <= n ; k ++){
                    if (check(i,j,k,a,b)){
                        ans ++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static boolean check(int i, int j, int k, int[] a, int[] b) {
        int [] copy = new int[3];
        copy[0] = i;
        copy[1] = j;
        copy[2] = k;
        //1번
        boolean ch = true;
        for(int z = 0 ; z < 3; z ++){
            int diff = Math.abs(a[z] - copy[z]);
            diff = Math.min(diff , n - diff);
            if (diff > 2){
                ch =false;
                break;
            }
        }
        if (ch){
            return true;
        }
        //2번
        ch = true;
        for(int z = 0 ; z < 3; z ++){
            int diff = Math.abs(b[z] - copy[z]);
            diff = Math.min(diff , n - diff);
            if (diff > 2){
                ch =false;
                break;
            }
        }
        if (ch){
            return true;
        }

        return false;
    }
}
