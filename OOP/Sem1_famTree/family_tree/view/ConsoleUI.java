package OOP.OOP.Sem1_famTree.family_tree.view;

import OOP.OOP.Sem1_famTree.family_tree.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Welcome to the Family Tree !");
        while (work) {
            System.out.println(menu.print());
            System.out.println("Select action:");
            String choice = scanner.nextLine();
            int choiceInt = Integer.parseInt(choice);
            menu.execute(choiceInt);
        }
    }
    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    public void getHumanList() {
        presenter.getHumanList();
    }
    public void sortByName() {
        presenter.sortByName();
    }
    public void sortByBirthDate() {
        presenter.sortByBirthDate();
    }
}
