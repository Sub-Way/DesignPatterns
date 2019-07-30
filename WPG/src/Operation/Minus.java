package Operation;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import Storted.*;
import Template.*;


public class Minus extends Operation {

	/* 변수 선언 부 */
    private ArrayList<PersonName> pname;
    private ArrayList<ItemName> iname;
    private ArrayList<Integer> value;
    public Float answer;

    public Minus () {
        pname = new ArrayList<PersonName>();
        iname = new ArrayList<ItemName>();
        value = new ArrayList<Integer>();
    }

    /* 빼기 연산자에 알맞은 단어 문제 template을 생성하는 부분 */
    public String createWordProblem(InputStored input) {
        getRandomInput(input);
        
        /* Template을 가져오는 부분 */
        QuestionTemplate templates = new MinusTempate();
        ArrayList<String> minusTemplate = templates.questionTemplate();
        String wpg = minusTemplate.get(0);

        /* 빼기 단어 문제 Template 문장을 입력값으로 치환하는 부분 */
        wpg = wpg.replace("(이름1)", pname.get(0).name);
        wpg = wpg.replace("(이름2)", pname.get(1).name);
        wpg = wpg.replace("(이름)",pname.get(0).name);
        wpg = wpg.replace("(항목)", iname.get(0).item);
        wpg = wpg.replace("(숫자1)", Integer.toString(value.get(value.size()-1))); // get the max value
        wpg = wpg.replace("(숫자2)", Integer.toString(value.get(0))); // get the min value

        return wpg;
    }

    /* input 값을 Random하게 가져오는 부분 */
    private void getRandomInput(InputStored input) {
        PersonName person1 = input.getRandName(); //(이름1)을 랜덤으로 가져온다.
        // add a different person
        PersonName person2 = person1; //(이름2)를 랜덤으로 가져온다.
        
        while (person2.name.equals(person1.name)) {
            PersonName tempPerson = input.getRandName();
            if (!tempPerson.name.equals(person1.name))
                person2 = tempPerson;
        }
        
        ItemName item = input.getRandItem(); //(항목)을 랜덤으로 가져온다.
        int number1 = input.getRandNum(); //(숫자1)을 랜덤으로 가져온다.
        int number2 = number1; //(숫자2)를 랜덤으로 가져온다.

        while (number2 > number1) {
            Integer tempNumber = input.getRandNum();
            if (tempNumber < number1)
                number2 = tempNumber;
        }
        
        /* Random 하게 받아온 input값을 ArrayList에 추가하는 부분 */
        pname.add(person1); 
        pname.add(person2);
        iname.add(item);
        value.add(number1); 
        value.add(number2);

    }

    public float checkResult() {
        float result = (float)value.get(value.size()-1);
        for (int i=0; i<value.size()-1; i++)
            result -= value.get(i);
        DecimalFormat form = new DecimalFormat("0.00");
        answer = Float.parseFloat(form.format(result));
        return answer;
    }

}
