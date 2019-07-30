package Question;

import java.util.ArrayList;

public class QuestionSheet {
    private ArrayList<Question> questionsheet;

    public QuestionSheet() {

    	QuestionInstance instance = new QuestionInstance();

        QuestionInit initState = new QuestionInit();
        initState.excution(instance);
        questionsheet = initState.getQuestion();

        QuestionMarking endState = new QuestionMarking(questionsheet);
        endState.excution(instance);
    }

    public ArrayList<Question> getQuestionSheet() {
        return questionsheet;
    }
}