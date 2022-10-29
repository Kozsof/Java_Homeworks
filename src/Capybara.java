import java.util.Scanner;

public class Capybara {
    protected String capybaraName;
    protected int paws = 4;
    protected int tail = 1;
    protected int teeth = 4;

    public String getCapybaraName() {
        return capybaraName;
    }

    public int getPaws() {
        return paws;
    }

    public void getTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setCapybaraName(String capybaraName) {
        this.capybaraName = capybaraName;
    }

    public void greeting() {
        System.out.println("Hi, I'm Capybara! My name is " + capybaraName + ") I have " + paws + " paws, "
                + teeth + " teeth and " + tail + " tail!");
        System.out.println("What's your name little human?");
        Scanner in = new Scanner(System.in);
        String username;
        username = in.next();
        System.out.println("Great! Nice to meet you, " + username);
    }

    public void printCapybara() {
        System.out.println(" _______/\\_");
        System.out.println("|v     @   \\ ");
        System.out.println("|________   \\____________() ");
        System.out.println("         |                \\ ");
        System.out.println("         |                | ");
        System.out.println("         ( )------------( ) ");
        System.out.println("         (_)            (_) ");
    }

    public void capybaraTest() {
        String[] questions = new String[7];
        questions[0] = "Do you like swimming?";
        questions[1] = "Do you keen on carrot?";
        questions[2] = "Do you fond of sleep all day?";
        questions[3] = "Do you like drive a car?";
        questions[4] = "Do you like stare at something?";
        questions[5] = "Do you love people?";
        questions[6] = "Do you afraid of crocodiles?";
        System.out.println("Hello, you are taking the capybara test");
        System.out.println("Answer the questions only with numbers 1(yes) or 0(no)");
        System.out.println();
        int answer = 2;
        Double countTrue = 0.0;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 7; i++){
            System.out.println(questions[i]);
            Boolean bool = true;
            while (bool){
                answer = in.nextInt();
                if (answer == 1){
                    bool = false;
                }
                else if (answer == 0){
                    bool = false;
                }
                else {
                    System.out.println("Answer the questions only with numbers 1(yes) or 0(no)");
                }
            }

            if (answer == 1){
                countTrue++;
            }
        }
        Double percent = (7.0 / 100.0) * countTrue * 100;
        String res = String.format("%.0f", percent);
        System.out.println();
        System.out.println("You are " + res + "% capybara!");
    }
}
