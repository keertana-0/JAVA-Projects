import java.util.*;
public class  EnergyGeneration//2-b
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the energy generated (kWh):");
        double energy=in.nextDouble();
        
        if(energy>=10.0)
         System.out.println("Good Energy Generation");
        else
        System.out.println("Low Energy Generation");
    }
}