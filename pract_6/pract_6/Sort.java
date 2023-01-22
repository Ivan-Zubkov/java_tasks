//file Sort.java
package pract_6;

public class Sort {

    public static void insertionSort (Student[] list) {
        for (int left = 0; left < list.length; left++) {
            int value = list[left].student_id;
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < list[i].student_id) {
                    list[i + 1].student_id = list[i].student_id;
                } else {
                    break;
                }
            }
            list[i + 1].student_id = value;
        }
    }

    public static void main(String[] args){
        Student[] mas = new Student[5];


        mas[0] = new Student(5, "alex");
        mas[1] = new Student(1, "john");
        mas[2] = new Student(12, "tom");
        mas[3] = new Student(11, "sasha");
        mas[4] = new Student(145, "max");

        System.out.println(mas[0].student_id + " " + mas[0].name);
        System.out.println(mas[1].student_id + " " + mas[1].name);
        System.out.println(mas[2].student_id + " " + mas[2].name);
        System.out.println(mas[3].student_id + " " + mas[3].name);
        System.out.println(mas[4].student_id + " " + mas[4].name);

        insertionSort(mas);
        System.out.println("After sort: ");

        System.out.println(mas[0].student_id + " " + mas[0].name);
        System.out.println(mas[1].student_id + " " + mas[1].name);
        System.out.println(mas[2].student_id + " " + mas[2].name);
        System.out.println(mas[3].student_id + " " + mas[3].name);
        System.out.println(mas[4].student_id + " " + mas[4].name);
    }

}
