package OOP.Lec3.Ex001;

public class Program {
    public static void main(String[] args) {

        // List<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(12);
        // nums.add(123);
        // nums.add(1234);
        // nums.add(12345);

        // Iterator<Integer> iter = nums.iterator();
        // while (iter.hasNext()) {
        //     System.out.println(iter.next());
        // }

        Worker worker = new Worker(
            "Имя", "Фамилия", 23, 4567);

        //Iterator<Object> components = worker.iterator(); // how to use iterator to go through items within the class ?
        // see how in Ex002

        
    }
}