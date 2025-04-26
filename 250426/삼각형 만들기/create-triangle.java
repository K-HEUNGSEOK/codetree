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

                   if ((x1 == x2 || x1 == x3 || x2 == x3) &&
                           (y1 == y2 || y1 == y3 || y3 == y2) ){
                       int width = Math.abs(x1 - x2);
                       width = Math.max(width, Math.abs(x1 - x3));
                       width = Math.max(width, Math.abs(x2- x3));

                       int height = Math.abs(y1 - y2);
                       height = Math.max(height, Math.abs(y1 - y3));
                       height = Math.max(height, Math.abs(y2- y3));

                       ans = Math.max(ans, height*width);
                   }
                }
            }
        }
        System.out.println(ans);
    }
}