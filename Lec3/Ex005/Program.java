package OOP.Lec3.Ex005;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        // #region Collections.sort(numbers);
       /* List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        numbers.add(r.nextInt(1,20));
        }

        System.out.println(numbers); // [8, 2, 8, 13, 6, 6, 10, 15, 16, 7]
        Collections.sort(numbers);
        System.out.println(numbers); //  sorted : [2, 6, 6, 7, 8, 8, 10, 13, 15, 16]*/
        // #endregion

        // #region Comparable<Worker>
        List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
        db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18,31),
        r.nextInt(10000)));
        }
        System.out.println(db);

        db.sort((w1, w2) -> Integer.compare(w1.salary, w2.salary)); // a simpler way to do comparisons
        // Collections.sort(db);
        // Array.sort(...)

        System.out.println(db); // sorts by age. See method compareTo in Worker

        // #endregion

        // #region Comparable<Worker>

     /*   List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
        }
        System.out.println(db); // not sorted

        db.sort(new AgeComporator());

        System.out.println(db); // sorted by age*/

        // #endregion

        //#region

        Worker w1 = new Worker("Имя", "Фамилия", 20, 20);
        Worker w2 = new Worker("Имя", "Фамилия", 20, 20);
        

        //#endregion

    }
}
