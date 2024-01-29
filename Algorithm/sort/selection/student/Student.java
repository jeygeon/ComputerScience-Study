package sort.selection.student;

public class Student implements Comparable<Student>{

    private String name;

    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {

        return this.name;
    }

    public String getGrade() {

        return this.grade;
    }

    @Override
    public int compareTo(Student student) {

        return this.grade.compareTo(student.getGrade());
    }

    public static String toString(Student[] studentArr) {

        StringBuilder sb = new StringBuilder();
        for (Student student : studentArr) {
            sb.append("[ " + student.getName() + " : " + student.getGrade() + " ]");
        }
        return sb.toString();
    }
}
