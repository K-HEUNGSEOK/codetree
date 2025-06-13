import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        char[] arr = sc.next().toCharArray();
        for(int i = 0 ; i < n ; i ++){
            for(int j = i + 1; j < n ; j ++){
                for(int k = j + 1; k < n ; k ++){
                    if (arr[i] == 'C' && arr[j] == 'O' && arr[k] == 'W'){
                        ans ++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}