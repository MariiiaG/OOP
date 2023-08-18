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
        view.print(answer);
    }

    public void getHumanList() {
        String answer = service.getHumanList();
        view.print(answer);
    }

    public void sortByName() {
        service.sortByName();
    }
    public void sortByBirthDate() {
        service.sortByBirthDate();
    }
}
