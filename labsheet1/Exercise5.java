package labsheet1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a num");
		int n = scn.nextInt();
		for(int i = 2;i<n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("not prime");
				break;
			}
			else
			{
				System.out.println("prime");
				break;
			}
		}
	}

}
