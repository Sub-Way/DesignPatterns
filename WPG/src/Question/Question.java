/* 2013112015 ¿”¡¯º∑ */

package Question;

import Operation.*;
import Storted.*;

public class Question {

    private String wgpType; 
    private InputStored input;
    private String wpg;
    private float answer;

    public Question(InputStored input, String wpgType) {
        this.wgpType = wpgType;
        this.input = input;
    }

    public Operation createProblem() {
        OperationType operation = new OperationType();
        Operation question = operation.createOperation(wgpType);
        wpg	= question.createWordProblem(input);
        answer = question.checkResult();

        return question;
    }

    public String getWPG() {
        return wpg;
    }

    public float getAnswer() {
    	System.out.println(answer);
        return answer;
    }

}
