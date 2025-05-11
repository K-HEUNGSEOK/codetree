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

      
        boolean check = true;
        if (x2 < x3 || x4 < x1){
            check = false;
        }
        if (check){
            System.out.println("intersecting");
        }else {
            System.out.println("nonintersecting");
        }
    }
}

