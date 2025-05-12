import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        for(int i = 0 ; i < n ; i ++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        boolean check = false; // 스위치
        for(int i = 0 ; i < n ; i ++){
            int[] arr = new int[101]; // 여기에서 체크해볼거임
            boolean second = false;
            for(int j = 0; j < n ; j ++){
                for(int k = x[j]; k <= y[j]; k++){
                    if (i == j) continue;
                    arr[k]++; // 1 2 3 이 다 들어가
                }

                for (int i1 : arr) {
                    if (i1 >= n-1){ // n-1 만큼 차면
                        check = true; // 스위치를 켜주고
                        second = true;
                        break;
                    }
                }
                if (second){
                    break;
                }
            }
            if (second){
                break;
            }
        }

        if (check) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}

