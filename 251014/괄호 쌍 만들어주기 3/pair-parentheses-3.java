
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == '(') {
                for (int j = i + 1; j < str.length(); j++) {
                    if(str.charAt(j) == ')') ans ++;
                }
            }
        }
        System.out.println(ans);

    }
}