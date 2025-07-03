import javax.print.DocFlavor;
import java.io.*;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] simulation = new int[201];
        int current = 100;
        int[] x1 = new int[201];
        int[] x2 = new int[201];
        for(int i = 0 ; i < n ; i ++){
            int way = sc.nextInt();
            char command = sc.next().charAt(0);

            if (command == 'L'){
                x1[i] = current - way;
                x2[i] = current;
                current -= way;
            }else{
                x1[i] = current;
                x2[i] = current + way;
                current += way;
            }
        }

        for(int i = 0 ; i < n ; i ++){
            for(int j = x1[i] ; j < x2[i] ; j ++){
                simulation[j] ++;
            }
        }
        int cnt = 0;
        for(int i = 0 ; i < 201; i ++){
            if (simulation[i] >= 2){
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
