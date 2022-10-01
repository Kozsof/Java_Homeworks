import java.util.Scanner;

public class Homework2_Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        String result = String.valueOf(n);
        int count = n % 10;
        if(n % 100 >= 11 && n % 100 <= 14){
            count = 11;
        }
        switch(count){
            case 2:
            case 3:
            case 4:
                result += " TORTA";
                break;
            case 1:
                result += " TORT";
                break;
            default:
                result += " TORTOV";
        }
        System.out.println(result);
    }
}
