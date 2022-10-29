public abstract class CodeHandler {
    CodeHandler next;
    protected int numTrials = 0;
    protected static boolean doorLocked = false;

    public CodeHandler(CodeHandler next) {
        this.next = next;
    }

    protected void resetDoorState() {
        this.numTrials = 0;
        this.doorLocked = false;

    }

    protected abstract void handleCode(String code, Door door);
}