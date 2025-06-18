import java.io.*;
import java.nio.Buffer;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[101];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            char z = sc.next().charAt(0);
            arr[p] = z;
        }
        int ans = 0 ;
        for(int i = 1 ; i <= 100; i ++){
            if (arr[i] == 'G' || arr[i] == 'H'){
                for(int j = i + 1; j <= 100; j ++){
                    if (arr[j] != 'G' && arr[j] !='H'){
                        continue;
                    }
                    int cntG = 0;
                    int cntH = 0 ;
                    for(int k = i; k <= j; k ++){
                        if (arr[k] == 'G'){
                            cntG ++;
                        }else if(arr[k] == 'H'){
                            cntH ++;
                        }
                    }
                    if (cntG != 0 && cntH ==0){
                        ans = Math.max(ans,j-i);
                    }else if(cntH != 0 && cntG ==0){
                        ans = Math.max(ans,j-i);
                    }else if(cntH != 0 && cntG == cntH){
                        ans = Math.max(ans,j -i);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
