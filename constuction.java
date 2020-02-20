Construction of house
import java.io.*;
import java.util.*;
class Standard
{
    Standard()
    {
       double Standard_materials;
        double area;
double total_cost;
 
        Scanner i = new Scanner(System.in);
 
        System.out.print("Enter the Standard materials : ");
        Standard_materials= i.nextDouble();
 
        System.out.print("Enter the area : ");
        area = i.nextDouble();
 
        total_cost = Standard_materials * area;
 
        System.out.println(total_cost);
    }
}
class Construction1 extends Standard
{
public static void main(String args[])
{
Standard o3 = new Standard();
}
}



