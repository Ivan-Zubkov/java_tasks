//file Student.java
package pract_9;

public class Student {
    public String name;
    public int student_id;
    public double averageScore;

    public Student(int id, String n, double averageScore) {
        student_id = id;
        name = n;
        this.averageScore = averageScore;
    }
}
