import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int win = 0;
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            if (a[i] == 1 && b[i] == 2){
                ans ++;
            }
            else if(a[i] == 2 && b[i] == 3){
                ans ++;
            }else if(a[i] == 3 && b[i] == 1){
                ans ++;
            }
        }
        int ans2 = 0;
        for(int i = 0 ; i < n ; i ++){
            if (a[i]== 1 && b[i] == 3){
                ans2 ++;
            }
            else if(a[i] == 2 && b[i] == 1){
                ans2 ++;
            }else if(a[i] == 3 && b[i] == 2){
                ans2 ++;
            }
        }
        win = Math.max(win,ans);
        win = Math.max(win,ans2);
        System.out.println(win);



    }


}
