package OOP.Lec5.Ex002Phonebook.UI;

public class NewConsoleView extends OOP.Lec5.Ex002Phonebook.UI.ConsoleView {
    
    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();
    }

}
