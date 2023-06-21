package Locations;

import Player.ThisPlayer;
import Monster.Mosters;

import java.util.Random;

public abstract class BattleArea extends Location {
    private Mosters mosters;
    private String award;
    private String name;
    private final int maxMonsters;

    public BattleArea(ThisPlayer thisPlayer, String name, Mosters mosters, String award) {
        super(thisPlayer, "Battle Map", 10);
        this.mosters = mosters;
        this.name = name;
        this.award = award;
        this.maxMonsters = 3;
    }

    @Override
    public boolean onLocation() {
        int rmonsters = randomMonsters();
        System.out.println("**********************************| " + this.getName() + " |**********************************");
        System.out.println("You have to fight with " + rmonsters + " " + this.getMosters().getName());
        System.out.println("If you win you will going to win " + this.getAward());
        System.out.println("Do you want to Fight : Fight/Run");
        System.out.println("****************************************************************************");
        String selecetCase = scanner.next();
        selecetCase = selecetCase.toUpperCase();
        if (selecetCase.equals("FIGHT") || selecetCase.equals("FİGHT")) {
            if (combat(rmonsters)) {
                System.out.println(this.getName() + " Congratulations you passed this step.");
                return true;
            }
        }

        if (this.getThisPlayer().getHealth() <= 0) {
            System.out.println("Your Dead..!");
            return false;
        }
        return true;
    }

    public boolean combat(int monsterNumber) {
        for (int i = 1; i <= monsterNumber; i++) {
            this.getMosters().setHealthy(this.getMosters().getMainHealhy());
            playerStats();
            monsterStats(i);
            while (this.getThisPlayer().getHealth() > 0 && this.getMosters().getHealthy() > 0) {
                System.out.print("Hit/Run : ");
                String selectCombat = scanner.next().toUpperCase();
                if (selectCombat.equals("HIT") || selectCombat.equals("HİT")) {
                    this.getMosters().setHealthy(this.getMosters().getHealthy() - this.getThisPlayer().getDamage());
                    afterHit();
                    if (this.getMosters().getHealthy() > 0) {
                        System.out.println();
                        System.out.println(this.getMosters().getName() + " attacked to you !!");
                        int dodgeMonster = this.getMosters().getDamage() - this.getThisPlayer().getInventory().getArmorDefence();
                        System.out.println("-> " + this.getThisPlayer().getCharName() + " Health : -" + this.getMosters().getDamage());
                        if (dodgeMonster < 0) {
                            dodgeMonster = 0;
                        }
                        this.getThisPlayer().setHealth(this.getThisPlayer().getHealth() - dodgeMonster);
                        System.out.println(this.getThisPlayer().getCharName() + " Live Health : " + this.getThisPlayer().getHealth());
                        System.out.println("**************************************************************************");
                    }
                } else {
                    return false;
                }

                if (this.getMosters().getHealthy() <= 0) {
                    System.out.println("[" + i + ""+this.getMosters().getName()+"]");
                    System.out.println(this.getMosters().getMoney() + " Piece gold earned.!!");
                    this.getThisPlayer().setMoney(this.getThisPlayer().getMoney() + this.getMosters().getMoney());
                }

                if (i == monsterNumber && this.getMosters().getName().equals("Zombie")){
                    this.getThisPlayer().getInventory().setWater(true);
                    System.out.println("Congelation, you are have a Water");
                }
                if (i == monsterNumber && this.getMosters().getName().equals("Vampire")){
                    this.getThisPlayer().getInventory().setFood(true);
                    System.out.println("Congelation, you are have a Food");
                }
                if (i == monsterNumber && this.getMosters().getName().equals("Bear")){
                    this.getThisPlayer().getInventory().setFireWoord(true);
                    System.out.println("Congelation, you are have a Firewood");
                }
            }
        }
        return false;
    }

    public void afterHit() {
        System.out.println("********************************| Start |*********************************");
        System.out.println(this.getThisPlayer().getCharName() + " attacking !!");
        System.out.println("-> " + this.getMosters().getName() + " Health : -" + this.getThisPlayer().getDamage());
        System.out.println(this.getMosters().getName() + " Live Health : " + this.getMosters().getHealthy());
        System.out.println();
    }

    public void playerStats() {
        System.out.println("**************************************************************************");
        System.out.println(this.getThisPlayer().getCharName() + " Status ");
        System.out.println("[Damage :" + this.getThisPlayer().getTotalDamage() +
                "] [Health : " + this.getThisPlayer().getHealth() +
                "] [Weapon : " + this.getThisPlayer().getInventory().getWeaponName() +
                "] [Weapon Damage : " + this.getThisPlayer().getInventory().getWeaponDamage() +
                "] [Shield : " + this.getThisPlayer().getInventory().getArmorDefence() +
                "] [Gold :   " + this.getThisPlayer().getMoney() + "]");
    }

    public void monsterStats(int i) {
        System.out.println(i + "." + this.getMosters().getName() + " Status ");
        System.out.println("[Damage :" + this.getMosters().getDamage() +
                "] [Health :" + this.getMosters().getHealthy() +
                "] [Reward :" + this.getMosters().getMoney() + " Gold]");
        System.out.println("**************************************************************************");
    }


    public int randomMonsters() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public Mosters getMosters() {
        return mosters;
    }

    public void setMosters(Mosters mosters) {
        this.mosters = mosters;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxMonsters() {
        return maxMonsters;
    }
}