package labsheet1;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0,b=1,c,n=10;
		System.out.println(a + " " + b);
		
		for(int i = 2;i<n;i++)
		{
			c = a + b;
			System.out.println(" " + c);
			a = b;
			b = c;
		}
	}

}
