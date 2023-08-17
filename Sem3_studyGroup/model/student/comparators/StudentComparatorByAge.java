package OOP.Sem3_studyGroup.model.student.comparators;

import OOP.Sem3_studyGroup.model.group.StudyGroupItem;

import java.util.Comparator;

public class StudentComparatorByAge<T extends StudyGroupItem> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
