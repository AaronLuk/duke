package Command;

import Duke.Storage;
import Task.TaskList;
import Task.Task;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class FindCommand extends Command {

    String wordToFind;
    ArrayList<Task> searchResults;

    public FindCommand(String word){
        wordToFind = word;
    }
    @Override
    public void execute(TaskList tasks, Storage storage) throws IOException, ParseException {
        taskMessage ="";
        searchResults = new ArrayList<>();
        for(Task t: tasks.getTasks()){
            if(t.toString().contains(wordToFind)){
                searchResults.add(t);
            }

        }
        if(searchResults.isEmpty()){
            System.out.println("\t Sorry no matches");
        } else {
            int counter = 1;
            for(Task task : searchResults){
                 System.out.println("\t " + counter + ". " + task.toString());
                 taskMessage +=  counter + ". " + task.toString() + "\n";
                 counter++;
            }
        }
    }
}
