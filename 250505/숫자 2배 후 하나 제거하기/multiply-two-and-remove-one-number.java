import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i ++){
            arr[i] *= 2;

            for(int j = 0 ; j < n ; j ++){
                int [] test = new int[n-1];
                int cnt = 0;
                for(int k = 0 ; k < n ; k ++){
                    if (j == k) continue;
                    test[cnt++] = arr[k];
                }
                int total =0;
                for(int k = 0 ; k < n-2; k ++){
                    total += Math.abs(test[k+1] - test[k]);
                }
                ans = Math.min(ans,total);
            }
            arr[i] /= 2;
        }
        System.out.println(ans);
    }
}