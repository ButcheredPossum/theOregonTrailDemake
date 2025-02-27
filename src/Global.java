import java.util.ArrayList;
//declares the Global class which will hold all the global variables
public class Global {
    //the players score
    public static int score = 0;
    //the amount the score will be multiplied by (bonus)
    public static double scoreMulti = 0;
    //the players money
    public static int money = 0;
    //the players ammo
    public static int ammo = 0;
    //the players food
    public static int food = 0;
    //the players clothes
    public static int clothes = 0;
    public static int oxen = 0;
    //the players oxen
    public static int medicine = 0;
    //the players gun
    public static String gun = "none";
    //what month the player chose to leave in
    public static String month = "none";
    //where the players is
    public static String location = "Independence";
    public static ArrayList<Companion> theGroup = new ArrayList<Companion>();
}