package OOP.OOP.Sem1_famTree.family_tree.family_tree;

import OOP.OOP.Sem1_famTree.family_tree.human.Human;
import OOP.OOP.Sem1_famTree.family_tree.human.HumanComparatorByBirthDate;
import OOP.OOP.Sem1_famTree.family_tree.human.HumanComparatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Serializable, Iterable<Human> {
    private long humansId;
    private List<Human> humanList;

    public FamilyTree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public boolean add(Human human) {
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)) {
            humanList.add(human);
            human.setId(humansId++);

            addToParents(human);
            addToChildren(human);

            return true;
        }
        return false;
    }

    private void addToParents(Human human) {
        for (Human parent: human.getParents()) {
            parent.addChild(human);
        }
    }

    private void addToChildren(Human human) {
        for (Human child: human.getChildren()) {
            child.addParent(human);
        }
    }

    public List<Human> getSiblings(int id) {
        Human human = getById(id);
        if (human == null) {
            return null;
        }
        List<Human> res = new ArrayList<>();
        for (Human parent: human.getParents()) {
            for (Human child: parent.getChildren()) {
                if (!child.equals(human)) {
                    res.add(child);
                }
            }
        }
        return res;
    }

    public List<Human> getByName(String name) {
        List<Human> res = new ArrayList<>();
        for (Human human: humanList) {
            if (human.getName().equalsIgnoreCase(name)) {
                res.add(human);
            }
        }
        return res;
    }

    public boolean setWedding (long humanId1, long humanId2) {
        if (checkId(humanId1) && checkId(humanId2)) {
            Human human1 = getById(humanId1);
            Human human2 = getById(humanId2);
            if (human1.getSpouse() == null && human2.getSpouse() == null) {
                human1.setSpouse(human2);
                human2.setSpouse(human1);
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean setDivorse (long humanId1, long humanId2) {
        if (checkId(humanId1) && checkId(humanId2)) {
            Human human1 = getById(humanId1);
            Human human2 = getById(humanId2);
            if (human1.getSpouse() != null && human2.getSpouse() != null) {
                human1.setSpouse(null);
                human2.setSpouse(null);
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean remove(long humansId) {
        if (checkId(humansId)) {
            Human e = getById(humansId);
            return humanList.remove(e);
        }
        return false;
    }

    private boolean checkId(long id) {
        if (id >= humansId || id < 0) {
            return false;
        }
        for (Human human: humanList) {
            if (human.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public Human getById(long id) {
        for (Human human: humanList) {
            if (human.getId() == id) {
                return human;
            }
        }
        return null;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Family tree contains ");
        sb.append(humanList.size());
        sb.append(" persons: \n");
        for (Human human: humanList) {
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public Iterator<Human> iterator() {
        return new FamilyTreeIterator(humanList);
    }
    @Override
    public void sortByName() {
        humanList.sort(new HumanComparatorByName());
    }
    public void sortByBirthDate() {
        humanList.sort(new HumanComparatorByBirthDate());
    }
}
