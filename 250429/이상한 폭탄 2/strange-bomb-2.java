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
        int[] boom = new int[101];

        for(int i = 0 ; i < n ; i ++){
            boom[i] =sc.nextInt();
        }
        int ans = -1;
        for(int i = 0 ; i < n ; i ++){
            boolean[] check = new boolean[1001];
            for(int j = i + 1; j <= k + i ; j ++){
                if (j > 100){
                    break;
                }
                if (boom[i] == boom[j]){
                    check[boom[j]] = true;
                }
            }
            for(int j = 1; j <= 1000; j ++){
                if (check[j]){
                    ans = Math.max(ans,j);
                }
            }
        }
        System.out.println(ans);
    }
}
