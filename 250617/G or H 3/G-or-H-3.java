import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 파일 입력부는 그대로
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[101];
        int max_num = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            max_num = Math.max(max_num,num);
            char index = sc.next().charAt(0);
            switch (index) {
                case 'G':
                    arr[num] = 1;
                    break;
                case 'H':
                    arr[num] = 2;
                    break;
            }
        }
        int ans = 0;
        for(int i = 1 ; i <= max_num; i ++){
            int sum = 0;
            for(int j = i ; j <= k+i; j ++){
                sum += arr[j];
            }
            ans = Math.max(ans,sum);
        }
        System.out.println(ans);



    }
}
