import java.util.List;
import java.util.LinkedList;

public class ArrayList {
    public  static void main (String[] args){
        // List<String> cars = new ArrayList<>();
        // JRE version issue which is why above code was throwing error
        // List<String> cars = new java.util.ArrayList<>();
        List<String> cars = new LinkedList<>();
        cars.add("Porsche");
        cars.add("Nissan");
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Ferrari");
        System.out.println(cars);

    }
    
}
