package Operation;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import Storted.*;
import Template.*;


public class Minus extends Operation {

	/* ���� ���� �� */
    private ArrayList<PersonName> pname;
    private ArrayList<ItemName> iname;
    private ArrayList<Integer> value;
    public Float answer;

    public Minus () {
        pname = new ArrayList<PersonName>();
        iname = new ArrayList<ItemName>();
        value = new ArrayList<Integer>();
    }

    /* ���� �����ڿ� �˸��� �ܾ� ���� template�� �����ϴ� �κ� */
    public String createWordProblem(InputStored input) {
        getRandomInput(input);
        
        /* Template�� �������� �κ� */
        QuestionTemplate templates = new MinusTempate();
        ArrayList<String> minusTemplate = templates.questionTemplate();
        String wpg = minusTemplate.get(0);

        /* ���� �ܾ� ���� Template ������ �Է°����� ġȯ�ϴ� �κ� */
        wpg = wpg.replace("(�̸�1)", pname.get(0).name);
        wpg = wpg.replace("(�̸�2)", pname.get(1).name);
        wpg = wpg.replace("(�̸�)",pname.get(0).name);
        wpg = wpg.replace("(�׸�)", iname.get(0).item);
        wpg = wpg.replace("(����1)", Integer.toString(value.get(value.size()-1))); // get the max value
        wpg = wpg.replace("(����2)", Integer.toString(value.get(0))); // get the min value

        return wpg;
    }

    /* input ���� Random�ϰ� �������� �κ� */
    private void getRandomInput(InputStored input) {
        PersonName person1 = input.getRandName(); //(�̸�1)�� �������� �����´�.
        // add a different person
        PersonName person2 = person1; //(�̸�2)�� �������� �����´�.
        
        while (person2.name.equals(person1.name)) {
            PersonName tempPerson = input.getRandName();
            if (!tempPerson.name.equals(person1.name))
                person2 = tempPerson;
        }
        
        ItemName item = input.getRandItem(); //(�׸�)�� �������� �����´�.
        int number1 = input.getRandNum(); //(����1)�� �������� �����´�.
        int number2 = number1; //(����2)�� �������� �����´�.

        while (number2 > number1) {
            Integer tempNumber = input.getRandNum();
            if (tempNumber < number1)
                number2 = tempNumber;
        }
        
        /* Random �ϰ� �޾ƿ� input���� ArrayList�� �߰��ϴ� �κ� */
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
