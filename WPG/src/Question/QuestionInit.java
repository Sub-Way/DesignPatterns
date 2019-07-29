/* 2013112015 ¿”¡¯º∑ */

package Question;

import java.util.ArrayList;
import Storted.InputStored;

public class QuestionInit extends QuestionState {

    ArrayList<Question> question;

    public void excution(QuestionInstance instance) {
        instance.setState(this);
        createProblems();
    }

    private void createProblems() {
        question = new ArrayList<Question>();
        InputStored input = new InputStored();
        input.InputReader();

        int problemCount = input.wpgCount/input.wpgType.size(); 
        int problemRemaining = input.wpgCount - (problemCount * input.wpgType.size());

        for (String ops : input.wpgType)
            for (int i = 0; i < problemCount; i++)
                question.add(new Question(input, ops));

        for (int i = 0; i < problemRemaining; i++)
            question.add(new Question(input, input.wpgType.get(i)));

        for (Question q : question)
            q.createProblem();
    }

    public ArrayList<Question> getQuestion() {
        return question;
    }
}