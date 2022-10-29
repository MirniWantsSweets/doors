public class Open extends CodeHandler {
    private String codeOpen;
    public Open(String code, CodeHandler next) {
        super(next);
        this.codeOpen = code;
    }

    @Override
    public void handleCode(String code, Door door) {
        //System.out.println("handle open");
        if(!doorLocked) {
            if(codeOpen.equals(code)) {
                resetDoorState();
                door.open();
            }
            else {
                if (next != null) next.handleCode(code, door);
            }
        } else {
            if (next != null) next.handleCode(code, door);
        }
    }
}