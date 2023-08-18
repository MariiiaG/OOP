package OOP.OOP.Sem1_famTree.family_tree.view.commands;

import OOP.OOP.Sem1_famTree.family_tree.view.ConsoleUI;

public class GetHumanList implements Command{
    private ConsoleUI consoleUI;

    public GetHumanList(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }
    public String getDescription() {
        return "See the list of persons";
    }
    public void execute() {
        consoleUI.getHumanList();
    }
}
