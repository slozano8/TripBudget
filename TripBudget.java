import java.util.Scanner;
import javax.swing.JOptionPane;
public class TripBudget
 {
   public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    String Location = null;
    int Distance = 0;
    String Name = null;
    int LengthOfTravel = 0;
    double totalMoney = 0;
    
    try
    {
        System.out.println("Enter your name name>> ");
        Name = sc.nextLine();
        System.out.println("Enter the city you wish to travel>> :");
        Location = sc.nextLine();
        System.out.println("Enter how much money you are taking>> :");
        totalMoney = sc.nextDouble();
        System.out.println("Enter the distance in milage >>:");
        Distance = (sc.nextInt());
 
        System.out.println("How many days do you plan to travel?>> ");
        LengthOfTravel = sc.nextInt();
        
    }
    catch(Exception e)
    {
        System.out.println("I/O Exception");
    }       
    Location location = new Location();
    location.setLocation(Location);       
    location.setDistance(Distance);
    location.setName(Name);
    location.setLengthOfTravel(LengthOfTravel);
    double Spend = totalMoney / LengthOfTravel;
    JOptionPane.showMessageDialog(null, "Hello " + location.getName() + " you are traveling to " +
                location.getLocation() + " " + location.getDistance() + " miles away from home." +
                 " Traveling for " + location.getLengthOfTravel() + " days means; " + " you can spend " + "$" + Spend + " per day.");     
    }
  }

