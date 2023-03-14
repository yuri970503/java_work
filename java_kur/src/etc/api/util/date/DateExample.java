package etc.api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {


		Date date = new Date();//오래된 객체임 사용하는데는 문제 없음
		System.out.println(date);


		System.out.println("----------------------------------------------");

		//현재 날짜 정보 얻기 (연 월 일)
		LocalDate now = LocalDate.now(); //날짜
		System.out.println(now);

		//현재 시간 정보 얻기 (시 분 초)
		LocalTime nowTime = LocalTime.now(); // 시간
		System.out.println(nowTime);

		//현재 날짜와 시간 정보 얻기(연,월,일,시,분,초)
		LocalDateTime localDateTime = LocalDateTime.now(); // 날짜 시간  놔우로 가져온것
		System.out.println(localDateTime);


		//특정 날짜와 시간 정보 얻기
		LocalDateTime beginDate
		= LocalDateTime.of(2022, 7, 1, 9, 0, 0);

		System.out.println("beginDate :" +beginDate);

		//연도 추출
		int year = localDateTime.getYear();
		System.out.println("year: " + year);

		int monthValue = localDateTime.getMonthValue();
		System.out.println("monthValue: " + monthValue);

		Month month = localDateTime.getMonth();
		System.out.println("month: " + month);

		System.out.println("------------------------------------------------------------------------");

		//지금으로부터 3일 뒤
		LocalDateTime returnDate = localDateTime.plusDays(3);
		System.out.println(returnDate);


		//지금으로부터 1년 2개월 7일 뒤

		LocalDateTime d1 = localDateTime
				.plusYears(1)
				.plusMinutes(2)
				.plusDays(7);

		System.out.println(d1);

		//사이 날짜 연산
		LocalDate d = LocalDate.of(2020, 12, 30);

		LocalDate f = LocalDate.of(2022, 9, 14);


		long between = ChronoUnit.WEEKS.between(d, f);
		System.out.println("between" +between);

		System.out.println("_------------------------------------------");

		//날짜 포멧 변경하기

		System.out.println(localDateTime);

		DateTimeFormatter dtf = 
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");

		System.out.println(localDateTime.format(dtf));












	}

}










