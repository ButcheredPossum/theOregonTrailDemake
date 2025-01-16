import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        mainMenuOptions();
    }
    static void mainMenuOptions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                
                ------------------------------
                    THE OREGON TRAIL DEMAKE
                ------------------------------
                """);
        System.out.println("""
                You may:
                    1. Travel the trail
                    2. How to play
                    3. Quit
                """);
        System.out.printf("What is your choice? ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.printf("1");
                break;
            case 2:
                howToPlay();
                break;
            case 3:
                break;
            default:
                System.out.printf("fuck you");
        }
    }

    static void howToPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("""
                
                ------------
                How to play?
                ------------
                -Type your choice and click enter.
                -Type y(yes) or n(no) to answer yes or no questions.
                """);
        System.out.printf("Type anything to go back: ");
        String choice = scanner.next();
        mainMenuOptions();
    }
    static void startGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("""
                
                ------------
                It is 1848. Your jumping off place for Oregon is
                Independence, Missouri. You must decide which 
                monthv to leave Independence. 
                """);
        System.out.printf("""
                1. March
                2. April
                3. May
                4. June
                4. July
                6. Ask for advice
                """);
        System.out.printf("What is your choice? ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
        }
    }
}