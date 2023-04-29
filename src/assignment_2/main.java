package assignment_2;
//•	Write a program to demonstrate the use of array of Objects and static variables.


public class main {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("John", 20);
        students[1] = new Student("Jane", 21);
        students[2] = new Student("Jack", 22);

        System.out.println("Number of students: " + Student.count);

        for (int i = 0 ; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}

class Student {
    String name;
    int age;
    static int count = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    @Override
    public String toString() {
        return "Student name is " + name + " and age is " + age + " years old.";
    }
}
