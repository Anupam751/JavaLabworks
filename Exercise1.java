package labsheet1;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the num");
		int n = scn.nextInt();
		System.out.println(sumOfCube(n));
	}
	public static int sumOfCube(int n)
	{
		int sum = 0;
		for(int i = 1;i<=n;i++)
		{
			sum += i*i*i;
		}
		return sum;
	}
}
