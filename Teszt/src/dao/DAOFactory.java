package dao;

public class DAOFactory {

	public static CircleDAO getCircleDAO(String inputType) {
		switch (inputType) {
		case "RDBMS":
			return new RDBMSDAO();
		}
		return null;
	}
}