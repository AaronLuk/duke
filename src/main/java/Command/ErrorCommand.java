package Command;

import Task.TaskList;
import Duke.Storage;
import Duke.UI;


public class ErrorCommand extends Command{

    public ErrorCommand(){

    }
    @Override
    public void execute(TaskList tasks, Storage storage, UI ui) {
        taskMessage = ui.line() + "\n";
        taskMessage += "Command does not exist\nThese are the commands:\n";
        taskMessage += "-list to list tasks\n";
        taskMessage += "-done <number> to find task\n";
        taskMessage += "-delete <number> to delete task\n";
        taskMessage += "-find <word> to find task with specified word\n";
        taskMessage += "-todo <description> to add todo task reminder\n";
        taskMessage += "-deadline <description> /by<date/time> to add deadline reminder\n";
        taskMessage += "-event <description> /at<date/time> to add event reminder\n";
        taskMessage += ui.line();

    }
}
