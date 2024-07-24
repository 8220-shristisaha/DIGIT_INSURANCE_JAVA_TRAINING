//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Student{
    private int studentId;
    private String name;
    private int age;
    private Character grade;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student {" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentId(1);
        student1.setName("Neha");
        student1.setAge(21);
        student1.setGrade('A');

        Student student2 = new Student();
        student1.setStudentId(2);
        student1.setName("Mohan");
        student1.setAge(25);
        student1.setGrade('A');

        System.out.println(student1.toString());
        System.out.println(student2.toString());



    }
}