import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사람 수
        int b = sc.nextInt(); // 선물 살 수 있는 예산
        int ans = 0; //정답
        int [] p = new int[1001];
        int [] s = new int[1001];

        for(int i = 0 ; i < n ; i ++){
            p[i] = sc.nextInt();
            s[i]= sc.nextInt();
        }

        for(int i = 0 ; i < n ; i ++){
            int[] temp = new int[1001];
            for(int k = 0; k < n ; k ++){
                temp[k] = p[k] + s[k];
            }
            temp[i] /= 2;
              Arrays.sort(temp,0,n);

            int count = 0;
            int price = 0;
            for(int j = 0 ; j < n ; j ++){
                if (price > b){
                    break;
                }
                count ++;
                price += temp[j];
            }
            ans = Math.max(ans,count);
        }
        System.out.println(ans);
    }
}
