/* 2013112015 임진섭 */

package Template;

import java.util.ArrayList;

//QeustionTemplte을 상속받아 나누기 연산자에 대한 Template 정의
public class DivisionTemplate extends QuestionTemplate {

    public ArrayList<String> question;

    //나누기 연산자에 대한 Template 정의
    public DivisionTemplate() {
    	question = new ArrayList<String>();
    	question.add("(이름1) 은 (항목) 을 (숫자1) 개 가지고 있습니다. (이름1)는 (숫자2) 의 친구에게 똑같이 나누어 주고"
    			+ "싶습니다. 각각 (항목) 을 몇 개씩 가지게 되나요?");
    }

  //나누기 연산자에 대한 Template 반환
	public ArrayList<String> questionTemplate() {
		// TODO Auto-generated method stub
		return question;
	}

}