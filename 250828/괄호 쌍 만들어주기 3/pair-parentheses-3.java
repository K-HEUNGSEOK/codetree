import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int cnt = 0;
        for(int i = 0 ; i < arr.length; i ++){
            if(arr[i] == '('){
                for(int j = i + 1; j < arr.length; j ++){
                    if(arr[j] == ')'){
                        cnt ++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}