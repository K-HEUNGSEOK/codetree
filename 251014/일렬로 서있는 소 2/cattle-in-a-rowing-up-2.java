
    import java.io.*;
    import java.io.FileInputStream;
    import java.io.IOException;
    import java.util.Scanner;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
     
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i ++) arr[i] = sc.nextInt();
            int ans = 0;
            for(int i = 0 ; i < n ; i ++){
                for(int j = i + 1 ; j < n ; j ++){
                    for(int k = j + 1; k < n ; k ++){
                        if(arr[i] <= arr[j] && arr[j] <= arr[k]) ans++;
                    }
                }
            }
            System.out.println(ans);

        }
    }