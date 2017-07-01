package dao.dao2;

public class DaoPatternDemo {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

		// print all students
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getId() + ", Name : " + student.getName() + " ]");
		}

		// update

		Student student = studentDao.getAllStudents().get(1);
		student.setName("Balazs");
		studentDao.updateStudent(student);

		// get the student

		studentDao.getStudent(1);
		System.out.println("Student: [RollNo : " + student.getId() + ", Name : " + student.getName() + " ]");
	}
}
