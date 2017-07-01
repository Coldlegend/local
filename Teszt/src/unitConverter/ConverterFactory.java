package unitConverter;

public class ConverterFactory {
	/**
	 * Get the corresponding converter based on the given measurement type
	 *
	 * @param measurementType
	 *            the type of measurement
	 * @return the corresponding converter
	 */

	public Converter getConverter(String measurementType) {
		if (measurementType.equals("temperature")) {
			return new Temperature();
		} else if (measurementType.equals("lenght")) {
			return new Lenght();
		} else if (measurementType.equals("mass")) {
			return new Mass();
		} else if (measurementType.equals("speed")) {
			return new Speed();
		}
		return null;

	}
}
