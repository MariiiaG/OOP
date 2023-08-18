package OOP.OOP.Sem1_famTree.family_tree;

import OOP.OOP.Sem1_famTree.family_tree.model.Service;
import OOP.OOP.Sem1_famTree.family_tree.model.family_tree.FamilyTree;
import OOP.OOP.Sem1_famTree.family_tree.model.human.Gender;
import OOP.OOP.Sem1_famTree.family_tree.model.human.Human;
import OOP.OOP.Sem1_famTree.family_tree.model.writer.FamTreeFileHandler;
import OOP.OOP.Sem1_famTree.family_tree.view.ConsoleUI;
import OOP.OOP.Sem1_famTree.family_tree.view.View;

import java.time.LocalDate;

public class Main {
    /*public static void main(String[] args) {

        View view =new ConsoleUI();
        view.start();
    }*/
    public static void main(String[] args) {
        FamilyTree<Human> tree = new FamilyTree<>();

        Human lyosha = new Human("Лёша", Gender.Male, LocalDate.of(1967, 4, 5));
        Human lena = new Human("Лена", Gender.Female, LocalDate.of(1967, 12, 30));
        Human masha = new Human("Маша", Gender.Female, LocalDate.of(1989, 7, 12), lyosha, lena);
        Human vasya = new Human("Вася", Gender.Male, LocalDate.of(1980, 1, 23), lyosha, lena);

        tree.add(lyosha);
        tree.add(lena);
        tree.add(masha);
        tree.add(vasya);

        System.out.println(tree);

        Service service = new Service(tree);

        service.setWritable(new FamTreeFileHandler());
        service.save();

        View view =new ConsoleUI();
        view.start();
    }
}
