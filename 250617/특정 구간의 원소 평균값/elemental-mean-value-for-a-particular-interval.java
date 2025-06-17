import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 파일 입력부는 그대로
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                int sum = 0 ;
                for(int k = i ; k <= j ; k ++){
                    sum += arr[k];
                }
               // int avg = sum / (j - i + 1);
                double avg = (double) sum / (j - i + 1);
                boolean check = false;
                for(int l = i; l <= j; l ++){
                    if (arr[l] == avg){
                        check = true;
                    }
                }
                if (check){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
}
