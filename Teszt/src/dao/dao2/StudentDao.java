package dao.dao2;

import java.util.List;

public interface StudentDao {

	public void updateStudent(Student student);
	public void deleteStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
}
