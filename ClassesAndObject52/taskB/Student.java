

public class Student {
    private String name;
    private String surname;
    private int age;
    private char group;
    private double averageMark;

    public Student(String name, String surname, int age, char group, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", group = " + group +
                ", averageMark = " + averageMark +
                '}';
    }
}
