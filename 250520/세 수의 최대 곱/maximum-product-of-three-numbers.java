import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int max = atomicMax(arr, n);
        int negativeMax = negativeMax(arr,n);
        
        System.out.println(Math.max(max,negativeMax));
    }

    static int atomicMax(int[]arr, int n ){
        Arrays.sort(arr);
        //맨 뒤에서부터 3개
        //11 10 9 -> n-1 11
        int total = 1;
        for(int i = n-1; i >= 9; i--){
            total *= arr[i];
        }
        return total;
    }

    static int negativeMax(int[] arr, int n){
        int total = 1;
        total *= arr[0];
        total *= arr[1];
        total *= arr[n-1];
        return total;
    }
}
