package OOP.OOP.Sem1_famTree.family_tree.view.commands;

import OOP.OOP.Sem1_famTree.family_tree.view.ConsoleUI;

public class SortByName implements Command{
    private ConsoleUI consoleUI;

    public SortByName(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }
    public String getDescription() {
        return "Sort Family Tree by name";
    }
    public void execute() {
        consoleUI.sortByName();
    }
}
