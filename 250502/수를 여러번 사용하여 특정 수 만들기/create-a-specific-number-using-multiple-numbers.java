    import javax.swing.plaf.PanelUI;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
         
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int ans = 0;

            if ( (a + b)  > c){
                ans = Math.max(a,b);
            }else{
            for(int i = 0 ; i < 1000 ; i ++){
                for(int j = 0 ; j < 1000; j ++){
                    int total = a + (a * i) + b + (b * j);
                    if (total > c){
                        break;
                    }
                    ans = Math.max(ans,total);
                }
            }
            }
            System.out.println(ans);
        }
    }
