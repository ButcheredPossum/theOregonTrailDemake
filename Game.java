import java.util.Scanner; //imports scanner

public class Game {
    static void date() {
        System.out.println(Global.month + " " + Global.day + ", " + Global.year);
    }

    static void image(String img) {
        Scanner scanner = new Scanner(System.in);
        String con;
        Global.clear();
        switch (img) {
            case "Independence":
                System.out.println("Independence");
                date();
                System.out.println("""
                        --------------------------------------------------
                                       x       +          `'::::.
                        .-. ___________|       A_         ______A_
                        |=|/      /    |     /|-|       /       / |
                        |   |____ |_""_|_____||"|______/__/|___/  |_______
                        |__|_[X]_|_____|  ~^~^~^~^ /___|"'__'"| /___/|----
                                                |   |"'||'" |||"'"| ||
                        """);
                System.out.println("Type anything to go continue: ");
                con = scanner.next();
                break;
            default:
                System.out.println("Image not found");
                System.out.println("Type anything to go continue: ");
                con = scanner.next();
                break;
        }
    }

    static void continueOnTrail() {
    }

    static void checkSupplies() {
    }

    static void lookAtMap() {
    }

    static void rest() {
    }

    static void options() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        Global.clear();
        System.out.println("Independence");
        Global.clear();
        System.out.println("""
                You may:
                1. Continue on trail
                2. Check supplies
                3. Look at map
                4. Rest
                5. Buy supplies
                """);
        System.out.println("What will you do? ");
        choice = scanner.next();
        switch (choice) {
            case "1":
                continueOnTrail();
                break;
            case "2":
                checkSupplies();
                break;
            case "3":
                lookAtMap();
                break;
            case "4":
                rest();
                break;
            case "5":
                Global.store();
                break;
            default:
                continueOnTrail();
                break;
        }
    }

    static void main() {
        image("Independence");
        options();
    }

}