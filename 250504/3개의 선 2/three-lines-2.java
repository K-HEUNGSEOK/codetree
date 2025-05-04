    import javax.swing.plaf.PanelUI;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
      
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] x = new int[21];
            int[] y = new int[21];

            for(int i = 0 ; i < n ; i ++){
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }
            int ans =0;
            for(int i = 0 ; i < 11; i ++){
                for(int j = 0 ; j < 11; j ++){
                    for(int k = 0 ; k < 11; k ++){
                        boolean check = true;

                        for(int l = 0 ; l < n ; l ++){
                            if (x[l] == i || x[l] == j || x[l] == k){
                                continue;
                            }
                            check =false;
                        }

                        if (check){
                            ans =1;
                        }

                        check = true;
                        for(int l = 0 ; l < n ; l ++){
                            if (x[l] == i || x[l] == j || y[l] == k){
                                continue;
                            }
                            check =false;
                        }
                        if (check){
                            ans =1;
                        }

                        check = true;
                        for(int l = 0 ; l < n ; l ++){
                            if (x[l] == i || y[l] == j || y[l] == k){
                                continue;
                            }
                            check =false;
                        }
                        if (check){
                            ans =1;
                        }
                        check = true;
                        for(int l = 0 ; l < n ; l ++){
                            if (y[l] == i || y[l] == j || y[l] == k){
                                continue;
                            }
                            check =false;
                        }
                        if (check){
                            ans =1;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
