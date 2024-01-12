package prioityQueue;

public class Main {

    public static void main(String[] args) {

        PrioityQueue<Student> prioityQueue = new PrioityQueue<Student>();
        System.out.println("=============== 우선순위 큐 삽입 시작 ===============");
        prioityQueue.add(new Student("Hong", "A"));
        prioityQueue.add(new Student("Kim", "D"));
        prioityQueue.add(new Student("Park", "C"));
        prioityQueue.add(new Student("Cha", "B"));
        prioityQueue.add(new Student("Lee", "A"));
        prioityQueue.add(new Student("Song", "F"));
        prioityQueue.add(new Student("Jang", "B"));
        System.out.println("=============== 우선순위 큐 삽입 종료 ===============");

        System.out.println("=============== 우선순위 큐 객체 반환 시작 ===============");
        Student poll1 = prioityQueue.poll();
        if (poll1 != null) {
            System.out.println("객체 반환 성공 : [ Name : " + poll1.getName() + " ] [ Grade : " + poll1.getGrade() + " ]");
            System.out.println("Student PrioityQueue 정렬 > " + prioityQueue.toString());
        }
        Student poll2 = prioityQueue.poll();
        if (poll2 != null) {
            System.out.println("객체 반환 성공 : [ Name : " + poll2.getName() + " ] [ Grade : " + poll2.getGrade() + " ]");
            System.out.println("Student PrioityQueue 정렬 > " + prioityQueue.toString());
        }
        Student poll3 = prioityQueue.poll();
        if (poll3 != null) {
            System.out.println("객체 반환 성공 : [ Name : " + poll3.getName() + " ] [ Grade : " + poll3.getGrade() + " ]");
            System.out.println("Student PrioityQueue 정렬 > " + prioityQueue.toString());
        }
        System.out.println("=============== 우선순위 큐 객체 반환 종료 ===============");
    }
}
