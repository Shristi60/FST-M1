package activities;

public class Activity8 {

	public static void main(String[] args) {
		
		try {
			exceptionTest("Shristi");
			exceptionTest(null);
		} 
		catch (CustomException e) {
			
			System.out.println("inside catch block:"+e.getMessage());
		}
		
	}

	public static void exceptionTest(String str) throws CustomException {
		if (str == null) {
			throw new CustomException("Value is null");
		} else
			System.out.println("The value is: " + str);

	}

}
