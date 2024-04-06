package Command;

import Command.Command;
import Media.MediaBestand;

public class Player {
    public MediaBestand mediaBestand;
    public boolean speeltAf;

    public Player() {
        this.speeltAf = false;
    }
    public void play() {
        executeCommand(new PlayCommand(this));
    }

    public void pause() {
        executeCommand(new PauseCommand(this));
    }

    private void executeCommand(Command command) {
        command.execute();
    }
}