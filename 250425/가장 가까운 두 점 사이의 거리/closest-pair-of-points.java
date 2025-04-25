import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];

        for(int i = 0 ; i < n ; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        //가장 가까운 점 2개를 골라야 하니까 두개씩 뺄셈을 할때 최소 값이 나올거아냐
        //그 최소값이 나올 때의 x1 y1, x2 y2 를 골라보자!
        for(int i = 0 ; i < n ; i ++){
            int x1 = x[i];
            int y1 = y[i];
            int x2 = 0;
            int y2 = 0;
            for(int j = i + 1 ; j < n ; j ++){
                x2 = x[j];
                y2 = y[j];
                int total1 = (int) Math.pow(x1 - x2,2);
                int total2 = (int) Math.pow(y1 - y2,2);
                int sum = total1 + total2;
                ans = Math.min(ans, sum);
            }
         }
        System.out.println(ans);
        }
    }