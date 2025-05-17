import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int ans = 0 ;
        for(int i = 0 ; i < n ; i ++){
            if (arr[i] == '0'){
                arr[i] = '1';
                int mins = n;
                for(int j = 0 ; j < n ; j ++){
                    for(int k = j+1 ; k < n ; k ++){
                        if (arr[j] == '1' && arr[k] == '1'){
                            mins = Math.min(mins, k - j);
                        }
                    }
                }
                ans = Math.max(ans,mins);
                arr[i] = '0';
            }
        }
        System.out.println(ans);
    }
}
