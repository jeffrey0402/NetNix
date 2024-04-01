package Command;

public class PauseCommand extends Command {
    public PauseCommand(Player player) {
        super(player);
    }

    @Override
    public boolean execute() {
        System.out.println("Pausing...");
        if (!player.speeltAf || player.mediaBestand == null) {
            return false;
        }
        player.speeltAf = false;
        return true;
    }
}
