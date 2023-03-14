package etc.api.io.streame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SteameCopy {

	public static void main(String[] args) {
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		
    try {	
		oldFile = new FileInputStream("C:\\Work\\file\\common.jpg");
		newFile = new FileOutputStream("C:\\Users\\ict03-26\\Desktop\\copy.jpg");
		
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

} 

}