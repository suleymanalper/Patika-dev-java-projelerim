package Player;

import java.util.Scanner;

public class ThisPlayer {
    private int damage;
    private int health;
    private String charName;
    private int charhealth;
    private int money;
    private String name;
    private final Scanner scanner = new Scanner(System.in);
    private Inventory inventory;

    public ThisPlayer(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectPlayer() {


        Characters[] charList = {new Samurai(), new Archer(), new Knight()};

        System.out.println("--------------------------------------| Heroes |--------------------------------------");
        for (Characters characters : charList) {
            System.out.println("Character " + characters.getId() + ": " + characters.getName() + " | " +
                    " Health" + ": " + characters.getHealthy() + " | " +
                    " Damage" + ": " + characters.getDamage() + " | " +
                    " Money" + ": " + characters.getMoney() + " | " +
                    " Status " + " -> " + characters.getStatus());

        }
        System.out.println("--------------------------------------------------------------------------------------");
        ;
        System.out.print("Please pick a character (write the number) -> ");

        boolean isCharPicked;
        do {
            switch (scanner.next()) {
                case "1":
                    isCharPicked = true;
                    chosenChar(new Samurai());
                    System.out.println(getCharName() + ": My sword bears witness to my honor, my armor to my strength, and my battles to my determination !");
                    break;
                case "2":
                    isCharPicked = true;
                    chosenChar(new Archer());
                    System.out.println(getCharName() + ": My arrows never miss their mark, my aim is true, and I will rain down upon my enemies like a storm !");
                    break;
                case "3":
                    isCharPicked = true;
                    chosenChar(new Knight());
                    System.out.println(getCharName() + ": My sword is sharp, my shield is sturdy, the day will come when my enemies will weep before me !");
                    break;
                default:
                    System.out.println("You typed an invalid value! Please type the number of the characters");
                    isCharPicked = false;
                    break;
            }
        } while (!isCharPicked);
    }

    public void chosenChar(Characters characters) {
        this.setDamage(characters.getDamage());
        this.setHealth(characters.getHealthy());
        this.setMoney(characters.getMoney());
        this.setCharName(characters.getName());
        this.setCharhealth(characters.getHealthy());
    }

    public void showStatus() {
        int recentMoney = this.getMoney();
        int recentDamage = this.getDamage();
        int recentShield = this.getHealth();
        String recentHero = this.getCharName();
        String recentWeapon = this.getInventory().getWeaponName();

        System.out.println("Your heroes recent informations : ");
        System.out.println("Hero : " + recentHero + ", " +
                "Money : " + recentMoney + ", " +
                "Damage : " + recentDamage + ", " +
                "Health : " + recentShield + ", " +
                "Weapon : " + recentWeapon);
    }

    public void awardStats(){
        System.out.println("Water    : "+this.getInventory().isWater());
        System.out.println("Food     : "+this.getInventory().isFood());
        System.out.println("Firewood : "+this.getInventory().isFireWoord());
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeaponDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTotalHealth() {
        return health + this.getInventory().getArmorDefence();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getCharhealth() {
        return charhealth;
    }

    public void setCharhealth(int charhealth) {
        this.charhealth = charhealth;
    }
}
