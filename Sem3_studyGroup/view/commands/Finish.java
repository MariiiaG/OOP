package OOP.Sem3_studyGroup.view.commands;

import OOP.Sem3_studyGroup.view.ConsoleUI;

public class Finish extends Command{

    public Finish(ConsoleUI consoleUI) {
        super("Exit", consoleUI);
    }

    public void execute(){
        getConsoleUI().finish();
    }
}
