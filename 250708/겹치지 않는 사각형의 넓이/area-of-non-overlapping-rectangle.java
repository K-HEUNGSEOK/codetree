import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    static int [] dy;
    public static void main(String[] args) throws FileNotFoundException {
 
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[2001][2001];
        int offset = 1000;
        for(int i = 0 ; i < 2; i ++){
            int x1 = sc.nextInt()+offset;
            int y1 = sc.nextInt()+offset;
            int x2 = sc.nextInt()+offset;
            int y2 = sc.nextInt()+offset;

            for(int j = x1; j < x2; j ++){
                for(int k = y1 ; k < y2; k ++){
                    arr[j][k] = 1;
                }
            }
        }
        int x1 = sc.nextInt() + offset;
        int y1 = sc.nextInt() + offset;
        int x2 = sc.nextInt() + offset;
        int y2 = sc.nextInt() + offset;
        for(int i = x1; i < x2; i ++){
            for(int j = y1 ; j < y2; j ++){
                arr[i][j] = 2;
            }
        }
        int ans = 0;
        for(int i = 0 ; i < arr.length; i ++){
            for(int j = 0 ; j < arr.length; j ++){
                if (arr[i][j] == 1){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
}
