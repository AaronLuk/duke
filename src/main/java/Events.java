public class Events extends Item {

    private String time;
    private String event;
    public Events(String name, String time){
        super(name);
        this.time = time;
        event = "[E]";
    }

    public String toString(){
        if(done){
            return event + "[✓] " + name + " (at: " + time.substring(3) + ")";
        } else {
            return event + "[X] " + name + " (at: " + time.substring(3) + ")";
        }
    }
}
