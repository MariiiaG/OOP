package OOP.Sem3_studyGroup.model.service;

import OOP.Sem3_studyGroup.model.group.StudyGroup;
import OOP.Sem3_studyGroup.model.student.Student;

public class Service {
    private StudyGroup<Student> group;
    private int id;

    public Service() {
        group = new StudyGroup<>();
    }

    public void addStudent(String name, int age) {
        Student student = new Student(id++, name, age);
        group.addStudent(student);
    }

    public String getStudentsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Group name list:\n");

      /*  Iterator<Student> iterator = activeGroup.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }*/

        for (Student student: group) { // same as the block above, but shortened
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public void sortByName() {
        group.sortByName();
    }
    public void sortByAge() {
        group.sortByAge();
    }
}
