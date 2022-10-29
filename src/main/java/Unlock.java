public class Unlock extends CodeHandler {
    private String codeUnLocked;
    public Unlock(String code, CodeHandler next) {
        super(next);
        this.codeUnLocked = code;
    }

    @Override
    protected void handleCode(String code, Door door) {
        if(codeUnLocked.equals(code)) {
            System.out.println("Door unlocked");
            doorLocked = false;
            //if (next != null) next.handleCode(code, door);
        } else {
            if (next != null) next.handleCode(code, door);
        }
    }
}