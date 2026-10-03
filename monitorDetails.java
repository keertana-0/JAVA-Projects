import java.util.*;
public class monitorDetails//2-a  
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the required details:");

        System.out.println("Enter the Panel ID:");
        int id=in.nextInt();
        
        System.out.println("Enter the Energy Generated(kWh):");
        double energy=in.nextDouble();
        
        System.out.println("Enter the Number of solar panels :");
        int numOfPanels=in.nextInt();
        
        System.out.println("Enter the System status");
        char status=in.next().charAt(0);
        System.out.println("---------------------------");
        System.out.println("Panel ID:"+id);
        System.out.println("Number of solar panels:"+numOfPanels);
        System.out.println("Energy Generated:"+energy+"kWh");
        System.out.println("System status"+status);
    }
}