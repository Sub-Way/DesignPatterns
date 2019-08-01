package ResponsibilityPattern;

abstract class Chain {
    public static int One = 1;
    public static int Two = 2;
    public static int Three = 3;
    protected int Threshold;
 
    protected Chain next;
 
    public void setNext(Chain chain) {
        next = chain;
    }
 
    public void message(String msg, int priority) {
        
    	if (priority == Threshold) {
            writeMessage(msg);
        }
 
    	if (next != null) {
            next.message(msg, priority);
        }
    }
 
    abstract protected void writeMessage(String msg);
}
