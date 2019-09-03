public class AddCommand extends Command{

    private Task task;

    public AddCommand(Task task){
        this.task = task;
    }

    public Task getTask(){
        return task;
    }

    @Override
    public void execute(TaskList tasks, Storage storage) {
        tasks.add(this.task);
        System.out.println("\t Got it I've added this task:");
        System.out.println("\t " + tasks.getLatest());
        System.out.println("\t Now you have " + tasks.getLength() + " in the list");

    }
}
