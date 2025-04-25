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
            for(int j = 0 ; j < n ; j ++){
                for(int k = i +1 ; k < n ; k ++){
                    int x1 = 0;
                    int y1 = 0;
                    int x2 = 0;
                    int y2 = 0;
                    for(int l = j + 1; l < n ; l ++){
                        //뺀 수를 각각 새로운 배열에 담아
                        //새로운 배열에서 최소값을 찾아
                        //그 두개
                        x1 = x[i];
                        y1 = y[i];
                        x2 = x[k];
                        y2 = y[l];
                        int total1 = (int) Math.pow(x1 - x2,2);
                        int total2 = (int) Math.pow(y1 - y2,2);
                        int sum = total1 + total2;
                        ans = Math.min(ans, sum);
                    }
                }
            }
        }
        System.out.println(ans);
    }

}
