/* 2013112015 ������ */

package Template;

import java.util.ArrayList;

//QeustionTemplte�� ��ӹ޾� ������ �����ڿ� ���� Template ����
public class DivisionTemplate extends QuestionTemplate {

    public ArrayList<String> question;

    //������ �����ڿ� ���� Template ����
    public DivisionTemplate() {
    	question = new ArrayList<String>();
    	question.add("(�̸�1) �� (�׸�) �� (����1) �� ������ �ֽ��ϴ�. (�̸�1)�� (����2) �� ģ������ �Ȱ��� ������ �ְ�"
    			+ "�ͽ��ϴ�. ���� (�׸�) �� �� ���� ������ �ǳ���?");
    }

  //������ �����ڿ� ���� Template ��ȯ
	public ArrayList<String> questionTemplate() {
		// TODO Auto-generated method stub
		return question;
	}

}