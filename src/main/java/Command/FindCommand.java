package Command;

import Duke.Storage;
import Task.TaskList;
import Task.Task;
import Duke.UI;
/**
 * Executable to find all tasks for the user
 */
import java.util.ArrayList;

public class FindCommand extends Command {

    String wordToFind;
    ArrayList<Task> searchResults;

    /**
     * Constructs find command class
     * @param word to find in list of tasks
     */
    public FindCommand(String word){
        wordToFind = word.trim();
    }

    /**
     * Performs action to find tasks containing specified word
     * @param tasks list of tasks
     * @param storage loads and saves list of tasks to file
     */
    @Override
    public void execute(TaskList tasks, Storage storage, UI ui)  {
        taskMessage = ui.line() + "\n";
        searchResults = new ArrayList<>();
        for(Task t: tasks.getTasks()){
            if(t.toString().contains(wordToFind)){
                searchResults.add(t);
            }

        }
        if(searchResults.isEmpty()){
            taskMessage += "\t Sorry no matches\n";
        } else {
            int counter = 1;
            for(Task task : searchResults){
                 System.out.println("\t " + counter + ". " + task.toString());
                 taskMessage +=  counter + ". " + task.toString() + "\n";
                 counter++;
            }

        }
        taskMessage += ui.line();
    }
}
