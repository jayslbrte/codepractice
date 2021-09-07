import java.util.HashMap;

public class hashMap {

    public static void main (String[] args){

        HashMap<String, String> cars = new HashMap<String, String>();
        cars.put("Toyota", "Supra");
        cars.put("Honda", "S2000");
        cars.put("Hyundai", "Veloster");

        for (String i  : cars.keySet()){
            System.out.println( i  + " " + cars.get(i));
        }
    }
}
