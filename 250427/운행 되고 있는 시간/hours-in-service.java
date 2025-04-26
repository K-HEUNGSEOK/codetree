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

        for(int i = 0 ; i < n ; i ++){
            boolean [] box = new boolean[101];
            for(int j = 0; j  < n ; j ++){
                if (i == j) continue;


                for(int l = x[j] ; l < y[j]; l ++){
                    box[l] = true;
                }
            }
            int cnt = 0;
            for(int j = 0; j < 101; j ++){
                if (box[j]){
                    cnt ++;
                }
            }
            ans = Math.max(ans,cnt);

        }
        System.out.println(ans);
    }
}