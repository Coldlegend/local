package collectionsFramework.comparableInterfaces;
public class Student implements Comparable<Student> {
	String id;
	String name;
	public Double cgpa;

	public Student(String studentID, String studentname, Double studentCgpa) {
		id = studentID;
		name = studentname;
		cgpa = studentCgpa;

	}

	public String toString() {
		return " \n " + id + " \t " + name + " \t " + cgpa;

	}

	public int compateTo(Student that) {
		return this.id.compareTo(that.id);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
