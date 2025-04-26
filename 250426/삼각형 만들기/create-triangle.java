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
        int ans = 0;
        for(int i = 0 ; i < n; i ++){
            for(int j = i+1 ; j < n ; j ++){
                for(int k = j+1 ; k < n ; k++){
                    int x1 = x[i], y1 = y[i];
                    int x2 = x[j], y2 = y[j];
                    int x3 = x[k], y3 = y[k];

                    if ((x1 + x2 + x3) > 0){
                        int maxX = Math.max(x1,x2);
                        maxX = Math.max(maxX,x3);
                        int maxY = Math.max(y1,y2);
                        maxY = Math.max(maxY,y3);

                        int total = maxX * maxY;
                        ans = Math.max(ans,total);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}