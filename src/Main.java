import Command.PauseCommand;
import Command.PlayCommand;
import Command.Player;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welkom bij NetNix");

        // Command pattern demo
        Player player = new Player();

        // Buttons worden normaal gesproken uitgevoerd door de GUI
        player.play();
        player.pause();
    }
    private Player player;
}