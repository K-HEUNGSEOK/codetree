import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int n ,ans;
    static int[] param;
    public static void main(String[] args) throws IOException {
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        param = new int[n];
        ans = 0;
        DFS(0);
        System.out.println(ans);
    }
    static void DFS(int v ){
        if (v == n){
            //여기서 체크해야됨 완성된 조합의 수니까
            String str = "";
            for (int i : param) {
                str += i;
            }
            char[] arr = str.toCharArray();
            int cur;
            for(int i = 0 ; i < arr.length; i ++){
                cur = arr[i] - '0';
                int cnt = 1;
                for(int j = i + 1; j < arr.length ;j ++){
                    if (arr[i] == arr[j]) cnt ++;
                    else{
                        break;
                    }
                }
                if (cnt % cur != 0) return;
                i += cnt -1;
            }
            ans ++;
        }else{
            for(int i = 1 ; i <= 4 ; i ++){
                param[v] = i;
                DFS(v+1);
            }
        }
    }
}