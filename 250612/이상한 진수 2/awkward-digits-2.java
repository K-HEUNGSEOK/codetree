import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();
        int ans = 0;
        for(int i = 0 ; i < arr.length; i ++){
            for(int j = 0 ; j < arr.length; j ++){
                if (i == j) continue;
                if (arr[j] == '0'){
                    arr[j] = '1';
                   ans = Math.max(ans,binayNumber(arr));
                    arr[j] = '0';
                }else {
                    arr[j] = '0';
                    ans = Math.max(ans,binayNumber(arr));
                    arr[j] = '1';
                }

            }
        }
        System.out.println(ans);

    }

    private static int binayNumber(char[] arr) {
        int num = 0;
        for(int i = 0 ; i < arr.length; i ++){
            num = num * 2 + (arr[i] -'0');
        }
        return num;
    }
}