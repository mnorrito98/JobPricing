//JobPricing.java
//Mike Norrito 

//Herberts Home Repair Estimates each job cost as the cost of materials plus $35 per hour while on the job PLUS $12 dollars per hour for travel time to the job site 
import java.util.Scanner;

public class JobPricing
{
	public static void main(String[] repair) 
	{
		//vars and consts 
		String jobName;
		int materials;
		int workHrs;
		int travHrs;
		int math101;

//Objects 
		Scanner herbert = new Scanner(System.in);
		//Prompt 

		System.out.print("Plese enter your last name and what you need repaired in your home. for example \"Goodman, Toilet broken to peices\"");
		jobName = herbert.nextLine();
		System.out.print("Now please enter how many hours away from my office you are here (only numbers please:  ex. \"1\" ) >> ");
		travHrs = herbert.nextInt();
		System.out.print("Enter the amount of hours you want me to work (You could always extend if need but depending on our avalibility it's in your best interest to scedule more than less) >> ");
		workHrs = herbert.nextInt();


		//Calculation phase 
		math101 = (travHrs * 12) + (workHrs * 35);

		System.out.print("Total cost for our visit is $" + math101);


	}
}