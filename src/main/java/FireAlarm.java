public class FireAlarm extends CodeHandler {
    private String codeFire;
    public FireAlarm(String code, CodeHandler nextHandler) {
        super(nextHandler);
        this.codeFire = code;
    }

    @Override
    public void handleCode(String code, Door door) {
        //System.out.println("handle fire alarm");
        if(doorLocked == false) {
            if(codeFire.equals(code)) {
                resetDoorState();
                System.out.print("The fire alarm code is ON \n");
                door.open();
                System.out.print("Fire alarm sent at some private surveillance station \n");
            }
            else {
                if(next != null) next.handleCode(code, door);
            }
        }
    }
}