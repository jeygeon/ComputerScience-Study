package prioityQueue;

public class Main {

    public static void main(String[] args) {

        PrioityQueue<Student> prioityQueue = new PrioityQueue<Student>();
        prioityQueue.add(new Student("Martin", "A"));
        
        Student student1 = new Student("hong", "A");
        Student student2 = new Student("jae", "B");
        Student student3 = new Student("park", "A");
        Student student4 = new Student("kim", "D");
        Student student5 = new Student("cha", "C");
        
        System.out.println(student5.compareTo(student1));
        
    }
}
