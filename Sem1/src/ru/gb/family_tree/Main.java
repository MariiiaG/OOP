package OOP.Sem1.src.ru.gb.family_tree;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FamilyTree tree = testTree();
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
