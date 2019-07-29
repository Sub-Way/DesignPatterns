/* 2013112015 임진섭 */

package Template;

import java.util.ArrayList;

/* 연산의 종류에 따른 알맞은 Template를 제공하기 위해 추상클래스로 정의 */
public abstract class QuestionTemplate {

    public ArrayList<String> question;

    public abstract ArrayList<String> questionTemplate(); // 하위 클래스에서 이용하도록 추상메소드 정의

}
