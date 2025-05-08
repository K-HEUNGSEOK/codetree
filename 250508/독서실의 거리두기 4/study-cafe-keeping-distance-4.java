    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
         
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            char[] arr = sc.next().toCharArray();
            int ans = 0;
            for(int i = 0 ; i < n; i ++){
                for(int j = i + 1; j < n ; j++){
                    if (arr[i] == '0' && arr[j] == '0'){
                        arr[j] = '1';
                        arr[i] = '1';
                        int mins = n;
                        for(int k = 0 ; k < n ; k ++){
                            for(int l = k + 1; l < n ; l++){
                                if (arr[k] == '1' && arr[l] == '1'){
                                    mins = Math.min(mins, l - k);
                                }
                            }
                        }
                        ans = Math.max(ans,mins);
                        arr[i] = '0';
                        arr[j] = '0';
                    }
                }
            }
            System.out.println(ans);
        }
    }