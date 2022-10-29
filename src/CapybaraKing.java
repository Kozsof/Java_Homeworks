import java.util.Scanner;

public class CapybaraKing extends CapybaraViking{
   protected int weight = 70;

   public int getWeight() {
      return weight;
   }


   @Override
    public void greeting() {
        System.out.println("Hello, I'm CapybaraKing, the king of all capybaras! My name is "
                + capybaraName + ". Only I have " + paws + " paws, "
                + teeth * 2 + " teeth, " + tail + " tail and " + weight + "weight!");
        System.out.println("I can't sign a deal with you, first tell me how I can contact you?");
        Scanner in = new Scanner(System.in);
        String username;
        username = in.next();
        System.out.println("My respects to you, " + username + ", now we are partners!");
    }
    @Override
    public void printCapybara() {
        System.out.println("      |^^^^|");
        System.out.println(" _____|_/\\_|");
        System.out.println("|v     @   \\ ");
        System.out.println("|________   \\____________() ");
        System.out.println("         |                \\ ");
        System.out.println("         |                | ");
        System.out.println("         ( )------------( ) ");
        System.out.println("         (_)            (_) ");
    }
}
