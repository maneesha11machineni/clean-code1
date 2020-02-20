import java.io.*;
import java.util.*;
 public class test
{
	//static block
	static 
	{
		double paamount,roi,timeperiod,simpleinterest;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the principle amount:");
		paamount=sc.nextDouble();
		System.out.println("please enter the rate of interest:");
		roi=sc.nextDouble();
		System.out.println("please enter the time period in years:");
		timeperiod=sc.nextDouble();
		simpleinterest=(paamount*roi*timeperiod)/100;
		System.out.println("/n the simple interest for principle amount" + paamount + " is =" +simpleinterest);
	}
}
public class simple extends interest
{
	public static void main(String args[])
	{
		interest t2=new interest();
	}
}