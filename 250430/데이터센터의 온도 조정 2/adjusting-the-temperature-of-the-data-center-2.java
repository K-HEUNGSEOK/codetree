import javax.swing.plaf.PanelUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int C;
    static int G;
    static int H;
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
         C = sc.nextInt();
        G = sc.nextInt();
         H = sc.nextInt();

        int []x = new int[1001];
        int []y = new int[1001];
        int max = 0;
        for(int i = 0 ; i < N ; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            int total = Math.max(x[i],y[i]);
            max = Math.max(max,total);
        }
        int ans = 0;
        for(int i = 1; i <= max; i ++){
            ans = Math.max(ans,getTemperature(i, x, y, N));
        }
        System.out.println(ans);
    }
    static int getTemperature(int num, int[] x , int[] y , int N){
        int total = 0;
       for(int i = 0 ; i < N; i ++){
           if (num < x[i]){
               total += C;
           }
           else if(num >= x[i] && num <= y[i]){
               total += G;
           }else{
               total += H;
           }
       }
       return total;
    }
}
