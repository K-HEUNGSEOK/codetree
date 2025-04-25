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
        int [] x = new int[101];
        int [] y = new int[101];

        for(int i = 0 ; i < n ; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i ++){
            int maxX = 0;
            int minX = Integer.MAX_VALUE;
            int maxY = 0;
            int minY = Integer.MAX_VALUE;

            for(int j = 0 ; j < n ; j ++){
                if (i == j ) continue;

                maxX = Math.max(maxX,x[j]);
                minX = Math.min(minX,x[j]);
                maxY = Math.max(maxY,y[j]);
                minY = Math.min(minY,y[j]);

            }
            int total = (maxX-minX) * (maxY-minY);
            ans = Math.min(total,ans);
        }
        System.out.println(ans);
    }
}
