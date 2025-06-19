import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 10000000;
        for(int i = 0 ; i < 6; i ++){
            for(int j = i + 1; j <6 ; j++){
                for(int k = j + 1; k < 6; k ++){
                    ans = Math.min(ans, diff(i,j,k));
                }
            }
        }
        System.out.println(ans);
    }
    static int diff(int i, int j, int k ){
        int sum = arr[i] + arr[j] + arr[k];
        int total = 0;
        for (int i1 : arr) {
            total +=i1;
        }
        int sum2 = total - sum;
        return Math.abs(sum-sum2);
    }
}
