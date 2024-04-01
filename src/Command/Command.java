package Command;

public abstract class Command {
    public Player player;

    public Command(Player player) {
        this.player = player;
    }

    public abstract boolean execute();
}
