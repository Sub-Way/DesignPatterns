package ResponsibilityPattern;

class LevelB extends Chain {
    public LevelB(int threshold) { 
        this.Threshold = threshold;
    }
 
    protected void writeMessage(String msg) {
        System.out.println(msg + ":" + "LevelB°¡ Ã³¸®");
    }
}
