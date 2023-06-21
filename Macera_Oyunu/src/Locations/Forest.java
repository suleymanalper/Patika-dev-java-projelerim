package Locations;
import Player.*;
import Monster.*;

public class Forest extends BattleArea{
    public Forest(ThisPlayer thisPlayer){
        super(thisPlayer,"Forest",new Vampire(),"Firewood");
    }
}