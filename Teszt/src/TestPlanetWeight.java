
import java.util.Scanner;
import java.text.DecimalFormat;

public class TestPlanetWeight
{

   public static void main(String[] args)
{
       double weight = 0.0;
       double planetWeight = 0.0;
       String planet = null;

       Scanner keyboard = new Scanner(System.in);
       DecimalFormat pattern0dot00 = new DecimalFormat("0.00"); //To format to 2 places

       try
       {
           System.out.print("Please enter your weight: ");
           weight = keyboard.nextDouble();

           System.out.print("Enter a planet in the solar system: ");
           planet = keyboard.next();

           planetWeight = PlanetWeight.getPlanetWeight(planet, weight);
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }

       System.out.print("Your weight is " + weight + " kg. Your weight on " + planet);
       System.out.println(" would be " + pattern0dot00.format(planetWeight) + " kg.");

   }
}