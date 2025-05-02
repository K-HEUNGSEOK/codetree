    import javax.swing.plaf.PanelUI;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
        
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] a = new int[n];
            int [] b = new int[n];
            int [] c = new int[n];
            for(int f = 0; f < n ; f ++){
                a[f] = sc.nextInt();
                b[f] = sc.nextInt();
                c[f] = sc.nextInt();
            }

            int ans = 0;

            for(int i = 1 ; i <= 3; i ++){
                int[] arr = new int [4];
                arr[i] = 1;
                int cnt = 0;
                for(int j = 0 ; j < n ; j ++){
                    int x = a[j]; // 1
                    int y = b[j]; // 3
                    int check = c[j]; // 1

                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;


                    if (arr[check] == 1){
                        cnt ++;
                    }
                }
                ans = Math.max(ans,cnt);
            }
            System.out.println(ans);
        }
    }
