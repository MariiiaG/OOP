package OOP.OOP.Sem1_famTree.family_tree.presenter;

import OOP.OOP.Sem1_famTree.family_tree.model.Service;
import OOP.OOP.Sem1_famTree.family_tree.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        service = new Service();
        this.view = view;
    }
    public void addHuman(String name, String gender, String birthDate, long idFather, long idMother) {
        String answer = service.addHuman(name, gender, birthDate, idFather, idMother);
        view.printAnswer(answer);
    }

    public void getHumanList() {
        view.printAnswer(service.getHumanList());
    }

    public void sortByName() {
        service.sortByName();
        view.printAnswer("Sort Family Tree by name\n");
    }
    public void sortByBirthDate() {
        service.sortByBirthDate();
        view.printAnswer("Sort Family Tree by birth date\n");
    }
}
