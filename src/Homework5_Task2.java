import java.util.Scanner;

public class Homework5_Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m, ch = 0;
        n = in.nextInt();
        m = in.nextInt();
        int[][] mass = new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i % 2 == 0){
                    mass[i][j] = ch;
                }
                else{
                    int c = m * i ;
                    mass[i][j] = c + (m - j) - 1;
                }
                ch += 1;
                System.out.print(mass[i][j] + "\t");
            }
             System.out.println();
        }
    }
}
