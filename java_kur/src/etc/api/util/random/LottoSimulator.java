package etc.api.util.random;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random r = new Random();//랜덤
	
	Set<Integer> set = new HashSet<>();//Set 
	Iterator<Integer> iter = set.iterator();//객체 생성
 
	static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
	static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
	static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
	static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
	static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
	static int failCnt = 0; //꽝 당첨 횟수를 세 줄 변수

	public static int createLotto(){

		/*
		 - 1~45 범위의 난수 6개를 생성하셔서
		  컬랙션 자료형에 넣어서 리턴해 주시면 됩니다.
		 - 난수끼리는 중복이 발생하면 안됩니다.
		 */
	}	

	//보너스 번호를 생성하는 메서드  2등한테만 포함
	public static int createBonusNum(??) {


		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
		  당첨번호들을 피해서 보너스번호 하나만 뽑아 주세요.
		  범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
		 */



	}


	//당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(???,???,???) {

		/*
		 매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
		 내 로또 번호와 당첨번호를 비교하여
		 일치하는 횟수를 세 주신 후 등수를 판단하세요.
		 판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
		 6개 일치 -> 1등
		 5개 일치 + 보너스번호 일치 -> 2등
		 5개 일치 -> 3등
		 4개 일치 -> 4등
		 3개 일치 -> 5등
		 나머지 -> 꽝
		 */

	}





	public static void main(String[] args) {


		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.

		//보너스번호도 하나 고정시키세요.

		while(true) {
			/*
					 - 1등이 당첨 될 때까지 반복문을 돌립니다.
					 - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
					  반복문을 종료합니다.
					 - 로또를 구매하기 위한 금액도 출력하세요. (long)
			 */
		}

	}

}
