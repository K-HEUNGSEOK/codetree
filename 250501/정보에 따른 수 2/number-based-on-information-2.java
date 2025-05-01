import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] alphabet = new char[1001];
        int[] index = new int[1001];

        for(int i = 0 ; i < t; i ++){
            char c = sc.next().charAt(0);
            int num = sc.nextInt();
            alphabet[i] = c;
            index[i] = num;
        }
        int ans = 0;
        for(int i = a ; i <= b; i ++){
            int first = Integer.MAX_VALUE;
            int second =Integer.MAX_VALUE;
            for(int j = 0 ; j < t ; j ++){
                if (alphabet[j] == 'S'){
                    int d1 = Math.abs(i - index[j]);
                    first = Math.min(first,d1);
                }else if(alphabet[j] == 'N'){
                    int d2 = Math.abs(i - index[j]);
                    second = Math.min(second,d2);

                }
            }

            if (first <= second){
                ans ++;
            }
        }
        System.out.println(ans);
    }
}
