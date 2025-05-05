        import javax.swing.plaf.PanelUI;
        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.util.Arrays;
        import java.util.Scanner;
    
        public class Main {
    
            public static void main(String[] args) throws FileNotFoundException {
              
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                String str = sc.next();
                char[] target = str.toCharArray();
                for(int i = 0 ; i < 1; i ++){
                    for(int j = i+1 ; j <= n; j ++){
                        String sub = str.substring(i,j); //A;
                        String copy = str;
                        int count = 0;
                        int index = 0;
                        while (true){
                            int len = copy.length();
                            index = copy.indexOf(sub,index);
                            if (index == -1){
                                break;
                            }
                            copy = copy.substring(0,index) + copy.substring(index,len);
                            index += 1;
                            count ++;
                        }
    
                        if (count == 1){
                            System.out.println(j);
                            break;
                        }
                    }
                }
            }
        }