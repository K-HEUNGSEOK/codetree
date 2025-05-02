    import javax.swing.plaf.PanelUI;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
           
            Scanner sc = new Scanner(System.in);
            int cnt = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int i = x; i <= y; i ++){
                if (i == binary(i)){
                    cnt ++;
                }
            }
            System.out.println(cnt);
    }
    static int binary(int i){
            int original = i;
            int result = 0;
            while (i > 0){
                result = result * 10 + (i % 10);
                i /= 10;
            }
            return result;
    }
    }
