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
                    boolean check = true;
                    for(int l = 0; l < n ; l ++){
                        if (l == i || l ==j || l == k)continue;

                        int xx = x[l];
                        int yy = y[l];

                        for(int first = xx; first <= yy; first ++){
                            counting[first]++;
                        }
                    }
                    for (int f = 0 ; f < counting.length; f ++){
                        if (counting[f] > 1) {
                            check = false;
                            break;
                        }
                    }
                    if (check){
                        ans++;
                    }

                }
            }
        }
        System.out.println(ans);
    }
}
