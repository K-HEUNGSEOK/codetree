import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;

        while (true){
            if (a == b-1 && c == b + 1){
                System.out.println(cnt);
                return;
            }

            if (isCheck(a,b,c)){
                a = b;
                b += 1;
            }else if(isCheck2(a,b,c)){
                c = b;
                b -= 1;
            }
            cnt ++;
        }


    }
    private static boolean isCheck2(int a, int b, int c){
        c = b -1;
        if (a == c){
            return false;
        }
        return true;
    }

    private static boolean isCheck(int a, int b, int c) {
        a = b + 1;
        if (a == c){
            return false;
        }
        return true;
    }


}
