package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;  
		
		//객체생성
	 try {
		fr = new FileReader("C:\\Work\\file\\merong.txt");
		br = new BufferedReader(fr);
		
		//bufferdeTeader 에는 readLine() 메서드가 있고
		//한줄을 통째로 읽어서 Streing으로 리턴합니다.
//		System.out.println(br.readLine());
				
		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
				
				
				
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			br.close();
			fr.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	 
	 
		
		
		
		
		
	}

}
