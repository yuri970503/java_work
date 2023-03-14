package etc.api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		/*
		 - 자바에서 외부 경로로 폴더를 생성할 때는 File 클래스를 사용합니다.
		 - 생성자의 매개값으로 폴더를 생성할 경로 + 폴더명을 지정합니다.
		 */
		
		File file = new File("C:\\Work\\folder_txst\\test\\mytest\\apple");
		        // 경로에 파일이 존재하는지
		if(!file.exists())//존재 tr 안하면 fa
		{   //file.mkdirs() (여러개를 만들 수 있는것) 만들고자 하는 경로의 상위 디렉토리가 존재하지 않는다면 동작 안함.
			file.mkdir();//폴더 생성 하나만 가능하다
			System.out.println("폴더 생성 완료");
		}
		else
		{
			System.out.println("해당 폴더가 존재합니다.");
		}
		
		
	}

}
