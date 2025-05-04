    import javax.swing.plaf.PanelUI;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) throws FileNotFoundException {
        
            Scanner sc = new Scanner(System.in);
            char[][] arr = new char[3][3];
            for(int i = 0 ; i < 3; i ++){
                arr[i] = sc.next().toCharArray();
            }
            int ans = 0;
            for(int i = 1; i <= 9; i ++){
                for(int j = i+1; j <= 9 ; j ++){
                        if (i == j) continue;
                    int count = 0;
                    count = first(arr,i,j,count);
                    count = width(arr,i,j,count);
                    count = height(arr,i,j,count);
                    count = second(arr, i, j, count);
                    ans +=count;
                }
            }
            System.out.println(ans);
        }

        private static int second(char[][] arr, int i, int j, int count) {
            int cntA =0;
            int cntB =0;
            int index =0;
            for(int k = 2 ; k >= 0 ; k--){
                int second = arr[index++][k] - '0';
                if (second == i) cntA ++;
                if (second == j) cntB ++;
                if (cntA > 0 && cntB > 0 && cntB+ cntA ==3){
                    count++;
                    break;
                }
            }
            return count;
        }

        private static int first(char[][] arr, int i, int j, int count) {
            int cntA = 0;
            int cntB = 0;
            for(int k = 0 ; k < 3; k ++){
                int second = arr[k][k] - '0';
                if (second == i){
                    cntA ++;
                }
                if (second == j){
                    cntB++;
                }
            }
            if (cntA > 0 && cntB>0 && cntB+ cntA == 3){
                count++;
            }
            return count;
        }

        private static int height(char[][] arr, int i, int j, int count) {
            //2.세로 가자
            for(int l = 0 ; l < 3; l ++){
                for(int z = 0 ; z < 3 ; z++){
                    int check = arr[z][l] - '0';
                    if (check == i || check == j){
                        int cntA = 0;
                        if (check == i){
                            cntA ++;
                        }
                        int cntB = 0;
                        if(check == j){
                            cntB ++;
                        }

                        for (int index = z + 1; index < 3; index++){
                            int second = arr[index][l] - '0';
                            if (second == i){
                                cntA ++;
                            }
                            if (second == j){
                                cntB++;
                            }
                        }
                        if (cntA > 0 && cntB > 0 && (cntA+cntB == 3)){
                            count++;
                            break;
                        }
                    }

                }
            }
            return count;
        }

        private static int width(char[][] arr, int i, int j, int count) {
            //1.가로부터 가자
            for(int l = 0 ; l < 3; l ++){
                for(int z = 0 ; z < 3 ; z++){
                    int check = arr[l][z] - '0';
                    if (check == i || check == j){
                        int cntA = 0;
                        if (check == i){
                            cntA ++;
                        }
                        int cntB = 0;
                        if(check == j){
                            cntB ++;
                        }

                        for (int index = z + 1; index < 3; index++){
                            int second = arr[l][index] - '0';
                            if (second == i){
                                cntA ++;
                            }
                            if (second == j){
                                cntB++;
                            }
                        }
                        if (cntA > 0 && cntB > 0 && (cntA+cntB == 3)){
                            count++;
                            break;
                        }
                    }

                }
            }
            return count;
        }
    }