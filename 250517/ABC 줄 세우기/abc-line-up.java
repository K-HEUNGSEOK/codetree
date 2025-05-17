import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        //먼저 비교 할 알파벳 배열을 만든다.
        char [] alphabet = new char[n];
        for(int i = 0 ; i < n ; i ++){
            alphabet[i] = (char) (65 + i);
        }
        //입력을 받자
        char [] arr = new char[n];
        for(int i = 0; i < n ; i ++){
            arr[i] = sc.next().charAt(0);
        }

        int index = 0;
        while (true){
            boolean check = true;
            for(int i = 0 ; i < n ; i ++){
                if (arr[i] != alphabet[i]){
                    check =false;
                    break;
                }
            }
            if (check){
                break;
            }
            if (alphabet[index] != arr[index] && index <= n){
                char temp = arr[index];
                arr[index] = arr[index+1];
                arr[index +1] = temp;
            }
            index++;

        }
        System.out.println(index-1);
    }
}
