package OOP.OOP.Sem1_famTree.family_tree.view;

import OOP.OOP.Sem1_famTree.family_tree.view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Command> commandList;

    public MainMenu(ConsoleUI consoleUI) {
            commandList = new ArrayList<>();
            commandList.add(new GetHumanList(consoleUI));
            commandList.add(new SortByBirthDate(consoleUI));
            commandList.add(new SortByName(consoleUI));
        }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i< commandList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public void execute(int choice) {
        Command command = commandList.get(choice -1);
        command.execute();
    }
    public int getSize() {
        return commandList.size();
    }
}

