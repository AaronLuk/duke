package Command;

import Duke.Storage;
import Task.TaskList;
import java.io.IOException;
import java.text.ParseException;

public class ByeCommand extends Command {

    @Override
    public void execute(TaskList tasks, Storage storage) throws IOException, ParseException {

    }

    @Override
    public boolean isExit() {
        super.isExit = true;
        return true;
    }
}

