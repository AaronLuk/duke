package Duke;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.io.FileWriter;

import Task.Task;
import Task.ToDos;
import Task.Deadlines;
import Task.Events;

/**
 * Reads and writes information from and to file
 */
public class Storage{

    public final static String PATH = "data.txt";
    /**
     * Contructor for storage object
     *
     */
    public Storage(){


    }

    /**
     * Reads tasks from file
     * @return List of tasks
     * @throws FileNotFoundException Inform file does not exist
     */
    public ArrayList<Task> load() throws  FileNotFoundException {
        File file = new File(PATH);
        Scanner sc = new Scanner(file);
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        ArrayList<Task> tasks = new ArrayList<>();

        while(sc.hasNextLine()){
            String[] text = sc.nextLine().split(" \\| ");
            int priority = Integer.parseInt(text[2].trim());
            Task t;
            switch (text[0]){
                case "T":
                    t = new ToDos(text[3], priority);
                    break;
                case "D":
                    t = new Deadlines(text[3], text[4], priority);
                    break;
                case "E":
                    t = new Events(text[3], text[4], priority);
                    break;
                default:
                    t = new Task("", priority);
                    break;
            }
            if (text[1].equals("1")) {
                t.setDone();
            } else {}
            tasks.add(t);
        }
        return tasks;
    }

    /**
     * Writes modifications to the file
     * @param tasks Takes in the list of tasks user had been making changes to
     * @throws IOException Error writing to file
     * @throws ParseException Error writing to file
     */
    public void save(ArrayList<Task> tasks) throws IOException, ParseException {
        FileWriter writer = new FileWriter(PATH);
        for(Task t: tasks){
            writer.write(t.toFile() + System.lineSeparator());
        }
        writer.close();
    }







}
