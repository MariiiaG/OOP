package OOP.OOP.Sem1_famTree.family_tree.view.commands;

import OOP.OOP.Sem1_famTree.family_tree.view.ConsoleUI;

public class SortByBirthDate {
    private ConsoleUI consoleUI;

    public SortByBirthDate(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }
    public String getDescription() {
        return "Sort Family Tree by birth date";
    }
    public void execute() {
        consoleUI.sortByBirthDate();
    }
}
