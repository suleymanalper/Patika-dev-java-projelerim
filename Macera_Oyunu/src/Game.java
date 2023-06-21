import Locations.*;
import Player.*;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private String playerName;

    public void start(){
        System.out.print("\nWelcome to Adventure game island Mr / Mrs : ");
        playerName = scanner.next();
        System.out.println("In this island you are going to explore your real fear !!\n");

        System.out.println("Which character do you want to be " + playerName);
        ThisPlayer player = new ThisPlayer(playerName);
        player.selectPlayer();

        Location location = null;

        while (true) {

            System.out.println("\n<-------------------------------| Locations |------------------------------->");
            System.out.println("1 - Home   --> You can rest here");
            System.out.println("2 - Market --> You can buy weapons and shields here");
            System.out.println("3 - Cave   --> [Level 1] battle place");
            System.out.println("4 - Fores  --> [Level 2] battle place");
            System.out.println("5 - River  --> [Level 3] battle place");
            System.out.println("0 - Finish the Game");
            System.out.println("X - Show Awards");
            System.out.println("<--------------| If you want to check your status type: Status |------------>");
            System.out.print("Enter id of location : ");
            String selectLoc = scanner.next();
            selectLoc = selectLoc.toUpperCase();
            switch (selectLoc) {
                case "0":
                    location = null;
                    break;
                case "1":
                    location = new House(player);
                    break;
                case "2":
                    location = new ToolStore(player);
                    break;
                case "3":
                    location = new Cave(player);
                    break;
                case "4":
                    location = new Forest(player);
                    break;
                case "5":
                    location = new River(player);
                    break;
                case "STATUS":
                    player.showStatus();
                    continue;
                case "X":
                    player.awardStats();
                    continue;
                default:
                    location = new House(player);
            }

            if (location == null){
                System.out.println("Even though you left the game in fear, remember that it's just a game and your safety always comes first.");
                System.out.println("Don't worry, there's no shame in admitting when something is too much for you.");
                System.out.println("Take care and stay safe!");
                break;
            }
            if (!location.onLocation()){
                System.out.println("GAME OVER..");
                break;
            }
        }
    }
}