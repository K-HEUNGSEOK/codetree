import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    static int [] dy;
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int [][] box = new int[201][201];
        int n = sc.nextInt();
        int offset = 100;
        for(int i = 0 ; i < n ; i ++){
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;

            for(int j = x1; j < x2; j ++){
                for(int k = y1 ; k < y2; k ++){
                    box[j][k] = 1;
                }
            }
        }
        int ans = 0;
        for (int[] ints : box) {
            for (int i : ints) {
                if (i == 1){
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }
}
