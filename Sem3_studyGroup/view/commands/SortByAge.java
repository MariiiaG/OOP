package OOP.Sem3_studyGroup.view.commands;

import OOP.Sem3_studyGroup.view.ConsoleUI;

public class SortByAge extends Command{

    public SortByAge(ConsoleUI consoleUI) {
        super("Sort by age", consoleUI);
    }

    public void execute(){
        getConsoleUI().sortByAge();
    }
}
