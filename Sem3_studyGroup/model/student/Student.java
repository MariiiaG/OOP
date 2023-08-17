package OOP.Sem3_studyGroup.model.student;

import OOP.Sem3_studyGroup.model.group.StudyGroupItem;

public class Student implements Comparable<Student>, StudyGroupItem{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
