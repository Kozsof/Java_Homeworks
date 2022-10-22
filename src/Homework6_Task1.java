import java.util.Scanner;
public class Homework6_Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Boolean bool;
        byte[] boolArray= new byte[n / 8 + 1];
        int boolLog = 128;
        int boolI = 0;
        for (int i = 0; i < n; i++){
            bool = in.nextBoolean();
            if(boolLog == 0){
                boolI++;
                boolLog = 128;
            }
            if(bool){
                boolArray[boolI] |= boolLog;
            }
            boolLog /= 2;
        }
        for (int k = 0; k < n; k++){
                System.out.println((boolArray[k / 8] & (1 << 7 - (k % 8))) != 0);
        }
    }
}