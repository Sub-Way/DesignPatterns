package Template;

import java.util.ArrayList;

//QeustionTemplte�� ��ӹ޾� ���ϱ� �����ڿ� ���� Template ����
public class PlusTemplate extends QuestionTemplate {

    public ArrayList<String> question;

    public PlusTemplate() {
    	question = new ArrayList<String>();
        this.plusTemplate();
    }

    //���ϱ� �����ڿ� ���� Template ����
    public void plusTemplate() { 
    	question.add("(�̸�1)�� (�׸�)�� (����1)�� ������ �ֽ��ϴ�. (�̸�2)�� (�׸�)�� (����2)�� ������ �ֽ��ϴ�." +
                "�׵��� ������ �ִ� (�׸�)�� ��� �� ���Դϱ�?");
    }

    //���ϱ� �����ڿ� ���� Template ��ȯ
    public ArrayList<String> questionTemplate() {
        return question;
    }
}