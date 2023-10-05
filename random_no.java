import java.util.*;
class random_no{
	public static void main(String x[])
	{
		Random rand =new Random();
		Scanner sc = new Scanner(System.in);
		int i=1;
		int o,z;
		int upperbound = 100;
		int ran_no=rand.nextInt(upperbound);
		
		System.out.println("WELCOME\nHere Is the Game of  guess  the generated number.");
		System.out.println("You Have Five Chance to guess the Number\n Range 1 to 100...");
		System.out.println("Press\n 1= Play \n 2= Exit");
		o=sc.nextInt();
		if (o==1)
		{
		while(i<=5)
		{
			System.out.println("You are "+i+"th Chance to guess the Number");
		int a = sc.nextInt();
		if(ran_no>a)
		{
			System.out.println("Oops!!!\nThe Number is too short");
		}
		if(ran_no<a)
		{
			System.out.println("Oops!!!\nThe Number is too Long");
		}
		if(ran_no==a)
		{
			System.out.println(">>>>>>>>>congratulations!!!<<<<<<<<<<\n You are a Winner");
			break;
		}
		i++;
		}
		System.out.println("XXXX  Game Over XXXX");
		System.out.println("Want to see original Answer???\nPress\n 1=Yes\n 2=No");
		z=sc.nextInt();
		if(z==1)
		{
		System.out.println("Original Answer Is "+ran_no);
		}
		}
		if (o==2)
		{
			System.out.println("Thank you");
		}
	}
}