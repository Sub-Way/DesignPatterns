package Operation;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import Storted.*;
import Template.*;


public class Division extends Operation {

	/* ���� ���� �� */
    private ArrayList<PersonName> pname;
    private ArrayList<ItemName> iname;
    private ArrayList<Integer> value;
    public float answer;

    public Division () {
        pname = new ArrayList<PersonName>();
        iname = new ArrayList<ItemName>();
        value = new ArrayList<Integer>();
    }

    /* ������ �����ڿ� �˸��� �ܾ� ���� template�� �����ϴ� �κ� */
    public String createWordProblem(InputStored input) {
        getRandominput(input);
        
        /* Template�� �������� �κ� */
        QuestionTemplate templates = new DivisionTemplate();
        ArrayList<String> divisionTemplate = templates.questionTemplate();
        String wpg = divisionTemplate.get(0);

        /* ������ �ܾ� ���� Template ������ �Է°����� ġȯ�ϴ� �κ� */
        wpg = wpg.replace("(�̸�1)", pname.get(0).name);
        wpg = wpg.replace("(�׸�)", iname.get(0).item);
        wpg = wpg.replace("(����1)", Integer.toString(value.get(value.size()-1))); // get the max value
        wpg = wpg.replace("(����2)", Integer.toString(value.get(0))); // get the min value

        return wpg;
    }

    /* input ���� Random�ϰ� �������� �κ� */
    private void getRandominput(InputStored input) {
        
        PersonName person1 = input.getRandName();  //(�̸�1)�� �������� �����´�.
        ItemName item = input.getRandItem(); //(�׸�)�� �������� �����´�.
        int number1 = input.getRandNum(); //(����1)�� �������� �����´�.
        int number2 = input.getRandNum(); //(����2)�� �������� �����´�.

        /* Random �ϰ� �޾ƿ� input���� ArrayList�� �߰��ϴ� �κ� */
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