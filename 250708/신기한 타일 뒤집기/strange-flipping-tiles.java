import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    static int [] dy;
    public static void main(String[] args) throws FileNotFoundException {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 100000;
        int [] arr = new int[max];
        int current = 1000;

        for(int i = 0; i < n ; i ++){
            int way = sc.nextInt();
            char direct = sc.next().charAt(0);
            if (direct == 'R'){
                int move = current + way;
                int temp = current;
                for(int j = temp; j < move ; j ++){
                    arr[j] = 2;
                }
                current += way-1;
            }else{
                int move = current - way + 1;
                int temp = current;
                for(int j = temp; j >= move ; j --){
                    arr[j] = 1;
                }
                current = current - way + 1;
            }
        }
        int w = 0, b = 0;
        for(int i = 0; i < arr.length; i ++){
            if (arr[i] == 1){
                w ++;
            }else if(arr[i] == 2){
                b ++;
            }
        }
        System.out.println(w + " " + b);
    }
}
