package ResponsibilityPattern;

class LevelC extends Chain {
    public LevelC(int threshold) { 
        this.Threshold = threshold;
    }
 
    protected void writeMessage(String msg) {
        System.out.println(msg + ":" + "LevelC°¡ Ã³¸®");
    }
}
