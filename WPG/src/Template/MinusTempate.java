package Template;

import java.util.ArrayList;

//QeustionTemplte�� ��ӹ޾� ���� �����ڿ� ���� Template ����
public class MinusTempate extends QuestionTemplate {

    public ArrayList<String> question;

    //���� �����ڿ� ���� Template ����
    public MinusTempate() {
    	question = new ArrayList<String>();
    	question.add("(�̸�1) �� (�׸�) �� (����1) �� ������ �ֽ��ϴ�. (�̸�1)�� (�̸�2)���� (�׸�) (����2) �����־����ϴ�. "
    			+ "(�̸�)���� �� ���� (�׸�)�� ���ҽ��ϱ�?");
    }

    //���� �����ڿ� ���� Template ��ȯ
    public ArrayList<String> questionTemplate() {
        return question;
    }

}