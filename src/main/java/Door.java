public class Door {
    private String id;
    private CodeHandler codeHandler;
    
    public Door(String id, CodeHandler codeHandler) {
        this.id = id;
        this.codeHandler = codeHandler;
    }
    
    public void processCode(String code) { codeHandler.handleCode(code, this); }
    public void open() { System.out.println("door " + id + " opened"); }
    public String getId() { return id; }
    public void setCodeHandler(CodeHandler ch) { codeHandler = ch; }
    
}