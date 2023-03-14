package etc.api.io.streame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {
	
/*
		1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
        
        2. file폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.
        
        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
       
        
        */
		
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("파일명을 입력해주세요");
		String Filem = sc.next();
		
        if(Filem.equals("hello"))
	      {try {	
			oldFile = new FileInputStream("C:\\Work\\file\\hello.txt");
			newFile = new FileOutputStream("C:\\Work\\upload\\copy.txt");
			
			byte[] arr = new byte[100];
			
			while(true) {
				//읽어들인 데이터가 있다면 읽은 데이터 길이 반환, 없다면 -1을 반환.
				int result = oldFile.read(arr);
				if(result == -1) break;
				
				//바이트 단위로 0에서부터 읽은 크기까지의 파일을 작성.
				newFile.write(arr, 0, result);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    finally {
			
				try {
					oldFile.close();
					newFile.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			

		}
		
	      }else
	      {
	    	  System.out.println("파일명이 없습니다.");
	      }
		
		
		
		
		
		
	}

}
