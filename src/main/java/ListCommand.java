public class ListCommand extends Command{

    @Override
    public void execute(TaskList tasks, Storage storage) {
        System.out.println(tasks.toString());

    }
}