import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (isCheck(a,b,c)){
            System.out.println(0);
        }else if(isCheck(b+1, b, c)){
            System.out.println(1);
        }else {
            System.out.println(2);
        }
    }
    static boolean isCheck(int a, int b , int c){
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        if (arr[0] == arr[1]-1 && arr[1] == arr[2]-1){
            return true;
        }
        return false;
    }
}
