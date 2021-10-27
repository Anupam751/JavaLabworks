package labsheet2;
import java.util.*;  
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,3,2};  
		System.out.println("Second Smallest: "+getSecondSmallest(a,6));  
	}
	public static int getSecondSmallest(int[] a, int total){  
		Arrays.sort(a);  
		return a[1];  
		}  
}
