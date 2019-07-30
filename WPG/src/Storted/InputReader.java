package Storted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// Input���� �о�� �����ϴ� ������ �ϴ� Ŭ����
public class InputReader {

	BufferedReader bufferReader;

	// �о�� Input ���� ������ bufferReader�� �����Ѵ�.
	public InputReader() {
		bufferReader = new BufferedReader(new InputStreamReader(System.in));
	}

	// ������ ������ ���� ������ �����ϴ� ������ �ϴ� �޼ҵ�
	public ArrayList<String> operationType() {
		System.out.print("�������� ������ �����ϼ���.\n" 
				+ "+ (���ϱ� ����)\n"
				+ "- (���� ����)\n" 
				+ "* (���ϱ� ����)\n"
				+ "/ (������ ����)\n" +
				"\n�Է� : ");
		
		String input;
		ArrayList<String> wpgType = new ArrayList<String>();

		try {
			input = bufferReader.readLine();
			input = input.replace(" ", ""); // ������ �����Ѵ�.
			String[] inputString = input.split(",");
			wpgType = new ArrayList<String>(Arrays.asList(inputString));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return wpgType; // ������ Ÿ���� ��ȯ���ش�.
	}

	// ������ ������ ���� �����ϴ� ������ �ϴ� �޼ҵ�
	public int problemCount() {
		int wpgCount=0;
		System.out.print("\n������ ���� ���� �Է��ϼ��� : ");
		try {
			String input = bufferReader.readLine();
			input = input.replace(" ", "");
			wpgCount = Integer.parseInt(input);
		} catch (IOException e) {
			System.err.println(e);
		}
		return wpgCount; // ������ ������ ���� ��ȯ���ش�.
	}


	// �ǿ������� �ּ� ������ �����ϴ� ������ �ϴ� �޼ҵ�
	public int operandMin() {
		Integer minRange = 0;
		System.out.print("\n�����ϰ��� �ϴ� �ǿ������� �ּڰ��� �Է��ϼ���. : ");
		try {
			String input = bufferReader.readLine();
			input = input.replace(" ", "");
			minRange = Integer.parseInt(input);
		}
		catch (IOException e) {
			System.err.println(e);
		}
		return minRange; // �ǿ������� �ּ� ������ ��ȯ���ش�,
	}

	// �ǿ������� �ִ� ������ �����ϴ� ������ �ϴ� �޼ҵ�
	public int operandMax() {
		Integer maxRange = 0;
		System.out.print("\n�����ϰ��� �ϴ� �ǿ������� �ִ��� �Է��ϼ���. : ");

		String input;
		try {
			input = bufferReader.readLine();
			input = input.replace(" ", "");
			maxRange = Integer.parseInt(input);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return maxRange; // �ǿ������� �ִ� ������ ��ȯ���ش�.
	}

	// �ڳ࿡�� �߿��� ������� �̸��� �����ϴ� ������ �ϴ� �޼ҵ�
	public ArrayList<PersonName> personName(){
		ArrayList<PersonName> names = new ArrayList<PersonName>();
		System.out.print("\n�ڳ࿡�� �߿��� ������� �̸��� �Է��ϼ���." + 
				"(��: ö��, ����, �μ� ��) : ");
		String input;
		try {
			input = bufferReader.readLine();
			input = input.replace(" ", "");
			String[] namesArray = input.split(",");
			for (String i : namesArray) {
				names.add(new PersonName(i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return names;
	}

	// �ڳడ ������ ���� �ִ� �׸��� �̸��� �����ϴ� ������ �ϴ� �޼ҵ�
	public ArrayList<ItemName> itemName() {
		ArrayList<ItemName> items = new ArrayList<ItemName>();
		System.out.print("\n�ڳడ ������ ���� �ִ� �׸��� �̸��� �Է��ϼ���." +
				"(��: ����, å, �౸��, ���� ���� ��) : ");
		try {
			String input = bufferReader.readLine();
			input = input.replace(" ", "");
			String[] itemsArray = input.split(",");
			for (String i : itemsArray)
				items.add(new ItemName(i));
		}
		catch (IOException e) {
			System.err.println(e);
		}
		return items;
	}
}