import java.util.ArrayList;
import java.util.Scanner;

//declares the Global class which will hold all the global variables
public class Global {
    // the players score
    public static int score = 0;
    // the amount the score will be multiplied by (bonus)
    public static double scoreMulti = 0;
    // the players money
    public static int money = 0;
    // the players ammo
    public static int ammo = 0;
    // the players food
    public static int food = 0;
    // the players oxen
    public static int yokes = 0;
    // the players gun
    public static String gun = "rifle";
    // what month the player chose to leave in
    public static String month = "none";
    public static int day = 1;
    public static int year = 1848;
    public static String location = "Independence";
    public static ArrayList<Companion> theGroup = new ArrayList<Companion>();

    static void clear() {
        // creates 51 new lines clearing any text
        for (int i = 0; i <= 50; i++) {// the variable i will keep track of how many new lines must be created
            System.out.println("");
        }
    }

    public static void store() {
        clear();
        int price;
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                ____________________________________
                Matt's General Store
                """);
        System.out.println(Global.month + " " + Global.day + ", " + Global.year);
        System.out.println("""
                ____________________________________
                1. Oxen
                2. Food
                3. Ammunition
                ____________________________________
                """);
        System.out.println("Wallet: " + Global.money);
        System.out.println("Which item would you like to buy?(type n to leave the store):");
        String choice = scanner.next();
        clear();
        System.out.println("""
                ____________________________________
                Matt's General Store
                """);
        System.out.println(Global.month + " " + Global.day + ", " + Global.year);
        switch (choice) {
            case "1":
                System.out.println("""
                        ____________________________________
                        There are 2 oxen in a yoke;
                        I recommend at least 3 yoke.
                        I charge $40 a yoke.

                        How many yoke do you want?
                        """);
                int newYokes = scanner.nextInt();
                price = newYokes * 40;
                if (price < Global.money) {
                    Global.yokes += newYokes;
                    Global.money -= price;
                }
                store();
                break;
            case "2":
                System.out.println("""
                        ____________________________________
                        I recommend you take at least 200
                        pounds of food for each person in your
                        family. You'll need flour, sugar, bacon and coffee. My price is $1 a pound.

                        How many pounds of food do you want?
                        """);
                int newFood = scanner.nextInt();
                price = newFood;
                if (price < Global.money) {
                    Global.food += newFood;
                    Global.money -= price;
                }
                store();
                break;
            case "3":
                System.out.println("""
                        ____________________________________
                        I sell ammunition in boxes of 20
                        bullets. Each box costs $2

                        How many boxes  do you want?
                        """);
                int newAmmo = scanner.nextInt();
                price = newAmmo * 2;
                if (price < Global.money) {
                    Global.ammo += newAmmo * 20;
                    Global.money -= price;
                }
                store();
                break;
            default:
                clear();
                System.out.println("""
                        Well then, good luck! You have a long
                        and difficult journey ahead of you.
                        """);
                System.out.println("Type anything to go continue: ");
                choice = scanner.next();
                break;
        }
    }
}