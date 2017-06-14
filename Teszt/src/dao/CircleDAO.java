package dao;

public interface CircleDAO {

	public void deleteCircle(int id);

	public CircleTransfer findCircle(int id);

	public void insertCircle(CircleTransfer circle);
}