import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int [11];
        int[] y = new int[11];

        for(int i = 0 ; i < n ; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = i + 1; j < n ; j ++){
                for(int k = j + 1; k < n ; k ++){
                    int [] counting = new int[101];
                    for(int l = 0; l < n ; l ++){
                        if (l == i || l ==j || l == k)continue;

                        int xx = x[l];
                        int yy = y[l];

                        for(int first = xx; first <= yy; first ++){
                            counting[first]++;
                        }
                    }
                    int total = 0;
                    for(int in = 0 ; in < counting.length; in ++){
                        if (counting[in] == 1){
                            total ++;
                        }
                    }
                    ans = Math.max(ans,total);
                }
            }
        }
        System.out.println(ans);
    }
}
