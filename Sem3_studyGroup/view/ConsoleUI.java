package OOP.Sem3_studyGroup.view;

import OOP.Sem3_studyGroup.presenter.Presenter;

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
        System.out.println("Hello there");
        while (work) {
            System.out.println(menu.menu());
            System.out.println("Select action:");
            String choice = scanner.nextLine();
            int choiceInt = Integer.parseInt(choice);
            menu.execute(choiceInt);
        }
    }

    public void finish() {
        System.out.println("See you again !");
        work = false;
    }

    public void errorInput() {
        System.out.println("Invalid value");
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getStudentListInfo() {
        presenter.getStudentListInfo();
    }

    public void addStudent(){
        System.out.println("Provide student name:");
        String name = scanner.nextLine();
        System.out.println("Age of the student:");
        String ageString = scanner.nextLine();
        int age = Integer.parseInt(ageString);

        presenter.addStudent(name, age);
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }
}
