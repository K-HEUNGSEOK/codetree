import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int [] arr= new int[n+1];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            int total = 0;
            int pos = i;
            for(int j = 0 ; j < p ; j ++){
                total += arr[pos];
                pos = arr[pos]-1;
            }
           ans =  Math.max(ans, total);
        }
        System.out.println(ans);
    }
}
