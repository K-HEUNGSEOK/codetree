    import java.io.*;
    import java.sql.SQLOutput;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
        static int [] arr;
        static int [] counting;
        static int [] copy;
        public static void main(String[] args) throws FileNotFoundException {
           
            Scanner sc = new Scanner(System.in);
             arr = new int[15];
             counting = new int[11];
            for(int i = 0 ; i < 15; i ++){
                arr[i] = sc.nextInt();
            }
            copy = new int[11];
            Arrays.sort(arr);

            for(int i = 0; i < 15; i ++){
                for(int j = i+1 ; j < 15 ; j ++){
                    for(int k = j+1 ; k < 15 ; k++){

                        for(int l = k+1 ; l < 15 ;l ++){
                            int a = arr[i];
                            int b = arr[j];
                            int c = arr[k];
                            int d = arr[l];

                            counting[0] = a + b;
                            counting[1] = b + c;
                            counting[2] = c +d;
                            counting[3] = d + a;
                            counting[4] = a + c;
                            counting[5] = b + d;
                            counting[6] = a + b + c;
                            counting[7] = a + b + d;
                            counting[8] = a + c + d;
                            counting[9] = b + c + d;
                            counting[10] = a + b + c + d;
                            int idx =0;
                            for(int m = 0 ; m < 15 ; m ++){
                                if (m == i || m == j || m == k || m == l)continue;
                                copy[idx++] = arr[m];
                            }
                            if(ischeck()){
                                System.out.println(a + " " + b + " " + c + " " + d);
                                return;
                            }


                        }

                    }                }
            }
        }

        private static boolean ischeck() {
            Arrays.sort(copy);
            Arrays.sort(counting);
            for(int i = 0 ; i < 11; i ++){
                if (copy[i] != counting[i]){
                    return false;
                }
            }
            return true;
        }
    }