import javax.swing.table.TableCellRenderer;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10001];
        int target = sc.nextInt();
        int ans = Integer.MAX_VALUE;
       for(int i = 1; i <= 10000; i ++){
           int time = 1;
           int move = 1;
           a[0] = 0;
           boolean check = false;
           while (true) {
               a[time] = a[time - 1] + move;

               if (a[time] == target && move == 1) {
                   ans = Math.min(ans, time);
                   break;
               }

               if (a[time] > target){
                   break;
               }
               time++;

               if (!check && time >= i){
                   check =true;
               }
               if (check) {
                   if (move > 1) {
                       move--;
                   }
               } else {
                   move++;
               }
           }
       }
        System.out.println(ans);
    }

}