import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x1 = new int[101];
        int [] x2 = new int[101];

        for(int i = 0 ; i < n ; i ++){
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0 ; i < n ; i ++){
            boolean checked = false;
            for(int j = 0 ; j < n ; j ++){
                if (i == j) continue;

                if (x1[i] <= x1[j] && x2[i] >= x2[j] || (x1[i] >= x1[j] && x2[i] <= x2[j])){
                    checked = true;
                    break;
                }
            }
            if (!checked){
                count++;
            }
        }
        System.out.println(count);
    }
}
