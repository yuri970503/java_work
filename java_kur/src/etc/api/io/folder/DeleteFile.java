package etc.api.io.folder;

import java.io.File;
import java.util.Arrays;

public class DeleteFile {

	public static void main(String[] args) {
		// 폴더 파일 지우는 것 가능

		
		File file = new File("C:\\Work\\folder_txst\\test\\mytest\\apple");
		
//		if (file.exists())
//		{
//			file.delete(); //성공시 tr 실패시 fa 리턴
//			System.out.println("삭제완료");
//		}
//		else
//		{
//			System.out.println("파일 삭제 실패 존재하지 않음");
//			
//		}
//		
		
		//차근차근 지워야 한다. 키워드가 없다 안에있는것부터 차근차근 지워야한다.
//		
		if(file.exists()) {
			if(file.isDirectory()) { //파일이 디렉토리인지 확인
				File[] files = file.listFiles();
				for(int i=0; i<files.length; i++) {
					if(files[i].delete()) {
						System.out.println(files[i].getName() + " 삭제 성공!");
					} else {
						System.out.println(files[i].getName() + " 삭제 실패!");
					}
				}
			}
			if(file.delete()) {
				System.out.println("삭제 성공!");
			} else {
				System.out.println("삭제 실패!");
			}
		}
		
		
	}

}
