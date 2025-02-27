//declares the Player class
public class Player extends Companion {
    //a constructor used to update the field name
    public Player(String name) {
        super(name);
    }
    //the method shoot prints out whether or not you shot at a target
    //@target - an Enemy object that will take damage
    public void shoot(Enemy target) {
        //checks if you can shoot
        if (Global.gun!="none" && Global.ammo>0) {
            //prints out that you shot at something
            System.out.printf("You shot at one of the " + target.type);
        }else {
            //prints out a statement informing you of your stupidity
            System.out.printf("You forgot that you can't shoot");
        }
    }
}
