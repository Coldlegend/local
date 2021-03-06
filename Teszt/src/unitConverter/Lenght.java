package unitConverter;

public class Lenght extends Converter {
	private String[] units;
	private double[] unitConstants;

	/**
	     * Initialize the Length constructor
	 * @return 
	     */
	    public void Length() {
	        units = new String[] {
	            "km", "m", "cm", "mm", "mi", "yd", "ft", "in"
	        };

	        unitConstants = new double[] {
	            1000, 1, 0.01, 0.001, 1609.344, 0.9144, 0.3048, 0.0254
	        };
	    }

	/**
	 * Print out the information of the length units
	 */
	public void unitsInfo() {
		System.out.println("    - Kilometer (km)");
		System.out.println("    - Meter (m)");
		System.out.println("    - Centimeter (cm)");
		System.out.println("    - Millimeter (mm)");
		System.out.println("    - Mile (mi)");
		System.out.println("    - Yard (yd)");
		System.out.println("    - Foot (ft)");
		System.out.println("    - Inch (in)");
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
		int fromIndex = 0;
		int toIndex = 0;

		for (int i = 0; i < units.length; i++) {
			if (units[i].equals(fromUnit)) {
				fromIndex = i;
			}

			if (units[i].equals(toUnit)) {
				toIndex = i;
			}
		}
		value = value * unitConstants[fromIndex] / unitConstants[toIndex];

		return value;
	}
}
