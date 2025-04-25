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
        int [] arr = new int[size];
        for(int i = 0 ; i < size ; i ++){
            arr[i] = sc.nextInt();
        }

        int total = 0;
        for (int i : arr) {
            total+=i;
        }

        int ans = Integer.MAX_VALUE;
        boolean check = false;
        for(int i = 0 ; i < size; i ++){
            for(int j = i + 1; j < size; j ++){
                for(int k = 0; k < size; k ++){
                    for(int l = k + 1; l < size; l ++){
                        if (k ==i || k == j || l == i || l == j) continue;

                        int sum1 = arr[i] + arr[j];
                        int sum2 = arr[k] + arr[l];
                        int sum3 = total - sum1 - sum2;
                        if (sum1 == sum2 || sum1 == sum3 || sum2 == sum3) continue;
                        check = true;
                        int max = Math.abs(sum1 - sum2);
                        max = Math.max(max, Math.abs(sum2 - sum3));
                        max = Math.max(max,Math.abs(sum3-sum1));
                        ans = Math.min(ans,max);
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
}
