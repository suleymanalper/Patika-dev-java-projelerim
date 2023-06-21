package Locations;
import Player.*;
import Monster.*;

public class Cave extends BattleArea{

    public Cave(ThisPlayer thisPlayer){
        super(thisPlayer,"Cave",new Zombie(),"Food");
    }
}