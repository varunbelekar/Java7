
public class Multi_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		try {
			a[10]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
			
		
		
	}

}
