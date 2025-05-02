    import javax.swing.plaf.PanelUI;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
          
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0 ; i < n ; i ++){
                arr[i] = sc.nextInt();
            }
            int ans = Integer.MAX_VALUE;
           //한개를 곱하기 2해
            //그리고 한개를 제외하고 쭉 더해서 그 차이를 빼.
            for(int i = 0 ; i < n ; i ++){
                arr[i] *= 2;

                for(int j = 0 ; j < n ; j ++){
                    int [] counting = new int[n-1];
                    int cnt =0;
                    for(int k = 0 ; k < n ; k ++){
                        if (k == j) continue;
                        counting[cnt++] = arr[k];
                    }

                    int sumdiff = 0;
                    for(int k = 0 ; k < n -2; k ++){
                        sumdiff += Math.abs(counting[k+1] - counting[k]);
                    }
                    ans =Math.min(ans,sumdiff);
                }
                arr[i] /= 2;
            }
            System.out.println(ans);
        }
    }
