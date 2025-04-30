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
        int ans = 0;
        for(int i = x; i <= y; i ++){
            ans = Math.max(ans,moduriler(i));
        }
        System.out.println(ans);

    }
    static int moduriler(int x){
        int total = 0;
        while (x > 0){
            total += x % 10;
            x /= 10;
        }
        return total;
    }
}
