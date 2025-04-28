import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int [][] arr = new int[11][21];
        int [][] rank = new int[11][n+1];
        for(int i = 0; i < k ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
                rank[i][arr[i][j]] = j;
            }
        }
        int cnt = 0;
        for(int a = 1; a <= n ; a ++){
            for(int b = 1; b <=n ;b ++){
                if (a== b) continue;

                boolean check =true;

                for(int x = 0 ; x < k; x ++){
                    if (rank[x][a] > rank[x][b]){
                        check= false;
                        break;
                    }
                }
                if (check){
                    cnt ++;
                }
            }
        }
        System.out.println(cnt);
    }
}
