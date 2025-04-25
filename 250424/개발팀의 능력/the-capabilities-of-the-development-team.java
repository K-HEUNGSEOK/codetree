import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int size = 5;
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for(int i = 0 ; i < size; i ++){
            arr[i] = sc.nextInt();
        }

       int total = getTotal(arr);
        int ans = Integer.MAX_VALUE;
        boolean check = false;
        for(int i = 0 ; i < size; i ++){
            for(int j = i + 1; j < size; j ++){
                for(int k = 0 ; k < size; k ++){
                    for(int l = k+1 ; l < size; l ++){
                        if (i == k || k == j || l == i || l == j) continue;
                        int sum1 = arr[i] + arr[j]; //1번팀
                        int sum2 = arr[k] + arr[l]; //2번팀
                        int sum3 = total - sum1- sum2;
                        if (sum1 == sum2 || sum1 == sum3 || sum2 == sum3) continue;
                        check = true;
                        int num = Math.abs(sum1 - sum2); // 1번팀 - 2번팀
                        num = Math.max(num, Math.abs(sum2 - sum3));
                        num = Math.max(num,Math.abs(sum1 - sum3));
                        ans = Math.min(ans,num);
                    }
                }
            }
        }
        if (check){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }

    private static int getTotal(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

}
