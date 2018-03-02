
public class LabAssessment {
	public static void main(String args[])
	{
		LabAssessment test = new LabAssessment();
		System.out.println(isGoofy(25));
		System.out.println(test);
	}

	public static boolean isGoofy(int num){
		int number = num; 
		int next = 0;
		int orig = num;
		int sum = 0;
		int right = 0;
		String count = "" + num;
		int[] arr = new int[count.length()];
		while (number >= 0){
			next = number % 10;
			number = number / 10;
			arr[right] = next;
			System.out.println(arr[right]);
			right++;
		}
		for (int i = 0; i< count.length(); i++){
			if (orig % arr[i] == 0){
				sum+=arr[i];
			}
		}
		if (sum % 2 == 1){
			return true;
		}
		return false;
		
	}
	
	public static int[] getSomeGoofyNumbers(int count){
		int total = 0;
		int incr = 1;
		int[] goof = new int[count];
		while (total!=count){
			if (isGoofy(incr)){
				goof[total] = incr;
				total++;
				
			}
			incr++;
		}
		return goof;
	}
}