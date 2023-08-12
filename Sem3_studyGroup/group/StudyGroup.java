package OOP.Sem3_studyGroup.group;

import OOP.Sem3_studyGroup.student.comparators.StudentComparatorByAge;
import OOP.Sem3_studyGroup.student.comparators.StudentComparatorByName;
import OOP.Sem3_studyGroup.student.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public  void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }

    public void sortByName() {
        studentList.sort(new StudentComparatorByName());
    }

    public void sortByAge() {
        studentList.sort(new StudentComparatorByAge());
    }
}
