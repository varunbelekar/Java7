import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Try_With_Resources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream f=new FileOutputStream("/Java 7/src/abc.txt");
			String s="Hello world";
			byte b[]=s.getBytes();
			f.write(b);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
