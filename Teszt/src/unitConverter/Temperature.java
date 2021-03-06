package unitConverter;

public class Temperature extends Converter{
	 /**
     * Print out the information of the temperature units
     */
    public void unitsInfo() {
        System.out.println("    - Celsius (c)"); 
        System.out.println("    - Fahrenheit (f)");
        System.out.println("    - Kelvin (k)");
        System.out.println();
    }

    /**
     * Convert the unit from one type to another
     *
     * @return the value after converting
     */
    public double convert() {
        String fromUnit = getFromUnit();
        String toUnit = getToUnit();
        double value = getValue();

        if (fromUnit.equals("c")) {
            value += 273.15;
        } else if (fromUnit.equals("f")) {
            value = (value - 32) * 5 / 9 + 273.15;
        }

        if (toUnit.equals("c")) {
            value -= 273.15;
        } else if (toUnit.equals("f")) {
            value = (value - 273.15) * 9 / 5 + 32;
        }

        return value;
}
}
