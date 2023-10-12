import java.util.*;
public class Student_result
{
	public static void main(String x[])
	{
		//System.out.println("WELCOME\nHere Is the Game of  guess  the generated number.");
		int s1,s2,s3,s4,s5,s6,sum,avg;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks obtained out of 100 in each subject as maintion below");
		System.out.print("Enter 1st Language Marks(Marathi out of 100):");
		s1=sc.nextInt();
		System.out.print("Enter 2nd Language Marks(Hindi-sanskrit out of 100):");
		s2=sc.nextInt();
		System.out.print("Enter 3rd Language Marks(English out of 100):");
		s3=sc.nextInt();
		System.out.print("Enter Marks of Mathematics (out of 100):");
		s4=sc.nextInt();
		System.out.print("Enter Marks of Science & Technology( out of 100):");
		s5=sc.nextInt();
		System.out.print("Enter Marks of Social Science( out of 100):");
		s6=sc.nextInt();
		
		sum=s1+s2+s3+s4+s5+s6;
		avg=sum/6;
		System.out.println("=====================================");
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("RESULT");
		System.out.println("-------------------------------------");
		System.out.println("Total Obtained Marks       : "+sum);
		
		System.out.println("Average Obtained Persetage : "+avg+"%");
		if(avg<35)
		{
			System.out.println("You are Fail");
		}
		if(avg >=35 && avg<= 50)
		{
			System.out.println("Your Gread Is             : C");
		}
		if(avg >50 && avg<= 60)
		{
			System.out.println("Your Gread Is             : C+");
		}
		if(avg >60 && avg<= 70)
		{
			System.out.println("Your Gread Is             : B");
		}
		if(avg >70 && avg<= 80)
		{
			System.out.println("Your Gread Is             : B+");
		}
		if(avg >80 && avg<= 90)
		{
			System.out.println("Your Gread Is             : A");
		}
		if(avg >90 && avg<= 100)
		{
			System.out.println("Your Gread Is             : A+");
		}
		
		System.out.println("=====================================");
		
	}
}