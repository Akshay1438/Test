package task;

import java.util.Scanner;

public class AgeDemo {

	public static void main(String[] args)
	{
		
		int i,counting1=0,counting2=0,counting3=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = input.nextInt();
		int age[] = new int[n];
		System.out.println("Enter the elements : ");
		for(i=0;i<n;i++)
		{
			age[i]=input.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			if(age[i]<18)
			{
				counting1++;
			}
			
			else if(age[i]>= 18 && age[i]<=54)
			{
				counting2++;
			}
			
			else
			{
				counting3++;
			}
		}
		
		System.out.println("Children : "+counting1 +"\n"+"Adult : "+counting2+"\n"+ "Senior Citizen : "+counting3);
		
		input.close();

	}
}