package Locations;
import Player.*;
import Monster.*;

public class River extends BattleArea{

    public River(ThisPlayer thisPlayer){
        super(thisPlayer,"River",new Bear(),"Water");
    }
}