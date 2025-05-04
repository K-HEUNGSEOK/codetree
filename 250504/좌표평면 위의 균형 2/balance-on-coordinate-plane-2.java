    import javax.swing.plaf.PanelUI;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws FileNotFoundException {
           
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] x = new int[101];
            int[] y = new int[101];
            boolean[][] position = new boolean[101][101];
            for(int i = 0 ; i < n; i ++){
                int first =sc.nextInt();
                x[first] = 1;
                int second = sc.nextInt();
                y[second] = 1;
                position[first][second] = true;
            }

            int ans = Integer.MAX_VALUE;
            for(int i = 0 ; i < 101; i +=2){
                for(int j = 0 ; j < 101 ; j +=2){
                    int realCount = 0 ;
                    int cnt = 0;
                    //1. x보다 작으면서 y보다도 작은 점의 갯수
                    for(int k = 0; k < i; k ++){
                        for(int l = 0; l < j ; l ++){
                            if (position[k][l]){
                                cnt++;
                            }
                        }
                    }
                    realCount = Math.max(realCount,cnt);

                    cnt = 0;
                    //2. x보다 크면서 y보다도 작은 점의 갯수
                    for(int k = i+1; k < 101; k ++){
                        for(int l = 0; l < j ; l ++){
                            if (position[k][l]){
                                cnt++;
                            }
                        }
                    }
                    realCount = Math.max(realCount,cnt);

                    cnt = 0;
                    //3. x보다 작면서 y보다 큰 점의 갯수
                    for(int k = 0; k < i; k ++){
                        for(int l = j+1; l < 101 ; l ++){
                            if (position[k][l]){
                                cnt++;
                            }
                        }
                    }
                    realCount = Math.max(realCount,cnt);

                    cnt = 0;
                    //4. x보다 크면서 y보다 큰 점의 갯수
                    for(int k = i+1; k < 101; k ++){
                        for(int l = j+1; l < 101 ; l ++){
                            if (position[k][l]){
                                cnt++;
                            }
                        }
                    }
                    realCount = Math.max(realCount,cnt);
                    ans = Math.min(ans,realCount);
                }
            }
            System.out.println(ans);
        }
    }
