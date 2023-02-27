package basic.array;

public class Array2DQuiz {

	public static void main(String[] args) {

		int [][] score = 
			{
					{79,80,99},//A
					{95,85,89},//B
					{90,65,56},//C
					{69,78,77}//D
			};
		String[] stuName = {"A학생","B학생","C학생","D학생"};
		String[] subName = {"국어","영어","수학"};


		/*
	  각 학생의 평균을 소수점 첫째자리까지 출력
	  각 과목의 평균을 출력
	  반 평균을 출력 
		 */

//		
//		int sum = 0;
//    	double avg = 0.0;
//    	
//    	int avgSu = 0;
//        for (int i = 0; i < stuName.length; i++)// 학생의 방을 만들어준다
//        {
//        	for(int j = 0; j < score[i].length; j++) // 그다음 과목의 방을 만들어준다.
//        	{
//        		sum += score[i][j];  //학생과 과목을 합친다...? 2차원배열의 값을 꺼내서 총합을 구한다.
//        		avgSu += 1; // 평균을 내기 위해 총 갯수를 구한다.
//        	} 
//        }
//           avg = sum / avgSu;
//           System.out.println("총합: "+sum);
//           System.out.println("평균: "+avg);
//        
        double totalAvg = 0.0;    
		int idx = 0; // stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수.
		for (int[] stu : score)
		{
			int total = 0;
			for (int s : stu)
			{
				total += s;
			}
			double avg = total / (double)subName.length;
			totalAvg += avg;
			System.out.printf("%s 평균: %.1f점\n",subName[idx],avg);
			idx++;
		}
		System.out.println("-------------------------------------------------------------------------------");
		
		
		
				for(int i=0; i<stuName.length; i++) {
					int total = 0;
					for(int j=0; j<stuName.length; j++) {
						total += score[j][i];
					}
				double avg =(double) total / stuName.length;
				System.out.printf("%s 평균점수: %.1f점\n", subName[i], avg);
				}
		
	
		double classAvg = totalAvg / stuName.length;
		System.out.printf("우리반 평균: %.1f점\n", classAvg);
		
		
		
		
		

	}

}
