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
            for(int i = 1; i < 1000; i ++){
                int [] counting = new int[1000];

                for(int j = 0 ; j < n ; j ++){
                    int value = arr[j] - i;
                    if (value <= 0) continue;
                    counting[value]++;
            }
                int cnt = 0;
                for(int k = 1; k < 1000; k ++){
                    if (counting[k] == 0) continue;
                    for(int l = k + 1; l < 1000; l ++){
                        if (counting[l] == 0){
                            cnt ++;
                            break;
                        }
                    }
                    ans = Math.max(ans,cnt);
                }
        }
            System.out.println(ans);
    }
    }
