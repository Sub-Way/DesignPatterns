package Operation;

import java.util.ArrayList;

import Storted.*;

public abstract class Operation {

    private ArrayList<PersonName> pname;
    private ArrayList<ItemName> iname;
    private ArrayList<Integer> value;

    public abstract String createWordProblem(InputStored input);
    public abstract float checkResult();

}