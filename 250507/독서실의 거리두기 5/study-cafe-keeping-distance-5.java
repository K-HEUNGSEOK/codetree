import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static char[] arr;
    static int n;
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = sc.next().toCharArray();
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            if (arr[i] == '0'){
                arr[i] = '1';

                ans = Math.max(ans, getMax());

                arr[i] = '0';
            }

        }
        System.out.println(ans);
    }
    static int getMax(){
        int ma = n;
        for(int i = 0 ; i < n ; i ++){
            for(int j = i + 1 ; j < n ; j ++){
                if (arr[i] == '1' && arr[j] == '1'){
                    ma = Math.min(ma,j - i);
                }
            }
        }
        return ma;
    }
}