package JavaNewProgram.JavaNewProgramDemo;
// Assignment 75 Find out the average of all the numbers presnet in your array
public class AverageOfNumbersinArray {

	public static void main(String[] args) {

		int a[] = {2,4,8,10};
		float avg =0;
		for(int i=0;i<=a.length-1;i++)
		{
			avg = a[i] + avg;
		}
		int total_average = (int) (avg / a.length) ;
		System.out.println("The Average of array number is: " + total_average);
	}

}
