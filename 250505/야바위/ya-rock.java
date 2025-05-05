import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        int [] c = new int[n];

        for(int i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 1 ; i <=3 ; i ++){
            int [] arr = new int[4];
            arr[i] = 1;
            int count = 0;
            for(int j = 0 ; j < n ; j ++){
                int first = a[j];
                int second = b[j];
                int third = c[j];

                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;

                if (arr[third] == 1){
                    count ++;
                }
            }

            ans = Math.max(ans,count);
        }
        System.out.println(ans);
    }
}