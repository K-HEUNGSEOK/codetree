import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //폭탄 수
        int k = sc.nextInt(); //폭탄이 터지는 거리
        int[] boom = new int [101];
        for(int i = 0 ; i < n ; i ++){
            boom[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            int [] counting = new int[101];
            boolean flag = false;
            for(int j = i + 1 ;  j <= k + i ; j ++){
                counting[j] = boom[j];
                if (boom[i] == boom[j]){
                    flag = true;
                    break;
                }
            }
            if (flag){
                for (int i1 : counting) {
                    ans = Math.max(ans,i1);
                }
            }
        }
        System.out.println(ans);
    }
}
