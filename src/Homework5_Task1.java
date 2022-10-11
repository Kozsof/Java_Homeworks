import java.util.Scanner;

public class Homework5_Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m;
        n = in.nextInt();
        m = in.nextInt();
        int [][] mass = new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mass[i][j] = i * j;
               // System.out.print(mass[i][j] + "\t");
            }
           // System.out.println();
        }
    }
}
