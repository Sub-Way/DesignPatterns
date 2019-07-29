/* 2013112015 임진섭 */

package Storted;

import java.util.ArrayList;
import java.util.Random;

// buffer에 저장된 Input값 중 랜덤으로 값을 return 해주는 역할을 하는 클래스
public class InputStored {

	/* 변수 선언 부 */
    public ArrayList<String> wpgType; 
    public int wpgCount; 
    public int minOperator;
    public int maxOperator; 
    public ArrayList<PersonName> pName; 
    public ArrayList<ItemName> iName; 

    /* 입력받은 값들을 저장하는 부분 */
    public void InputReader() {
        InputReader input = new InputReader();
        wpgType = input.operationType(); //문제의 type을 저장하는 String type의 리스트 변수
        wpgCount = input.problemCount(); // 생성된 문제의 수
        minOperator = input.operandMin(); // 피연산자의 최소 범위
        maxOperator = input.operandMax(); // 피연산자의 최대 범위
        pName = input.personName(); //자녀에게 중요한 사람들의 이름을 저장하는 String type의 리스트 변수
        iName = input.itemName(); // 자녀가 관심을 갖고 있는 항목의 이름을 저장하는 String type의 리스트 변수
    }

    /* 랜덤으로 사람들의 이름, 항목 등이 선택되게 하는 부분 */
    
    // 입력받은 사람들의 이름 중 랜덤으로 선택한다.
    public PersonName getRandName() { 
        Random rand = new Random();
        int n = rand.nextInt(pName.size());
        return pName.get(n);
    }

    // 입력받은 항목들의 이름 중 랜덤으로 선택한다.
    public ItemName getRandItem() {
        Random rand = new Random();
        int n = rand.nextInt(iName.size());
        return iName.get(n);
    }

    // 입력받은 최솟값과 최댓값의 사이로 피연산자의 범위를 지정한다.
    public int getRandNum() {
        Random rand = new Random();
        int n = rand.nextInt(maxOperator-minOperator) + minOperator;
        return n;
    }
}
