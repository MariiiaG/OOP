package OOP.OOP.Sem1_famTree.family_tree;

import OOP.OOP.Sem1_famTree.family_tree.family_tree.FamilyTree;
import OOP.OOP.Sem1_famTree.family_tree.human.Gender;
import OOP.OOP.Sem1_famTree.family_tree.human.Human;
import OOP.OOP.Sem1_famTree.family_tree.writer.FileHandler;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String filePath = "OOP/Sem1_famTree/family_tree/data/tree.out";
       /* FileHandler fileHandler = new FileHandler();

        FamilyTree tree = testTree();
        System.out.println(tree);

        fileHandler.save(tree, filePath);*/

        FileHandler fileHandler = new FileHandler();
        FamilyTree tree = (FamilyTree) fileHandler.read(filePath);
        System.out.println(tree);
    }

    static FamilyTree testTree() {
        FamilyTree tree = new FamilyTree();

        Human vanya = new Human("Василий", Gender.Male, LocalDate.of(1963, 12, 10));
        Human masha = new Human("Мария", Gender.Female, LocalDate.of(1965, 9, 15));
        tree.add(vanya);
        tree.add(masha);
        tree.setWedding(vanya.getId(), masha.getId());

        Human christina = new Human("Кристина", Gender.Female, LocalDate.of(1988, 7, 5),
                vanya, masha);
        Human semyon = new Human("Семен", Gender.Male, LocalDate.of(1991, 1, 25),
                vanya, masha);
        tree.add(christina);
        tree.add(semyon);

        Human larisa = new Human("Лариса", Gender.Female, LocalDate.of(1945, 9, 1));
        larisa.addChild(vanya);
        tree.add(larisa);

        return tree;
    }
}
