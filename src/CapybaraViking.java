import java.util.Scanner;

public class CapybaraViking extends Capybara {
    protected int eyes = 1;

    public int getEyes() {
        return eyes;
    }

    @Override
    public void greeting() {
        System.out.println("Hello, I'm CapybaraViking, the defender of the Capybara kingdom! My call sign is "
                + capybaraName + ". Only I have " + (paws - 1) + " paws, only "
                + (teeth - 2) + " teeth, no tail and only " + eyes + "eye!");
        System.out.println("Identify yourself, otherwise I will chop off your head! Answer who are you?");
        Scanner in = new Scanner(System.in);
        String username;
        username = in.next();
        System.out.println("Well, " + username + " My congratulations, you are on the guest lists, this time you are lucky!");
    }
    public void printCapybara() {
        System.out.println(" _______/\\_");
        System.out.println("|v     *   \\ ");
        System.out.println("|________   \\____________ ");
        System.out.println("         |                \\ ");
        System.out.println("         |                | ");
        System.out.println("         (_)------------( ) ");
        System.out.println("                        (_) ");
    }

    public void battleCry(){
        System.out.println("Rrrrr au aua uaua ua uauaaaa, CAAPYYYBARRRRAAAA!");
    }
}