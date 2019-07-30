package Operation;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import Storted.*;
import Template.*;


public class Division extends Operation {

	/* 변수 선언 부 */
    private ArrayList<PersonName> pname;
    private ArrayList<ItemName> iname;
    private ArrayList<Integer> value;
    public float answer;

    public Division () {
        pname = new ArrayList<PersonName>();
        iname = new ArrayList<ItemName>();
        value = new ArrayList<Integer>();
    }

    /* 나누기 연산자에 알맞은 단어 문제 template을 생성하는 부분 */
    public String createWordProblem(InputStored input) {
        getRandominput(input);
        
        /* Template을 가져오는 부분 */
        QuestionTemplate templates = new DivisionTemplate();
        ArrayList<String> divisionTemplate = templates.questionTemplate();
        String wpg = divisionTemplate.get(0);

        /* 나누기 단어 문제 Template 문장을 입력값으로 치환하는 부분 */
        wpg = wpg.replace("(이름1)", pname.get(0).name);
        wpg = wpg.replace("(항목)", iname.get(0).item);
        wpg = wpg.replace("(숫자1)", Integer.toString(value.get(value.size()-1))); // get the max value
        wpg = wpg.replace("(숫자2)", Integer.toString(value.get(0))); // get the min value

        return wpg;
    }

    /* input 값을 Random하게 가져오는 부분 */
    private void getRandominput(InputStored input) {
        
        PersonName person1 = input.getRandName();  //(이름1)을 랜덤으로 가져온다.
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
        float result = ((float)value.get(0))/value.get(1);
        DecimalFormat form = new DecimalFormat("0.00");
        answer = Float.parseFloat(form.format(result));
        //System.out.println(answer);
        return answer;
    }

}