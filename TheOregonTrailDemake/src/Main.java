package theOregonTrailDemake;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mainMenuOptions();
    }
    static void clear() {
    	for (int i=0;i<=50;i++) {
    		System.out.printf("""
    				
    				""");
    	}
    }
    static void mainMenuOptions() {
        Scanner scanner = new Scanner(System.in);
        clear();
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
            	clear();
                howToPlay();
                break;
            case 3:
                break;
            default:
            	mainMenuOptions();
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
        clear();
        mainMenuOptions();
    }
    static void startGame(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        String goBack;
        boolean flag = true;
        
        while(flag){
        	clear();
        	System.out.printf("""
                    ------------
                    Many kinds of people made the trip to Oregon.
                    You may: 
                    """);
            System.out.printf("""
                ------------
                1. Be a banker from Boston
                2. Be a carpenter from Ohio
                3. Be a farmer from Illionios
                4. Find out the differences between these choices
                """);
            System.out.printf("What is your choice? ");
            choice = scanner.nextInt();
            switch(choice) {
            	case 1:
            		Global.money = 800;
            		Global.scoreMulti = 1.0;
            		flag = false;
            		break;
            	case 2:
            		Global.money = 600;
            		Global.scoreMulti = 1.5;
            		flag = false;
            		break;
            	case 3:
            		Global.money = 400;
            		Global.scoreMulti = 2.0;
            		flag = false;
            		break;
            	case 4:
            		clear();
               	 	System.out.println("""
                            ------------
                            Traveling to Oregon isn't easy! But if 
                            you're a banker, you'll have more money
                            supplies and services than a carpenter
                            or a farmer.
                            
                            However, the harder you have to try, the
                            more points you deserve! Therefore, the
                            farmer earns the greatest number of points
                            and the banker earns the least.
                            """);
                    System.out.printf("Type anything to go back: ");
                    goBack = scanner.next();
            		break;
            	default:
            		startGame();
            }  
        }
        flag = true;
        
        while(flag){
        	clear();
        	System.out.printf("""
                    ------------
                    It is 1848. Your jumping off place for Oregon is
                    Independence, Missouri. You must decide which 
                    monthv to leave Independence. 
                    """);
            System.out.printf("""
                ------------
                1. March
                2. April
                3. May
                4. June
                5. July
                6. Ask for advice
                """);
            System.out.printf("What is your choice? ");
            choice = scanner.nextInt();
            switch(choice) {
            	case 1:
            		Global.month = "march";
            		flag = false;
            		break;
            	case 2:
            		Global.month = "april";
            		flag = false;
            		break;
            	case 3:
            		Global.month = "may";
            		flag = false;
            		break;
            	case 4:
            		Global.month = "june";
            		flag = false;
            		break;
            	case 5:
            		Global.month = "july";
            		flag = false;
            		break;
            	case 6:
            		clear();
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
            		startGame();
            }
        }
    }
}

class Global {
	public static int score = 0;
	public static double scoreMulti = 0;
	public static int money = 0;
	public static int ammo = 0;
	public static int food = 0;
	public static int clothes = 0;
	public static int oxen = 0;
	public static int medicine = 0;
	public static String gun = "none";
	public static String month = "none";
	public static String location = "Independence";
}

class Companion {
	int hp = 20;
	String status = "healthy";
	String name;
	
	public Companion(String name) {
		this.name = name;
	}
	public void takeDamage(String type) {
		switch(type) {
			case "bit":
				hp -= 5;
				status = "extremeBleeding";
				break;
			case "stabbed":
				hp -= 3;
				status = "mildBleeding";
				break;
			case "poisoned":
				hp -= 2;
				status = "sick";
				break;
			default:
				hp -= 1;
				status = "injured";
		}
		
	}
}

class Player extends Companion {
	public Player(String name) {
		super(name);
	}
	public void shoot(Enemy target) {
		if (Global.gun!="none" && Global.ammo>0) {
			System.out.printf("You shot at one of the " + target.type);
		}else {
			System.out.printf("You forgot that you can't shoot");
		}
	}
}

class Enemy{
	String type;
	int hp;
	public Enemy(String type, int hp){
		this.type = type;
		this.hp = hp;
	}
}
