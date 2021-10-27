package labsheet2;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 1, 2, 2, 2 };
        int n = a.length;
  
        n = modifyArray(a, n);
  
        
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        getSorted(a,n);
	}
//	Removes Duplicates
	public static int modifyArray(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
  
        int[] temp = new int[n];
        int j = 0;
  
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
  
        temp[j++] = a[n - 1];
  
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
  
        return j;
    }
	static void getSorted(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.print("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

}
