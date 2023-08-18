package OOP.OOP.Sem1_famTree.family_tree.model.writer;

import OOP.OOP.Sem1_famTree.family_tree.model.family_tree.FamilyTree;
import OOP.OOP.Sem1_famTree.family_tree.model.human.Human;

public class FamTreeFileHandler extends FileHandler implements Writable{
    private String filePath = "OOP/Sem1_famTree/family_tree/data/tree.out";
    @Override
    public boolean save(FamilyTree<Human> tree) {
        return super.save(tree, filePath);
    }

    @Override
    public FamilyTree<Human> read() {
        return (FamilyTree<Human>) super.read(filePath);
    }

    @Override
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
