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

            for(int h = 1 ; h < 1000; h ++){

                boolean [] check = new boolean[n];
                int cnt = 0;
                for(int i = 0 ; i < n ; i ++){
                    if (arr[i] - h > 0){
                        check[i] = true;
                    }
                }
                if (check[0]){
                    cnt++;
                }

                for(int j = 1 ; j < n ; j ++){
                    if (check[j] && !check[j-1]){
                        cnt ++;
                    }
                }
                ans = Math.max(ans,cnt);
            }
            System.out.println(ans);
    }
    }
