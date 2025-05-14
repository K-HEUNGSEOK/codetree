import javax.swing.table.TableCellRenderer;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt()-1;

        boolean[] person = new boolean[n];
        char [] c = new char[m];
        int [] u = new int[m];
        for(int i = 0; i < m ; i++){
            c[i] = sc.next().charAt(0);
            u[i] = sc.nextInt();
        }

        for(int i = p ; i< m ; i ++){
            person[c[i] - 'A'] = true;
        }
        if (u[p] == 0){
            System.out.println(" ");
        }else{
        for(int i = 0 ; i < n ; i ++){
            if (!person[i]){
                int x = i + 'A';
                System.out.print((char) x + " ");
            }
        }
        }
    }
}