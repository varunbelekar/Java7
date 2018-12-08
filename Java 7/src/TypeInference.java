import java.util.ArrayList;
import java.util.List;

public class TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();//Before Java 7
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(15);
		for(Integer i:l) {
			System.out.println(i);
		}
	}

}
