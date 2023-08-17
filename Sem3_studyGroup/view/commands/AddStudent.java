package OOP.Sem3_studyGroup.view.commands;

import OOP.Sem3_studyGroup.view.ConsoleUI;

public class AddStudent extends Command{

    public AddStudent(ConsoleUI consoleUI) {
        super("Add Student", consoleUI);
    }

    public void execute(){
        getConsoleUI().addStudent();
    }
}
