import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 파일 입력부는 그대로
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        //슬라이딩 윈도우 만들기 완료
        for(int i = 0 ; i < k-1; i ++){
            sum += arr[i];
        }
        int ans = 0;
        for(int i = k-1; i < n; i ++){
            sum +=arr[i];
            ans = Math.max(ans,sum);
            sum = sum - arr[i+1 - k];

        }
        System.out.println(ans);
    }
}
