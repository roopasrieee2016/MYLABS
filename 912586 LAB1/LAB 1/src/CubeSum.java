/*
*Name: BATHULA ROOPASRI
*Description: To fnd sum of cubes of digits of given number
*Date:13/03/2021
*/
import java.util.*;
public class CubeSum {
Scanner sc=new Scanner(System.in);
private static Scanner sc2;
public static int cubesum(int n)
{
	int rem=0,sum=0;
	while(n>0)
	{
		rem=n%10;
		sum+=rem*rem*rem;
		n/=10;
	}
	return sum;
}
	public static void main(String[] args) {
		sc2 = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc2.nextInt();
		int result=cubesum(num);
		System.out.println(result);
		}
	
}
