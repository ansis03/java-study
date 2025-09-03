package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        studentInit(student1, "학생1", 15, 90);
        Student student2 = new Student();
        studentInit(student2, "학생2", 16, 80);

        systemOut(student1);
        systemOut(student2);

    }
    static void studentInit(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void systemOut(Student student){
        System.out.println("이름:" + student.name + "나이:" + student.age + "성적:" + student.grade);
    }
}
