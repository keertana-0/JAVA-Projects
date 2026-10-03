import java.util.*;
public class solarEnergy//2-c
{
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy)
    {
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter morning energy: ");
        double morningEnergy = in.nextDouble();

        System.out.print("Enter evening energy: ");
        double eveningEnergy = in.nextDouble(); 

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total energy generated: " + totalEnergy);
    }
}

