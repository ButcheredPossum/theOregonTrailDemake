//declares the class Companion
public class Companion {
    //the companions hp
    int hp = 20;
    //the companions status
    String status = "healthy";
    //the companions name
    String name;

    //a constructor used to update the field name
    public Companion(String name) {
        this.name = name;
    }
    //the method takeDamage() dictates how much hp is lost and what kind of status the person is in afterwards
    //@type - the type of damage taken
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