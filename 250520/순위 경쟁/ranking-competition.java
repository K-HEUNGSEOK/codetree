import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0 , c = 0;

        //점수를 체크해보는거야
        int cnt = 0;
        int priority = 0;

        for(int i = 0 ; i < n ; i ++){
            char s = sc.next().charAt(0);
            int num = sc.nextInt();

            switch (s){
                case 'A':
                    a += num;
                    break;
                case 'B':
                    b += num;
                    break;
                case 'C':
                    c += num;
                    break;
            }

            if (a > Math.max(b,c)){
                if (priority != 1){
                    priority = 1;
                    cnt ++;
                }
            }
            else if(b > Math.max(a,c)){
                if (priority != 2){
                    priority = 2;
                    cnt ++;
                }
            }
            else if(c > Math.max(a,b)){
                if (priority != 3){
                    priority = 3;
                    cnt ++;
                }
            }else if(a == b && a > c){
                if (priority != 4){
                    priority = 4;
                    cnt ++;
                }
            }
            else if(b == c && b > a){
                if (priority != 5){
                    priority = 5;
                    cnt ++;
                }
            }else if(a == c && a > b){
                if (priority != 6){
                    priority = 6;
                    cnt ++;
                }
            }else if(a == b && b == c){
                if (cnt != 0 && priority != 7){
                    priority = 7;
                    cnt ++;
                }
            }
          
        }
        System.out.println(cnt);
    }

    static void solution(int[]arr, int n ){

    }
}
