/* 2013112015 ������ */

package Template;

import java.util.ArrayList;

//QeustionTemplte�� ��ӹ޾� ���ϱ� �����ڿ� ���� Template ����
public class MultiplyTemplate extends QuestionTemplate {

    public ArrayList<String> question;

    //���ϱ� �����ڿ� ���� Template ����
    public MultiplyTemplate() {
    	question = new ArrayList<String>();
    	question.add("(�̸�1)�� (����1)���� (�׸�)�� (����2)���� ������ �ֽ��ϴ�." +
                "(�̸�1)�� ���� (�׸�)�� �� ���Դϱ�?");
    }

    //���ϱ� �����ڿ� ���� Template ��ȯ
    public ArrayList<String> questionTemplate() {
        return question;
    }

}