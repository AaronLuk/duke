package Command;

import Duke.Storage;
import Task.TaskList;
import Duke.UI;
/**
 * Ends the session with user
 */
public class ByeCommand extends Command {


    @Override
    public void execute(TaskList tasks, Storage storage, UI ui) {
        taskMessage = ui.line() + "\n";
        taskMessage += "Bye see you soon";
        taskMessage += ui.line();
    }

    /**
     * Changes state of program to end
     * @return switch to end the session
     */
    @Override
    public boolean isExit() {
        super.isExit = true;
        return true;
    }
}

