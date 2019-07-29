/* 2013112015 임진섭 */

package Operation;

import java.text.DecimalFormat;
import java.util.ArrayList;

import Storted.*;
import Template.*;

public class Mutiply extends Operation {

	/* 변수 선언 부 */
    private ArrayList<PersonName> pname;
    private ArrayList<ItemName> iname;
    private ArrayList<Integer> value;
    public float answer;

    public Mutiply () {
        pname = new ArrayList<PersonName>();
        iname = new ArrayList<ItemName>();
        value = new ArrayList<Integer>();
    }

    /* 곱하기 연산자에 알맞은 단어 문제 template을 생성하는 부분 */
    public String createWordProblem(InputStored input) {
        getRandomInput(input);
        
        /* Template을 가져오는 부분 */
        QuestionTemplate templates = new MultiplyTemplate();
        ArrayList<String> multiplyTemplate = templates.questionTemplate();
        String wpg = multiplyTemplate.get(0);

        /* 곱하기 단어 문제 Template 문장을 입력값으로 치환하는 부분 */
        wpg = wpg.replace("(이름1)", pname.get(0).name);
        wpg = wpg.replace("(항목)", iname.get(0).item);
        wpg = wpg.replace("(숫자1)", Integer.toString(value.get(0)));
        wpg = wpg.replace("(숫자2)", Integer.toString(value.get(1)));

        return wpg;
    }

    /* input 값을 Random하게 가져오는 부분 */
    private void getRandomInput(InputStored input) {
        
        PersonName person1 = input.getRandName(); //(이름1)을 랜덤으로 가져온다.
        ItemName item = input.getRandItem(); //(항목)을 랜덤으로 가져온다.
        int number1 = input.getRandNum(); //(숫자1)을 랜덤으로 가져온다.
        int number2 = input.getRandNum(); //(숫자2)를 랜덤으로 가져온다.

        /* Random 하게 받아온 input값을 ArrayList에 추가하는 부분 */
        pname.add(person1);
        iname.add(item);
        value.add(number1);
        value.add(number2);
    }

    public float checkResult() {
        Float result = 1.00f;
        for (Integer i : value)
            result *= i;
        DecimalFormat form = new DecimalFormat("0.00");
        answer = Float.parseFloat(form.format(result));
        return answer;
    }

}
