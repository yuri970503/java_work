package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferdQuiz {

	public static void main(String[] args) {
	
		
		
		/*
        1. Date클래스를 이용해서 file폴더 내에 하위 경로로
         오늘 날짜 20230314file 이라는 이름으로 폴더를 생성하세요.
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
         파일을 작성합니다. 
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
        4. '그만'으로 파일이 작성되었다면, 아무방법으로나 
         파일을 읽어서 콘솔에 출력해 보세요.
        */
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		LocalDate now = LocalDate.now();
//		
//		
//		
//		//파일생성
//		 File file = new File("C:\\Work\\folder_txst\\20230314file.txt");
//		 if(!file.exists()) //존재 t 안하면 f
//			 file.mkdir();
//		
//		
//		
//		  //파일명 입력
//		 System.out.print("파일명을 입력해주세요 : ");
//		 String fileName = sc.next();
//		 
//		
//		   FileWriter fw = null;
//		   try {
//			fw = new FileWriter("C:\\Work\\folder_txst\\20230314file.txt");// 위치 지정
//			
//			String str = fileName;
//			
//			
//			fw.write(str);
//			
//			System.out.println("파일이 정상적으로 저장되었습니다.");
//		
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		   
//		   
//		   BufferedWriter bw = null;
//		   try {
//			fw = new FileWriter("C:\\Work\\folder_txst\\20230314file.txt");
//			bw = new BufferedWriter(fw);
//			
//			
//			
//			
//			
//			
//			
//			
//			
//		} catch (IOException e) {
//		
//			e.printStackTrace();
//		
//    }	    
	///////////////////////////////////////////////////////////////////////////////	
		 
		   Scanner sc = new Scanner(System.in);
			
			LocalDateTime ldt = LocalDateTime.now();
			DateTimeFormatter dtf = 
					DateTimeFormatter.ofPattern("yyyyMMdd");
			String today = ldt.format(dtf);
			
			File file = new File("C:\\Work\\file\\" + today + "file");
			
			if(!file.exists()) {
				file.mkdir();
				System.out.println("폴더가 생성됨!");
			} else {
				System.out.println("폴더가 이미 존재함!");
			}
			
			BufferedWriter bw = null;
			String str = null;
			String text = null;
			
			System.out.print("파일명을 입력하세요: ");
			str = sc.nextLine();
			
			try {
				bw = new BufferedWriter(new FileWriter("C:/Work/file/" + today + "file/" + str + ".txt"));
				
				System.out.println("'그만'을 입력하시면 중지됩니다.");
				while(true) {
					System.out.print("하실 말씀: ");
					String str2 = sc.nextLine();
					
					if(str2.equals("그만")) {
						System.out.println("종료합니다.");
						break;
					}
					
					text += (str2 + "\r\n");
				}
				
				bw.write(text);
				System.out.println("파일 작성 완료!");
				
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		   
	///////////파일 읽기//////////////
			
			FileReader fr = null;
			BufferedReader br = null;
			
			try {
				fr = new FileReader("C:/Work/file/" + today + "file/" + str + ".txt");
				br = new BufferedReader(fr);
				
				String read;
				
				while((read = br.readLine()) != null) {
					System.out.println(read);
				}
				
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				try {
					br.close();
					fr.close();
					sc.close();
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		   
		   
		   
		   
		   
		   
		   

		   
		   
		   
		   
		   
		   
		   
		 
		
			
		
		
		
		
		
		
		
		
		
		  
	}

}
