package OOP.Sem3_studyGroup.view.commands;

import OOP.Sem3_studyGroup.view.ConsoleUI;

public class SortByName extends Command{

    public SortByName(ConsoleUI consoleUI) {
        super("Sort by name", consoleUI);
    }

    public void execute(){
        getConsoleUI().sortByName();
    }
}
