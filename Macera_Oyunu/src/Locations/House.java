package Locations;

import Player.*;
import Monster.*;

public class House extends SafeLocation{

    public House(ThisPlayer thisPlayer) {
        super(thisPlayer, "Home" , 1);
    }

    @Override
    public boolean onLocation() {
        System.out.println("-------------------------------| Home |-------------------------------");
        System.out.println("Home sweet home");
        System.out.println(" -> Health is Full again.");
        System.out.println("----------------------------------------------------------------------");
        getThisPlayer().setHealth(this.getThisPlayer().getCharhealth());
        return true;
    }
}