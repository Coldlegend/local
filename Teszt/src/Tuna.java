public class Tuna {

	private String girlName;

	public Tuna(String name) {
		girlName = name;
	}

	public String getGirlName() {
		return girlName;
	}

	public void setGirlName(String girlName) {
		this.girlName = girlName;
	}

	public void saying() {
		System.out.println("My first gf was: " + getGirlName());
	}

	public void saying2() {
		System.out.println("My second gf was: " + getGirlName());

	}

	public void saying3() {
		System.out.println("My third gf was: " + getGirlName());
	}
}