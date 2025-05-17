import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
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
        int cnt = 0;

        for(int i = 0 ; i < n ; i ++){
            for(int j = i ; j < n ; j ++){
                if (arr[j] == alphabet[i]) {
                    // 위치 맞는 문자 발견 → 그때만 이동
                    for (int k = j; k > i; k--) {
                        char temp = arr[k];
                        arr[k] = arr[k - 1];
                        arr[k - 1] = temp;
                        cnt++;
                    }
                    break; // 찾았으면 더 이상 j 증가할 필요 없음
            }
        }
    }
        System.out.println(cnt);
}}
