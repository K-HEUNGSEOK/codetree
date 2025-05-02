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

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;
            for(int h = 1; h < 1000; h ++){
                boolean[] check = new boolean[n];
                for(int i = 0 ; i < n ; i ++){
                    int value = arr[i] - h;
                    if (value <= 0){
                        continue;
                    }
                    check[i] = true;
                }
                int cnt = 0;
                for(int j = 0 ; j < n ; j ++){
                    if (check[j]){
                       int l = j + 1;
                       while (l < n && check[l]){
                           l ++;
                       }
                       cnt ++;
                       j = l;
                    }
                }
                ans = Math.max(ans,cnt);

            }
            System.out.println(ans);
    }
    }
