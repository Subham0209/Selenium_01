import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaIntro {

	public static void main(String[] args) {

		int a = 1;

		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 9;
		arr[2] = 5;
		arr[3] = 7;
		arr[4] = 0;

		
		for(int i=0;i<arr.length;i++) 
		{ 
			System.out.println(arr[i]);
		}
		 
		String[] a1 = new String[3];
		a1[0] = "Karan";
		a1[1] = "Ravi";
		a1[2] = "Kishan";

		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

		for (String b : a1) {
			System.out.println(b);
		}
		
		// Array List
		
		ArrayList<String> a11 = new ArrayList<String> ();
		a11.add("Rahul");
		a11.add("Karan");
		a11.add("Ravi");
		
		//System.out.println(a11.get(2));
		
		for(int i=0;i<a11.size();i++)
		{
			System.out.println(a11.get(i));
		}
		
		for (String b1 : a11)
		{
			System.out.println(b1);
		}

		// Difference Between Array and Array List is that Arrays are defined within an range and ArrayList does not have any range.
		
		String[] a4 = {"Rahul","Karan","Selenium"};
		List<String> name = Arrays.asList(a4);
		System.out.println(name.contains("Selenium"));
		
		
	}

}
