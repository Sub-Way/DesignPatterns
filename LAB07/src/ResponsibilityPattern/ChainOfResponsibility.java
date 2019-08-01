package ResponsibilityPattern;

public class ChainOfResponsibility {
	 
    private static Chain createChain() {
        // Build the chain of responsibility
 
    	Chain chain1 = new LevelA(Chain.One);
 
    	Chain chain2 = new LevelB(Chain.Two);
    	chain1.setNext(chain2);
 
        Chain chain3 = new LevelC(Chain.Three);        
        chain2.setNext(chain3);
 
        return chain1;
    }
 
    public static void main(String[] args) {
 
    	Chain chain = createChain();
 
        chain.message("level 3", Chain.One);
 
        chain.message("level 2", Chain.Two);
 
        chain.message("level 1", Chain.Three);
    }
 
}
