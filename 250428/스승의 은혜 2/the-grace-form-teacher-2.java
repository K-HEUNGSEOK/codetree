import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int p = sc.nextInt();
        int [] box = new int[1001];

        for(int i = 0 ; i < n ; i ++){
            box[i] = sc.nextInt();
        }
        Arrays.sort(box,0,n);
      
        int ans = 0;
        for(int i = 0 ; i < n; i ++){
            box[i] /= 2;
            int count = 0;
            int total = 0 ;
            for(int j = 0 ; j < n ; j ++){
                total += box[j];
                if (total > p){
                    break;
                }
                count++;
            }
            ans = Math.max(ans,count);
            box[i] *= 2;
        }
        System.out.println(ans);
    }
}
