import java.io.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static int max = 1000000;
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] white = new int[max];
        int[] black = new int[max];
        int[] box = new int[max];
        int current = 100000;
        for(int i = 0; i < n ; i ++){
            int way = sc.nextInt();
            char command = sc.next().charAt(0);

            if (command == 'R'){
                int d = way + current;
                for(int m = current; m < d; m ++){
                    black[m] ++;
                    box[m] = 2;
                }
                current += way -1;
            }else{
                int d = current - way + 1;
                for(int m = current; m >= d; m --){
                    white[m]++;
                    box[m]= 1;
                }
                current = current - way + 1;
            }
        }
        int w = 0;
        int b = 0;
        int g = 0;
        for(int i = 0 ; i < max; i ++){
            if (box[i] > 0 && white[i] >= 2 && black[i] >= 2 ){
                box[i] = 3;
            }
        }
        for(int i = 0 ; i < max; i ++){
            if (box[i] == 1){
                w ++;
            }else if(box[i] == 2){
                b++;
            }else if(box[i] == 3){
                g ++;
            }
        }
        System.out.println(w + " " +  b + " " + g);
    }
}
