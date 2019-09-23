package Command;

import Task.TaskList;
import Duke.Storage;
import Duke.UI;

/**
 * Shows the all possible commands if user inputs command that does not exist
 */
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
        taskMessage += "-sort <number> to list all tasks with specified priority";
        taskMessage += "-find <word> to find task with specified word\n";
        taskMessage += "-todo <description> <priority> to add todo task reminder\n";
        taskMessage += "-deadline <description> <priority> /by<date/time> to add deadline reminder\n";
        taskMessage += "-event <description> <priority> /at<date/time> to add event reminder\n";
        taskMessage += ui.line();

    }
}
