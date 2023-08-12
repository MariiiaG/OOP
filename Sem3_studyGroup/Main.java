package OOP.Sem3_studyGroup;

import OOP.Sem3_studyGroup.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Pasha", 18);
        service.addStudent("Masha", 17);
        service.addStudent("Lena", 19);
        service.addStudent("Ivan", 20);

        System.out.println(service.info());
        service.sortByName();
        System.out.println(service.info());
    }
}
