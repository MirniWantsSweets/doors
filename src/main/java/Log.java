import java.time.LocalDateTime;

public class Log extends CodeHandler {
    public Log(CodeHandler next) {
        super(next);
    }

    @Override
    public void handleCode(String code, Door door) {
        System.out.println("Code of the door: " + code);
        System.out.println("Id of the door: " + door.getId());
        System.out.println("The time and Date is: " + LocalDateTime.now());
        if(doorLocked) System.out.println("State of the door: Door locked");
        else System.out.println("State of the door: Door unlocked");

        if(next != null) next.handleCode(code, door);
    }
}