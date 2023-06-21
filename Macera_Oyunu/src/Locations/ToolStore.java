package Locations;

import Market.*;
import Player.ThisPlayer;

public class ToolStore extends Location {

    public ToolStore(ThisPlayer thisPlayer) {
        super(thisPlayer, "Market", 2);
    }

    @Override
    public boolean onLocation() {

        System.out.println("\nWELCOME TO TOOLSTORE !");

        System.out.println("-------------------------------| Tool Store |-------------------------------");
        System.out.println("1 - Buy a Weapon");
        System.out.println("2 - Buy a Shield");
        System.out.println("3 - Exit");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Enter id : ");
        int selectGun = scanner.nextInt();
        while (selectGun < 1 || 3 < selectGun) {
            System.out.println("Your input is incorrect please trg again : ");
            selectGun = scanner.nextInt();
        }
        switch (selectGun) {
            case 1:
                printWeapon();
                break;
            case 2:
                printShield();
                break;
            default:
                System.out.println("See you again..");
        }
        return true;
    }

    public void printWeapon() {

        Weapons[] gunList = {new Pistol(), new Rifle(), new Sword()};

        System.out.println("--------------------------------| Weapons |---------------------------------");
        for (Weapons weapons : gunList) {
            System.out.println("Weapon " + weapons.getId() + ": " + weapons.getName() + " | " +
                    " Price" + ": " + weapons.getCost() + " | " +
                    " Damage" + ": " + weapons.getDamage());
        }
        System.out.println("4 - Exit");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Select your Weapon : ");
        int buyGun = scanner.nextInt();
        while (buyGun < 1 || 3 < buyGun) {
            if (buyGun == 4){
                break;
            }else System.out.println("Your input is incorrect please trg again : ");
            buyGun = scanner.nextInt();
        }
        buyWeaponById(buyGun);
    }

    public void printShield() {

        Shield[] shieldList = {new Helmet(), new Armor(), new Aegis()};

        System.out.println("--------------------------------| Shields |---------------------------------");
        for (Shield shield : shieldList) {
            System.out.println("Shield " + shield.getId() + ": " + shield.getName() + " | " +
                    " Price" + ": " + shield.getCost() + " | " +
                    " Dodge" + ": " + shield.getDodge());
        }
        System.out.println("4 - Exit");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Select your Shield : ");
        int buyShield = scanner.nextInt();
        while (buyShield < 1 || 3 < buyShield) {
            if (buyShield == 4){
                break;
            }else System.out.println("Your input is incorrect please trg again : ");
            buyShield = scanner.nextInt();
        }
        buyShieldById(buyShield);
    }


    public void buyWeaponById(int id) {
        Weapons[] weapons = {new Pistol(), new Rifle(), new Sword()};
        for (Weapons weapon : weapons) {
            if (weapon.getId() == id) {
                int cost = weapon.getCost();
                if (this.getThisPlayer().getMoney() >= cost) {
                    int balance = getThisPlayer().getMoney() - cost;
                    this.getThisPlayer().setMoney(balance);
                    System.out.println("You have bought " + weapon.getName() + "!");
                    this.getThisPlayer().getInventory().setWeaponName(weapon.getName());
                    this.getThisPlayer().getInventory().setWeaponDamage(weapon.getDamage());
                    return;
                } else {
                    System.out.println(weapon.getName());
                    System.out.println("You don't have enough money to buy this weapon.");
                    return;
                }
            }
        }
        System.out.println("Invalid weapon ID.");
    }

    public void buyShieldById(int id) {
        Shield[] shieldList = {new Helmet(), new Armor(), new Aegis()};
        for (Shield shield : shieldList) {
            if (shield.getId() == id) {
                int cost = shield.getCost();
                if (this.getThisPlayer().getMoney() >= cost) {
                    int balance = getThisPlayer().getMoney() - cost;
                    this.getThisPlayer().setMoney(balance);
                    System.out.println("You have bought " + shield.getName() + "!");
                    this.getThisPlayer().getInventory().setArmorName(shield.getName());
                    this.getThisPlayer().getInventory().setArmorDefence(shield.getDodge());
                    return;
                } else {
                    System.out.println(shield.getName());
                    System.out.println("You don't have enough money to buy this shield.");
                    return;
                }
            }
        }
        System.out.println("Invalid shield ID.");
    }
}