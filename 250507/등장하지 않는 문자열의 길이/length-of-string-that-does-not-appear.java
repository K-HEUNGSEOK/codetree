    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws FileNotFoundException {
           
            Scanner sc = new Scanner(System.in);
            int n =  sc.nextInt();
            String str = sc.next();

            for(int i = 1; i <= n ; i++){
                boolean check =false;
                for(int j = 0 ; j <= n - i ; j ++){
                    String sub = str.substring(j,i +j);
                    int index = 0;
                    int count = 0;

                    while (true){
                        index = str.indexOf(sub,index);
                        if (index == -1 ){
                            break;
                        }
                        count ++;
                        if (count > 1){
                            break;
                        }
                        index ++;
                    }

                    if (count > 1){
                        check = true;
                        break;
                    }
                }
                if (!check){
                    System.out.println(i);
                    return;
                }
            }
        }
    }