/* 2013112015 ������ */

package Storted;

import java.util.ArrayList;
import java.util.Random;

// buffer�� ����� Input�� �� �������� ���� return ���ִ� ������ �ϴ� Ŭ����
public class InputStored {

	/* ���� ���� �� */
    public ArrayList<String> wpgType; 
    public int wpgCount; 
    public int minOperator;
    public int maxOperator; 
    public ArrayList<PersonName> pName; 
    public ArrayList<ItemName> iName; 

    /* �Է¹��� ������ �����ϴ� �κ� */
    public void InputReader() {
        InputReader input = new InputReader();
        wpgType = input.operationType(); //������ type�� �����ϴ� String type�� ����Ʈ ����
        wpgCount = input.problemCount(); // ������ ������ ��
        minOperator = input.operandMin(); // �ǿ������� �ּ� ����
        maxOperator = input.operandMax(); // �ǿ������� �ִ� ����
        pName = input.personName(); //�ڳ࿡�� �߿��� ������� �̸��� �����ϴ� String type�� ����Ʈ ����
        iName = input.itemName(); // �ڳడ ������ ���� �ִ� �׸��� �̸��� �����ϴ� String type�� ����Ʈ ����
    }

    /* �������� ������� �̸�, �׸� ���� ���õǰ� �ϴ� �κ� */
    
    // �Է¹��� ������� �̸� �� �������� �����Ѵ�.
    public PersonName getRandName() { 
        Random rand = new Random();
        int n = rand.nextInt(pName.size());
        return pName.get(n);
    }

    // �Է¹��� �׸���� �̸� �� �������� �����Ѵ�.
    public ItemName getRandItem() {
        Random rand = new Random();
        int n = rand.nextInt(iName.size());
        return iName.get(n);
    }

    // �Է¹��� �ּڰ��� �ִ��� ���̷� �ǿ������� ������ �����Ѵ�.
    public int getRandNum() {
        Random rand = new Random();
        int n = rand.nextInt(maxOperator-minOperator) + minOperator;
        return n;
    }
}
