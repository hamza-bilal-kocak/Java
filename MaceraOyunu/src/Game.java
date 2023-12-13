import java.util.Scanner;

public class Game {
    public Player player;
    public Location location;

    Scanner scanner = new Scanner(System.in);
    public void login(){
        System.out.println("Welcome To The Advanture Game");
        System.out.println("Plese enter your name before the game start:");
        String playerName = scanner.nextLine();
        player = new Player(playerName);
        player.selectCha();
    }
    public void start(){

    }

}
