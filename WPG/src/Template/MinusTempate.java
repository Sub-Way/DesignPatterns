package Template;

import java.util.ArrayList;

//QeustionTemplte을 상속받아 빼기 연산자에 대한 Template 정의
public class MinusTempate extends QuestionTemplate {

    public ArrayList<String> question;

    //빼기 연산자에 대한 Template 정의
    public MinusTempate() {
    	question = new ArrayList<String>();
    	question.add("(이름1) 은 (항목) 을 (숫자1) 개 가지고 있습니다. (이름1)은 (이름2)에게 (항목) (숫자2) 개를주었습니다. "
    			+ "(이름)에게 몇 개의 (항목)가 남았습니까?");
    }

    //빼기 연산자에 대한 Template 반환
    public ArrayList<String> questionTemplate() {
        return question;
    }

}