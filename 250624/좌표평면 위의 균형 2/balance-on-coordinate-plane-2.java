import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    static final int MAX = 110;
    public static void main(String[] args) throws FileNotFoundException {
       =
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int[MAX];
        int [] y = new int[MAX];

        for(int i = 1; i <= n ; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= 100; i +=2){
            for(int j = 0; j <= 100; j +=2){
                int q1 = 0, q2 = 0 , q3 = 0, q4 = 0;
                for(int l = 1; l <= n ; l ++){
                    if (x[l] < i && y[l] < j){
                        q1 ++;
                    }
                    else if(x[l] < i && y[l] > j){
                        q2 ++;
                    }
                    else if(x[l] > i && y[l] < j){
                        q3 ++;
                    }
                    else if(x[l] > i && y[l] > j){
                        q4 ++;
                    }
                }
                int max = Math.max(q1,q2);
                max= Math.max(max,q3);
                max= Math.max(max,q4);
                ans = Math.min(ans,max);
            }
        }
        System.out.println(ans);
    }
}
