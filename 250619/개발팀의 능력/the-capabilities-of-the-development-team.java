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
        int n = 5;
        int [] arr = new int[n];
        for(int i = 0; i < n ; i ++){
            arr[i] = sc.nextInt();
        }

        int total = 0;
        for (int i : arr) {
            total +=i ;
        }
        int ans = Integer.MAX_VALUE;
        boolean check = false;
        for(int i = 0 ; i < n ; i ++){
            for(int j = i + 1; j < n ; j ++){
                for(int k = 0; k < n ; k ++){
                    for(int l = k + 1; l < n ; l ++){
                        if (i == k || k == j || l == i || l == j ) continue;
                        int sum1 = arr[i] + arr[j];
                        int sum2 = arr[k] + arr[l];
                        int sum3 = total - sum1 - sum2;
                        if (sum1 == sum2 || sum1 == sum3 || sum2 == sum3) continue;
                        check = true;
                        int maxTeam = Math.max(sum1,sum2);
                        maxTeam = Math.max(maxTeam,sum3);
                        int minTeam = Math.min(sum1,sum2);
                        minTeam = Math.min(minTeam,sum3);
                        ans = Math.min(ans, maxTeam - minTeam);
                    }
                }
            }
        }
        if (check){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }

    }
}
