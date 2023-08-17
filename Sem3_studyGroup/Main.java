package OOP.Sem3_studyGroup;


import OOP.Sem3_studyGroup.view.ConsoleUI;
import OOP.Sem3_studyGroup.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}
