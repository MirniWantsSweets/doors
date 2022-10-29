public class Lock extends CodeHandler {
    public Lock(CodeHandler next) {
        super(next);
    }

    @Override
    protected void handleCode(String code, Door door) {
        if(numTrials == 3) {
            doorLocked = true;
        }      
        if (next != null) next.handleCode(code, door);  
    }
}