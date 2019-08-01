package ResponsibilityPattern;

class LevelA extends Chain {
    public LevelA(int threshold) { 
        this.Threshold = threshold;
    }
 
    protected void writeMessage(String msg) {
        System.out.println(msg + ":" + "LevelA°¡ Ã³¸®");
    }
}