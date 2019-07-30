package Template;

import java.util.ArrayList;

//QeustionTemplte을 상속받아 더하기 연산자에 대한 Template 정의
public class PlusTemplate extends QuestionTemplate {

    public ArrayList<String> question;

    public PlusTemplate() {
    	question = new ArrayList<String>();
        this.plusTemplate();
    }

    //더하기 연산자에 대한 Template 정의
    public void plusTemplate() { 
    	question.add("(이름1)은 (항목)을 (숫자1)개 가지고 있습니다. (이름2)은 (항목)을 (숫자2)개 가지고 있습니다." +
                "그들이 가지고 있는 (항목)은 모두 몇 개입니까?");
    }

    //더하기 연산자에 대한 Template 반환
    public ArrayList<String> questionTemplate() {
        return question;
    }
}