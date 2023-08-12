package OOP.OOP.Sem1_famTree.family_tree.writer;

import java.io.Serializable;

public interface Writable {
    boolean save (Serializable serializable, String filePath);
    Object read(String filePath);
}
