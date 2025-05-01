import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
   ;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];

        for(int i = 0; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        int ans = 0;


        for(int i = 1; i < 100; i++){
            int cnt = 0;
            for(int j = 0 ; j < n ; j ++){
                int first = arr[j] - i;
                for(int k = 0; k < n ; k ++){
                    if (k == j) continue;
                    if (j > k || k > n) continue;
                    int second = i - arr[k];

                    if (first == second){
                        cnt ++;
                    }
                }
            }
            ans = Math.max(ans,cnt);
        }
        System.out.println(ans);
    }
}
