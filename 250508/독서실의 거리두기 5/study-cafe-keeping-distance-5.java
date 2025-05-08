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
            for(int i = 0 ; i < n ; i ++){
                if (arr[i] == '0'){
                    arr[i] = '1';

                    int mins = Integer.MAX_VALUE;
                    for(int j = 0 ; j < n ; j ++){
                        for(int k = j + 1; k < n ; k ++){
                            if (arr[j] == '1' && arr[k] == '1'){
                                mins = Math.min(mins,k - j);
                                break;
                            }
                        }
                    }
                    ans = Math.max(ans,mins);
                    arr[i] = '0';
                }
            }
            System.out.println(ans);
        }

    }