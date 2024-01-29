package sort.selection.student;

public class MainStudent {

    public static void main(String[] args) {

        Student student1 = new Student("Kim", "B");
        Student student2 = new Student("Lee", "B");
        Student student3 = new Student("Park", "C");
        Student student4 = new Student("Cha", "A");
        Student student5 = new Student("Ju", "D");
        Student[] studentArr = {student1, student2, student3, student4, student5};

        SelectionSort.sort(studentArr);

        /*
         * 정렬 전 : [ Kim : B ][ Lee : B ][ Park : C ][ Cha : A ][ Ju : D ]
         * 정렬 후 : [ Cha : A ][ Lee : B ][ Kim : B ][ Park : C ][ Ju : D ]
         * Kim와 Lee 모두 등급은 B이고, 정렬 전은 Kim이 Lee보다 앞에 있었지만 정렬 후에는 Lee가 Kim보다 더 앞에 위치하게 된다 > 불안전 정렬
         */
        System.out.println(Student.toString(studentArr));
    }
}
