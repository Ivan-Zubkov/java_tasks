//file Sort.java
package pract_9;

import java.io.IOException;
import java.util.Scanner;

public class Sort {

    public static void insertionSort (Student[] list) {
        for (int left = 0; left < list.length; left++) {
            double value = list[left].averageScore;
            int i;
            for (i = left - 1; i >= 0; i--) {
                if (value < list[i].averageScore) {
                    list[i + 1].averageScore = list[i].averageScore;
                } else {
                    break;
                }
            }
            list[i + 1].averageScore = value;
        }
    }

    public static void main(String[] args) {
        Student[] mas = new Student[5];


        mas[0] = new Student(5, "alex", 3.4);
        mas[1] = new Student(1, "john", 3.1);
        mas[2] = new Student(12, "tom", 4.0);
        mas[3] = new Student(11, "sasha", 2.8);
        mas[4] = new Student(145, "max", 4.3);

        for (int i = 0; i < mas.length; i++) {
            System.out.println("id: " + mas[i].student_id
                    + ", name: " + mas[i].name + ", average score: " + mas[i].averageScore);
        }

        insertionSort(mas);
        System.out.println("After sort: ");

        for (int i = 0; i < mas.length; i++) {
            System.out.println("id: " + mas[i].student_id
                    + ", name: " + mas[i].name + ", average score: " + mas[i].averageScore);
        }


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        while (!name.equals("0")) {

            boolean flag = false;

            for (int i = 0; i < mas.length; i++) {
                if (name.equals(mas[i].name)) {
                    System.out.println("id: " + mas[i].student_id
                            + ", name: " + mas[i].name + ", average score: " + mas[i].averageScore);
                    flag = true;
                    break;
                }
            }

            try {
                if (!flag) {
                    throw new StudentNameException("Student '" + name + "' not found!");
                }
            } catch (StudentNameException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Enter student name: ");
            name = sc.nextLine();
        }
    }
}
