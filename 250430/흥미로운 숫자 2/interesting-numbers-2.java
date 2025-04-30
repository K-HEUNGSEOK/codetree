import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cnt = 0;
        for(int i = x; i <= y; i ++){
            if (isChecked(i)){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean isChecked(int num) {
        int ans = 0;
        String str = String.valueOf(num);
        int [] counting = new int[str.length()];
        for(int i = 0 ; i < str.length(); i ++){
            counting[i] = str.charAt(i) - '0';
        }
        for(int i = 0 ; i < counting.length; i ++){
            int cnt = 0;
            for(int j = 0 ; j < counting.length; j ++){
                if (i == j ) continue;
                if (counting[i] == counting[j]){
                    cnt ++;
                }
            }
            ans = Math.max(ans, cnt);
        }
        if (ans == str.length() -2){
            return true;
        }
        return false;
    }
}
