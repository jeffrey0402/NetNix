package Command;

public class PlayCommand extends Command {

    public PlayCommand(Player player) {
        super(player);
    }

    @Override
    public boolean execute() {
        System.out.println("Playing...");
        if (player.speeltAf || player.mediaBestand == null) {
            return false;
        }

        player.speeltAf = true;
        return true;
    }
}