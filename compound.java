import java.io.*;
import java.util.*;
class compound
{
//static block
compound()
{
double principle_amount=0.0;
double interest_rate=0.0;
double time_period=0.0;
double compoundinterest=0.0;
Scanner i=new Scanner(System.in);
System.out.println("enter the principle amount :");
principle_amount=i.nextDouble();
System.out.println("Enter the time period :");
time_period=i.nextDouble();
System.out.println("Enter the interest rate :"); 
interest_rate=i.nextDouble();
compoundinterest=principe_amount*math.pow((1+interest_rate/100),time_period);
System.out.println(" ");
System.out.println("compound interest : "+compound interest);
}
}
class test1 extends compound
{
public static void main(String args[])
{
compound c1=new compound();
}
} 