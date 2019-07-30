package Storted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// Input값을 읽어와 저장하는 역할을 하는 클래스
public class InputReader {

	BufferedReader bufferReader;

	// 읽어온 Input 값을 저장할 bufferReader를 생성한다.
	public InputReader() {
		bufferReader = new BufferedReader(new InputStreamReader(System.in));
	}

	// 연산의 종류에 대한 정보를 저장하는 역할을 하는 메소드
	public ArrayList<String> operationType() {
		System.out.print("연산자의 종류를 선택하세요.\n" 
				+ "+ (더하기 문제)\n"
				+ "- (빼기 문제)\n" 
				+ "* (곱하기 문제)\n"
				+ "/ (나누기 문제)\n" +
				"\n입력 : ");
		
		String input;
		ArrayList<String> wpgType = new ArrayList<String>();

		try {
			input = bufferReader.readLine();
			input = input.replace(" ", ""); // 공백을 제거한다.
			String[] inputString = input.split(",");
			wpgType = new ArrayList<String>(Arrays.asList(inputString));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return wpgType; // 연산자 타입을 반환해준다.
	}

	// 생성할 문제의 수를 저장하는 역할을 하는 메소드
	public int problemCount() {
		int wpgCount=0;
		System.out.print("\n생성할 문제 수를 입력하세요 : ");
		try {
			String input = bufferReader.readLine();
			input = input.replace(" ", "");
			wpgCount = Integer.parseInt(input);
		} catch (IOException e) {
			System.err.println(e);
		}
		return wpgCount; // 생성할 문제의 수를 반환해준다.
	}


	// 피연산자의 최소 범위를 저장하는 역할을 하는 메소드
	public int operandMin() {
		Integer minRange = 0;
		System.out.print("\n연산하고자 하는 피연산자의 최솟값을 입력하세요. : ");
		try {
			String input = bufferReader.readLine();
			input = input.replace(" ", "");
			minRange = Integer.parseInt(input);
		}
		catch (IOException e) {
			System.err.println(e);
		}
		return minRange; // 피연산자의 최소 범위를 반환해준다,
	}

	// 피연산자의 최대 범위를 저장하는 역할을 하는 메소드
	public int operandMax() {
		Integer maxRange = 0;
		System.out.print("\n연산하고자 하는 피연산자의 최댓값을 입력하세요. : ");

		String input;
		try {
			input = bufferReader.readLine();
			input = input.replace(" ", "");
			maxRange = Integer.parseInt(input);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return maxRange; // 피연산자의 최대 범위를 반환해준다.
	}

	// 자녀에게 중요한 사람들의 이름을 저장하는 역할을 하는 메소드
	public ArrayList<PersonName> personName(){
		ArrayList<PersonName> names = new ArrayList<PersonName>();
		System.out.print("\n자녀에게 중요한 사람들의 이름을 입력하세요." + 
				"(예: 철수, 영희, 민수 등) : ");
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

	// 자녀가 관심을 갖고 있는 항목의 이름을 저장하는 역할을 하는 메소드
	public ArrayList<ItemName> itemName() {
		ArrayList<ItemName> items = new ArrayList<ItemName>();
		System.out.print("\n자녀가 관심을 갖고 있는 항목의 이름을 입력하세요." +
				"(예: 인형, 책, 축구공, 비디오 게임 등) : ");
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