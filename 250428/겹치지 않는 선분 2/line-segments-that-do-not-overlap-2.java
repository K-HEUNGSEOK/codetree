import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
       static int MAX_VALUE = 1000000;
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[101];
        int[] y = new int[101];
        int offset = MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            x[i] = sc.nextInt() +offset;
            y[i] = sc.nextInt() + offset;
        }
        int count =  0;
        for(int i = 0 ; i <n ; i ++){
            boolean[] countingBox = new boolean[(MAX_VALUE * 2) + 1];
            boolean check = true;
            int ix = x[i];
            int iy = y[i];
            for(int k = ix; k <= iy; k++){
                countingBox[k] = true;
            }
            for(int j = i+1 ; j < n ; j ++){

                int jx = x[j], jy = y[j];


                for(int k = jx; k <= jy; k++){
                    countingBox[k] = false;
                }
            }

            for(int j = ix; j <=iy; j ++){
                if (!countingBox[j]){
                    check =false;
                    break;
                }
            }
            if (check){
                count++;
            }
        }
        System.out.println(count);
    }
}