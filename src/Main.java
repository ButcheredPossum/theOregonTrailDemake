import java.util.Scanner; //imports scanner
import java.util.ArrayList;

//the main class for the game
//menus
//the main game
public class Main {
	public static void main(String[] args) {
		//calls the mainMenuOptions() function
		mainMenuOptions();
	}
	//the clear() function is used to "refresh" or to "clear" the terminal so that it doesn't get messy
	static void clear() {
		//creates 51 new lines clearing any text
		for (int i=0;i<=50;i++) {//the variable i will keep track of how many new lines must be created
			System.out.println("");
		}
	}
	//the mainMenuOptions() function prints out the main menu and makes you choose what you will do forward
	static void mainMenuOptions() {
		//a variable by the type Scanner with the name scanner
		Scanner scanner = new Scanner(System.in);
		//clears the console
		clear();
		//prints the title of the project
		System.out.println("""
                ------------------------------
                    THE OREGON TRAIL DEMAKE
                ------------------------------
                """);
		//prints out your options
		System.out.println("""
                You may:
                    1. Travel the trail
                    2. How to play
                    3. Quit
                """);
		//asks you what you want to do next
		System.out.printf("What is your choice? ");
		//a variable that will keep track of your choice
		int choice = scanner.nextInt();
		switch(choice){
			case 1:
				//starts the first of the game where you decide how you will start your journey
				startGame();
				break;
			case 2:
				//clears the screen before calling the howToPlay() function
				clear();
				howToPlay();
				break;
			case 3:
				//breaks the switch ending the program
				break;
			default:
				//if the user chooses an unavailable option the function will call itself to reset
				mainMenuOptions();
		}
	}
	//the howToPlay function prints out the instructions for the game after which you will return to the main menu
	static void howToPlay() {
		//a variable by the type Scanner with the name scanner
		Scanner scanner = new Scanner(System.in);
		//prints the instructions onto the console
		System.out.printf("""
                ------------
                How to play?
                ------------
                -Type your choice and click enter.
                -Type y(yes) or n(no) to answer yes or no questions.
                """);
		//tells you that all you got to do is press enter to go back
		System.out.printf("Type anything to go back: ");
		//a variable by the type String with the name choice
		String choice = scanner.next();
		clear();
		mainMenuOptions();
	}
	//the startGame() function will help you decide how you will start your journey
	static void startGame(){
		//a variable by the type Scanner with the name scanner
		Scanner scanner = new Scanner(System.in);
		//a variable by the type int with the name choice
		int choice;
		String name;
		//a variable by the type String with the name choice
		String goBack;
		//a variable by the type boolean with the name flag
		boolean flag = true;

		Player plr;
		Companion cpn;

		//a while loop which runs if flag is true
		while(flag){
			//clears the console
			clear();
			//flavor text
			System.out.printf("""
                    ------------
                    Many kinds of people made the trip to Oregon.
                    You may: 
                    """);
			//prints out the available roles
			System.out.printf("""
                ------------
                1. Be a banker from Boston
                2. Be a carpenter from Ohio
                3. Be a farmer from Illinois
                4. Find out the differences between these choices
                """);
			//asks you for your choice
			System.out.printf("What is your choice? ");
			//updates the choice variable
			choice = scanner.nextInt();
			//depending on the value of choice it will update the global money and scoreMulti variables
			switch(choice) {
				case 1:
					//updates the global money
					Global.money = 800;
					//updates the global scoreMulti
					Global.scoreMulti = 1.0;
					//ends the loop
					flag = false;
					break;
				case 2:
					//updates the global money
					Global.money = 600;
					//updates the global scoreMulti
					Global.scoreMulti = 1.5;
					//ends the loop
					flag = false;
					break;
				case 3:
					//updates the global money
					Global.money = 400;
					//updates the global scoreMulti
					Global.scoreMulti = 2.0;
					//ends the loop
					flag = false;
					break;
				case 4:
					//clears the console
					clear();
					//prints out the differences between the roles
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
					//updates goBack
					goBack = scanner.next();
					//breaks the switch
					break;
				default:
					//resets the function
					startGame();
			}
		}
		//updates flag
		flag = true;

		clear();
		System.out.println("What is the first name of the wagon leader?");
		name = scanner.next();
		plr = new Player(name);
		Global.theGroup.add(plr);
		for (int i = 1; i<4; i++) {
			clear();
			System.out.println("What is the first name of the " + i + " member of the group?");
			name = scanner.next();
			cpn = new Companion(name);
			Global.theGroup.add(cpn);
		}
		clear();
		for (int i = 1; i<=Global.theGroup.size(); i++) {
			System.out.println(i+". "+ Global.theGroup.get(i-1).name);
		}
		System.out.print("Are these names correct?");
		name = scanner.next();
		if (name.equals("n")) {
			System.out.println("Which name?");
			choice = scanner.nextInt();
			System.out.print("New name:");
			Global.theGroup.get(choice).name = scanner.next();
		}

		//a while loop which runs if flag is true
		while(flag){
			//clears the console
			clear();
			//prints out the months that you can leave in
			System.out.printf("""
                    ------------
                    It is 1848. Your jumping off place for Oregon is
                    Independence, Missouri. You must decide which 
                    monthly to leave Independence. 
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
			//asks for your choice
			System.out.printf("What is your choice? ");
			//updates choice
			choice = scanner.nextInt();
			//a switch that depending on choice will update the global month
			switch(choice) {
				case 1:
					//updates the global month
					Global.month = "march";
					//ends the loop
					flag = false;
					break;
				case 2:
					//updates the global month
					Global.month = "april";
					//ends the loop
					flag = false;
					break;
				case 3:
					//updates the global month
					Global.month = "may";
					//ends the loop
					flag = false;
					break;
				case 4:
					//updates the global month
					Global.month = "june";
					//ends the loop
					flag = false;
					break;
				case 5:
					//updates the global month
					Global.month = "july";
					//ends the loop
					flag = false;
					break;
				case 6:
					//clears the console
					clear();
					//prints out the differences between the months
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
					//ends the switch so that you go back to picking a month
					break;
				default:
					//resets the function
					startGame();
			}
		}
	}
}



