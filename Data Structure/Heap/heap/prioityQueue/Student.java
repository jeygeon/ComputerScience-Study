package prioityQueue;

public class Student implements Comparable<Student>{

	private String name;

	private String grade;

	public String getName() {

		return this.name;
	}

	public String getGrade() {

		return this.grade;
	}

	public Student(String name, String grade) {

		this.name = name;
		this.grade = grade;
	}

	@Override
	public int compareTo(Student otherStudent) {

		return this.grade.compareTo(otherStudent.getGrade());
	}

	public String toString() {

		return "[ Name : " + this.name + ", Grade : " + this.grade + " ]";
	}
}
