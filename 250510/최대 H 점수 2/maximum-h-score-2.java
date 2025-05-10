import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int l;
    static int[] arr;
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 1; i <= 100; i ++){
            if (isCheck(i)){
                ans = Math.max(ans,i);
            }
        }
        System.out.println(ans);

    }

    private static boolean isCheck(int num) {
        int cnt = 0;
        int index = 0;
        for(int i = 0 ; i < n ; i ++){
            if (arr[i] >= num){
                cnt ++;
            }
            if (arr[i] < num){
                index ++;
            }
        }
        if (l > 0){
            int[] count = new int[index];
            int idx = 0;
            for(int i = 0 ; i < n ; i ++){
                if (arr[i] < num){
                    count[idx++] = arr[i];
                }
            }
            Arrays.sort(count);
            if (index > 0){
            int len = index -1;
            for(int i = 0 ; i < l; i ++){
                count[len--] ++;
            }
            }

            for(int i = 0 ; i < index; i ++){
                if (count[i] >= num){
                    cnt ++;
                }
            }
        }

        if (cnt >= num){
            return true;
        }
        return false;
    }
}
