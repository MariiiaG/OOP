package OOP.OOP.Sem1_famTree.family_tree.model;

import OOP.OOP.Sem1_famTree.family_tree.model.family_tree.FamilyTree;
import OOP.OOP.Sem1_famTree.family_tree.model.human.Gender;
import OOP.OOP.Sem1_famTree.family_tree.model.human.Human;
import OOP.OOP.Sem1_famTree.family_tree.model.writer.Writable;

import java.time.LocalDate;

public class Service {
    private Writable writable;
    private FamilyTree<Human> tree;

    public Service(FamilyTree<Human> tree) {
        this.tree = tree;
    }
    public Service() {
        tree = new FamilyTree<>();
    }
    public boolean save() {
        if (writable == null) {
            return false;
        }
        return writable.save(tree);
    }
    public boolean load() {
        if (writable == null) {
            return false;
        }
        tree = writable.read();
        return true;
    }
    public String addHuman(String name, String genderString, String birthDate, long idFather, long idMother) {
        Human father = tree.getById(idFather);
        Human mother = tree.getById(idMother);
        Gender gender = Gender.valueOf(genderString);
        LocalDate humanBirthDate = LocalDate.parse(birthDate);
        Human human = new Human(name, gender, humanBirthDate, father, mother);
        tree.add(human);
        return "Successfully added a new person to the Tree";
    }
    public void setWritable(Writable writable) {
        this.writable = writable;
    }
    public String getHumanList() {
        return tree.getInfo();
    }
    public void sortByName() {
        tree.sortByName();
    }
    public void sortByBirthDate() {
        tree.sortByBirthDate();
    }
}
