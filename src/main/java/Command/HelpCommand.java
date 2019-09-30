package Command;

import Duke.Storage;
import Duke.UI;
import Task.TaskList;

public class HelpCommand extends Command {
    @Override
    public void execute(TaskList tasks, Storage storage, UI ui) {
        taskMessage = ui.line() + "\n";
        taskMessage += "Here are the commands:\n";
        taskMessage += "$list to list tasks\n";
        taskMessage += "$done <number> to find task\n";
        taskMessage += "$delete <number> to delete task\n";
        taskMessage += "$sort <number> to list all tasks with specified priority\n";
        taskMessage += "$find <word> to find task with specified word\n";
        taskMessage += "$todo <description> <priority> to add todo task reminder\n";
        taskMessage += "$deadline <description> <priority> /by <DD-MM-YYYY HH:MM> to add deadline reminder\n";
        taskMessage += "$event <description> <priority> /at <DD-MM-YYYY HH:MM> to add event reminder\n";
        taskMessage += ui.line();
    }
}
