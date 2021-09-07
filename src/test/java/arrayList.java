import java.util.ArrayList;
import java.util.List;

public class arrayList {

    private static List<Integer> removeNum(List<Integer> r, int l) {
        //try {
            for (int i = 0; i <= r.size(); i++) {
                if (r.get(i) == l) {
                    r.remove(i);
                }
            }


       // } catch (Exception e) {
       //     System.out.println("Something went wrong");
      //  }
        return r;
    }



    public static void main (String[] args){
        ArrayList <Integer> numbers= new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        arrayList.removeNum(numbers,1);

        System.out.println(numbers);
    }
}
