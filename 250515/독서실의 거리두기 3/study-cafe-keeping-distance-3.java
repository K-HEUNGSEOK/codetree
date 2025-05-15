import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int maxDist = 0;
        int maxI = 0 ; int maxJ = 0;
        for(int i = 0; i < n ; i ++){
            if(arr[i] == '1'){
                for(int j = i + 1; j < n ; j ++){
                    if (arr[j] == '1'){
                        if (j - i > maxDist){
                            maxDist = j - i;
                            maxI = i;
                            maxJ = j;
                        }
                        break;
                    }
                }
            }
        }
        arr[(maxI + maxJ) / 2] = '1';
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n ; i ++){
            if (arr[i] == '1'){
                for(int j = i + 1; j < n ; j ++){
                    if (arr[j] == '1'){
                        ans = Math.min(ans,j - i);
                        break;
                    }
                }
            }
        }
        System.out.println(ans);

    }
}
