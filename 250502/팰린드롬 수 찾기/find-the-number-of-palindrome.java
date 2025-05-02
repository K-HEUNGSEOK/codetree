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
            int [] arr = new int[21];
            int index = 0;
            while (i > 0){
                arr[index ++] = i % 10;
                i /= 10;
            }
            for(int j = index-1 ; j > 0; j -- ){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }

            StringBuilder sb = new StringBuilder();
        for(int j = 0; j < index; j ++){
            sb.append(arr[j]);
        }
        Integer result = Integer.valueOf(sb.toString());
        return result;
    }
    }
