/* 2013112015 ������ */

package Operation;

import java.text.DecimalFormat;
import java.util.ArrayList;

import Storted.*;
import Template.*;

public class Mutiply extends Operation {

	/* ���� ���� �� */
    private ArrayList<PersonName> pname;
    private ArrayList<ItemName> iname;
    private ArrayList<Integer> value;
    public float answer;

    public Mutiply () {
        pname = new ArrayList<PersonName>();
        iname = new ArrayList<ItemName>();
        value = new ArrayList<Integer>();
    }

    /* ���ϱ� �����ڿ� �˸��� �ܾ� ���� template�� �����ϴ� �κ� */
    public String createWordProblem(InputStored input) {
        getRandomInput(input);
        
        /* Template�� �������� �κ� */
        QuestionTemplate templates = new MultiplyTemplate();
        ArrayList<String> multiplyTemplate = templates.questionTemplate();
        String wpg = multiplyTemplate.get(0);

        /* ���ϱ� �ܾ� ���� Template ������ �Է°����� ġȯ�ϴ� �κ� */
        wpg = wpg.replace("(�̸�1)", pname.get(0).name);
        wpg = wpg.replace("(�׸�)", iname.get(0).item);
        wpg = wpg.replace("(����1)", Integer.toString(value.get(0)));
        wpg = wpg.replace("(����2)", Integer.toString(value.get(1)));

        return wpg;
    }

    /* input ���� Random�ϰ� �������� �κ� */
    private void getRandomInput(InputStored input) {
        
        PersonName person1 = input.getRandName(); //(�̸�1)�� �������� �����´�.
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
        Float result = 1.00f;
        for (Integer i : value)
            result *= i;
        DecimalFormat form = new DecimalFormat("0.00");
        answer = Float.parseFloat(form.format(result));
        return answer;
    }

}
