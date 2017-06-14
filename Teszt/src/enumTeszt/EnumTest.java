package enumTeszt;

public class EnumTest {
	PrinterType printerType;

	public EnumTest(PrinterType pType) {
		printerType = pType;
	}

	public void feature() {
		switch (printerType) {
		case DOTMATRIX:
			System.out.println("Dotmatrix printers are econical and almsot obsolete");
			break;
		case INKJET:
			System.out.println("Inkjet printers provide decent print quality");
			break;
		case LASER:
			System.out.println("Laser printers provde the best quality");
			break;
		}
		System.out.println("Page print capacity per minute: " + printerType.getPagePrintCapacity());
	}

	public static void main(String[] args) {
		EnumTest enumTest = new EnumTest(PrinterType.DOTMATRIX);
		enumTest.feature();
		EnumTest enumTest2 = new EnumTest(PrinterType.INKJET);
		enumTest2.feature();
		EnumTest enumTest3 = new EnumTest(PrinterType.LASER);
		enumTest3.feature();
	}
}