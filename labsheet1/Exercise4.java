package labsheet1;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		System.out.println(sum(12));
	}
	static int sum(int n)
	{
		int s1,s2,s3;
		s1 = ((n/3)) * (2*3 + (n/3-1)*3)/2;
		s2 = ((n/5)) * (2*5 + (n/5-1)*5)/2;
		s3 = ((n/12)) * (2*12 + (n/12-1)*12)/2;
		return s1 + s2 -s3;
	}
}
