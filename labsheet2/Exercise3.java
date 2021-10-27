package labsheet2;

public class Exercise3 {

	public static void main(String[] args) {
		int[] arr = {20,40,60,79,82};
		getSorted(arr, arr.length);
	}
//	get the resulting array after reversing the numbers and sorting it
	static void getSorted(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
}
