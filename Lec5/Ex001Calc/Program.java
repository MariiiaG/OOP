package OOP.Lec5.Ex001Calc;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new OOP.Lec5.Ex001Calc.View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
