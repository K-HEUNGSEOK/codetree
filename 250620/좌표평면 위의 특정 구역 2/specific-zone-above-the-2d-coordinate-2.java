import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x = new int[101];
        int [] y = new int[101];
        for(int i = 0 ; i <  n; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i ++){
            int minx = Integer.MAX_VALUE;
            int maxx = 0;
            int miny = Integer.MAX_VALUE;
            int maxy = 0;
            for(int j = 0 ; j < n ; j  ++){
                if (i==j)continue;

                maxx = Math.max(maxx, x[j]);
                minx = Math.min(minx,x[j]);
                maxy = Math.max(maxy, y[j]);
                miny = Math.min(miny,y[j]);
            }
            ans = Math.min(ans, (maxx-minx) * (maxy-miny));
        }
        System.out.println(ans);

    }
}
