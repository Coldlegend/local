/**
*   The class PlanetWeight is used for computing a weight relative to the the same
*   weight on Earth on tbe various planets of the solar system or on the moon. It
* contains public constants of type double for each celestial body and two static
*   methods. One of the methods is used to verify the correct String value of the
*   planet name. The other is used to make the weight computation.
*
*/
public class PlanetWeight

{
   public static final double MOON = 0.1660;
   public static final double MERCURY = 0.1550;
   public static final double VENUS = 0.8975;
   public static final double EARTH = 1.0000;
   public static final double MARS = 0.3507;
   public static final double JUPITER = 2.5374;
   public static final double SATURN = 1.0677;
   public static final double URANUS = 0.8947;
   public static final double NEPTUNE = 1.1794;
    public static final double PLUTO = 0.0899;

   /**
   *   Verifies whether the String planeName contains a valid name for a
   *   planet from the set { Moon, Mercury, Venus, Earth, Mars, Jupiter,
   *   Saturn, Uranus, Neptune, Pluto}. The case of the argument is ignored.
   *   @param planetName A String containing the name of the planet to be checked.
   *   @return A boolean value (true or false) validating the planetName
   */
   public static boolean planetNameOK(String planetName)
   {
   return (planetName.equalsIgnoreCase("Moon") ||
       planetName.equalsIgnoreCase("Mercury") ||
       planetName.equalsIgnoreCase("Venus") ||
       planetName.equalsIgnoreCase("Earth") ||
       planetName.equalsIgnoreCase("Mars") ||
          planetName.equalsIgnoreCase("Jupiter") ||
       planetName.equalsIgnoreCase("Saturn") ||
       planetName.equalsIgnoreCase("Uranus") ||
       planetName.equalsIgnoreCase("Neptune") ||
       planetName.equalsIgnoreCase("Pluto") );
}

   /**
   *   Returns the weight on the planet relative to the weight on Earth. First
   *   verifies whether planet name if valid and weight is positive.
   *   @param planetName A String containing the name of the planet
   *   @param weight A double containing the weight to be converted
   *   @return A double containing the converted weight on the planet.
   *   @throws IllegalArgumentException If planet name is not valid or weight not positive.
   */
public static double getPlanetWeight(String planetName, double weight)
   throws IllegalArgumentException
{
   if(!planetNameOK(planetName))
       throw new IllegalArgumentException("Your planet name is not valid.");

   if(weight <= 0.0 )
       throw new IllegalArgumentException("Weight must be greater than zero.");

   if (planetName.equalsIgnoreCase("Moon"))
   {
       weight *= MOON;
   }
   else if (planetName.equalsIgnoreCase("Mercury"))
   {
       weight *= MERCURY;
   }
   else if (planetName.equalsIgnoreCase("Venus"))
   {
       weight *= VENUS;
   }
   else if (planetName.equalsIgnoreCase("Earth"))
   {
       weight *= EARTH;
   }
   else if (planetName.equalsIgnoreCase("Mars"))
   {
       weight *= MARS;
   }
   else if (planetName.equalsIgnoreCase("Jupiter"))
   {
       weight *= JUPITER;
   }
   else if (planetName.equalsIgnoreCase("Saturn"))
   {
       weight *= SATURN;
   }
   else if (planetName.equalsIgnoreCase("Uranus"))
   {
       weight *= URANUS;
   }
   else if (planetName.equalsIgnoreCase("Neptune"))
   {
       weight *= NEPTUNE;
   }
   else
   {
       weight *= PLUTO;
   }

   return weight;
}
}


