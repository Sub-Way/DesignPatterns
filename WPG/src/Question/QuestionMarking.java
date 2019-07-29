/* 2013112015 ������ */

package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class QuestionMarking extends QuestionState {

    private int pass = 0;
    ArrayList<Question> question;

    public QuestionMarking(ArrayList<Question> question) {
        this.question = question;
    }

    @Override
    public void excution(QuestionInstance instacne) {
        instacne.setState(this);
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        for (int i = 0; i < question.size(); i++) {
            Question q = question.get(i);
            System.out.println("\n" + (i+1) + ". " + q.getWPG());
            try {
                input = bufferedReader.readLine();
                input = input.replace(" ", "");
                Float result = Float.parseFloat(input);
                if (result.equals(q.getAnswer())) {
                    System.out.println("�����Դϴ�!");
                    pass += 1;
                }
                else{
                	System.out.println("Ʋ�Ƚ��ϴ�!");
                }
            }
            catch (IOException e) {
                System.err.println(e);
            }
        }
        System.out.println("���� ���� : " + pass + " Ʋ�� ���� : " + (question.size()-pass));
    }
}