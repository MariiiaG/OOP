package OOP.Sem3_studyGroup.view.commands;

import OOP.Sem3_studyGroup.view.ConsoleUI;

public class GetStudentListInfo extends Command{

    public GetStudentListInfo(ConsoleUI consoleUI) {
        super("Get student list", consoleUI);
    }

    public void execute(){
        getConsoleUI().getStudentListInfo();
    }
}
