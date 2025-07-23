package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 77, 10, 54, -11, 10};
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			//Find the 10's in the array and add them
			if(arr[i]==10)
				sum=sum+arr[i];
		}
				//Check if value is equal to 30.
		if (sum==30)
			System.out.println("Sum of all the 10s equals 30");
		else
			System.out.println("Sum of all 10s not equal to 30");
		

	}

}
