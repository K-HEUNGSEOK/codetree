import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [6];
        for(int i = 0 ; i < 6;  i++){
            arr[i] = sc.nextInt();
        }
        //전체 합
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < 6; i ++){
            for(int j = i + 1; j < 6; j ++){
                for(int k = 0 ; k < 6; k ++){
                    for(int l = k + 1; l < 6 ; l++){
                        if (k == i || k == j || l == i || l == j) continue;
                        int max = Integer.MIN_VALUE;
                        int min = Integer.MAX_VALUE;
                        int sum1 = arr[i] + arr[j]; //첫번째 팀
                        int sum2 = arr[k] + arr[l]; //두번째 팀
                        int sum3 = total - (sum2 + sum1); // 3번째 팀
                        max = maxValue(sum1,sum2,sum3);
                        min = minValue(sum1,sum2,sum3);
                        ans = Math.min(ans, max-min);
                    }
                }
            }
        }
        System.out.println(ans);
    }
    static int maxValue(int a, int b, int c){
        int [] sort = new int[3];
        sort[0] = a;
        sort[1] = b;
        sort[2] = c;

        Arrays.sort(sort);
        return sort[2];
    }
    static int minValue(int a, int b, int c){
        int [] sort = new int[3];
        sort[0] = a;
        sort[1] = b;
        sort[2] = c;

        Arrays.sort(sort);
        return sort[0];
    }
}
