package OOP.OOP.Sem1_famTree.family_tree.model.writer;

import OOP.OOP.Sem1_famTree.family_tree.model.family_tree.FamilyTree;
import OOP.OOP.Sem1_famTree.family_tree.model.human.Human;

public interface Writable {
    boolean save (FamilyTree<Human> tree);
    FamilyTree<Human> read();
    void setFilePath(String filePath);
}
