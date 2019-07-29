/* 2013112015 임진섭 */

package Template;

import java.util.ArrayList;

//QeustionTemplte을 상속받아 곱하기 연산자에 대한 Template 정의
public class MultiplyTemplate extends QuestionTemplate {

    public ArrayList<String> question;

    //곱하기 연산자에 대한 Template 정의
    public MultiplyTemplate() {
    	question = new ArrayList<String>();
    	question.add("(이름1)은 (숫자1)개의 (항목)을 (숫자2)묶음 가지고 있습니다." +
                "(이름1)은 전부 (항목)이 몇 개입니까?");
    }

    //곱하기 연산자에 대한 Template 반환
    public ArrayList<String> questionTemplate() {
        return question;
    }

}