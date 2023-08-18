package OOP.OOP.Sem1_famTree.family_tree;

import OOP.OOP.Sem1_famTree.family_tree.model.family_tree.FamilyTree;
import OOP.OOP.Sem1_famTree.family_tree.model.human.Gender;
import OOP.OOP.Sem1_famTree.family_tree.model.human.Human;
import OOP.OOP.Sem1_famTree.family_tree.model.writer.FileHandler;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String filePath = "OOP/Sem1_famTree/family_tree/data/tree.out";

        FileHandler fileHandler = new FileHandler();
        FamilyTree tree = (FamilyTree) fileHandler.read(filePath);
        System.out.println(tree);
    }

    static FamilyTree testTree() {
        FamilyTree tree = new FamilyTree();

        Human lyosha = new Human("Алексей", Gender.Male, LocalDate.of(1963, 12, 10));
        Human lena = new Human("Елена", Gender.Female, LocalDate.of(1965, 9, 15));
        tree.add(lyosha);
        tree.add(lena);
        tree.setWedding(lyosha.getId(), lena.getId());

        Human masha = new Human("Мария", Gender.Female, LocalDate.of(1988, 7, 5),
                lyosha, lena);
        Human vasya = new Human("Василий", Gender.Male, LocalDate.of(1991, 1, 25),
                lyosha, lena);
        tree.add(masha);
        tree.add(vasya);

        Human larisa = new Human("Лариса", Gender.Female, LocalDate.of(1945, 9, 1));
        larisa.addChild(lyosha);
        tree.add(larisa);

        return tree;
    }
}
