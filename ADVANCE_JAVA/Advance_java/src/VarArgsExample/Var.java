package VarArgsExample;

public class Var {

	public static void main(String[] args) {
		sum(45,56);
		sum(45,85,96,25);
		holidays("june",06,17,26);
	}
	
	static void sum(int...nums)
	{
		int total=0;
		for (int i = 0; i < nums.length; i++) {
			total=total+nums[i]; //nums of i
		}
		System.out.println("total="+total);
	}
	static void holidays(String month, int...days)
	{
		System.out.println("the holidays for :"+month+ "\ndays are:-");
		for(int day :days)
		{
			System.out.print(day+"'th,");
		}
	}

}
