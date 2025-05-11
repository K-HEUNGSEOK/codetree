import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();

        int [] arr = new int[101];

        for(int i = x1; i <= x2 ; i ++){
          arr[i] ++;
        }
        for(int i = x3; i <= x4 ; i ++){
            arr[i] ++;
        }
        boolean check = false;
        for (int i : arr) {
            if (i >= 2){
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("intersecting");
        }else {
            System.out.println("nonintersecting");
        }
    }
}

