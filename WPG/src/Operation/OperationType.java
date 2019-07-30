package Operation;


public class OperationType {

    public Operation createOperation(String type) {
        Operation problem = new Plus();
        if (type.equals("+"))
        	problem = new Plus();
        else if (type.equals("-"))
        	problem = new Minus();
        else if (type.equals("/"))
        	problem = new Division();
        else if (type.equals("*"))
        	problem = new Mutiply();

        return problem;
    }

}