import java.util.ArrayList;
import java.util.List;

public class stableMarket {


        /*
         * Complete the 'getStableMarketData' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY data
         *  2. INTEGER x
         */

        //stable market period  =  prices change no more than a given value x in 2 days.
        // if there is multiple stable market period of longest length , return one that          occurs first

        public static List<Integer> getStableMarketData(List<Integer> data, int x) {
            // Write you
            int c = data.size();
            ArrayList<Integer> arr =  new ArrayList<Integer>();
            for (int i=0 ; i<c-1;i++){
                if (Math.abs((data.get(i)-data.get(i+1))) <= x){
                    arr.add(data.get(i));
                    arr.add(data.get(i+1));
                }
            }
            return arr;
        }


    public static void main (String[] args){

        ArrayList<Integer> data= new ArrayList<Integer>();
        data.add(0,10);
        data.add(1,8);
        data.add(2,18);
        data.add(3,18);

        getStableMarketData(data,0);
        System.out.println(data);

    }
}
