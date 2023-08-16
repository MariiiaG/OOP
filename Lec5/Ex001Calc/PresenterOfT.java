package OOP.Lec5.Ex001Calc;

public class PresenterOfT<T extends CalcModel> {


    OOP.Lec5.Ex001Calc.View view;
    Model model;

    public PresenterOfT(T m, OOP.Lec5.Ex001Calc.View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
