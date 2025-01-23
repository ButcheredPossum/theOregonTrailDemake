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
                startGame();
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
        int choice;
        String goBack;
        boolean flag = true;
        System.out.printf("""
                
                ------------
                It is 1848. Your jumping off place for Oregon is
                Independence, Missouri. You must decide which 
                monthv to leave Independence. 
                """);
        while(flag){
            System.out.printf("""
                ------------
                1. March
                2. April
                3. May
                4. June
                4. July
                6. Ask for advice
                """);
            System.out.printf("What is your choice? ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    flag = false;
                    break;
                case 2:
                    flag = false;
                    break;
                case 3:
                    flag = false;
                    break;
                case 4:
                    flag = false;
                    break;
                case 5:
                    flag = false;
                    break;
                case 6:
                    System.out.println("""
                            ------------
                            You attend a public meeting held for
                            'folks with california Oregon fever.'
                            You're told:
                            
                            If you leave too early, there won't be
                            any grass for your oxen to eat. If you
                            leave too late, you might not get to Oregon 
                            before winter comes. If you leave at just the 
                            right time, there will be green grass and the 
                            weather will still be cool. 
                            """);
                    System.out.printf("Type anything to go back: ");
                    goBack = scanner.next();
                    break;
                default:
                    flag = false;
            }
        }

    }
}

