package OOP.Sem3_studyGroup.presenter;

import OOP.Sem3_studyGroup.model.service.Service;
import OOP.Sem3_studyGroup.view.View;
import OOP.Sem3_studyGroup.view.ConsoleUI;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addStudent(String name, int age) {
        service.addStudent(name, age);
        getStudentListInfo();
    }

    public void getStudentListInfo() {
        String info = service.getStudentsInfo();
        view.printAnswer(info);
    }

    public void sortByName() {
        service.sortByName();
        getStudentListInfo();
    }

    public void sortByAge() {
        service.sortByAge();
        getStudentListInfo();
    }
}
