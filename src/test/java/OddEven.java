import org.junit.Test;

import java.util.List;
import java.util.*;




    // class Result {

    /*
     * Complete the 'oddNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

public class OddEven {
//sample
        public  static void main (String[] args) {
            List<Integer> oddNumbers;
             List list = oddNumbers(3, 10);
            final Object[] arr = new Object[list.size()];
            int index = 0;

            for (final Object value : list) {
                arr[index++] = value;
            }
            for (Object i : arr) {
                System.out.println(i);
            }

        }

    public static List oddNumbers(int i, int r) {
        int num;
        List<Integer> list = new ArrayList<Integer>();
        for (num = i; num <= r; num++) {
            if (num % 2 == 0) {
            } else {
                list.add(num);
            }

        }
        return list;
    }
    }

/*
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int l = Integer.parseInt(bufferedReader.readLine().trim());

            int r = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> result = Result.oddNumbers(l, r);

            bufferedWriter.write(
                    result.stream()
                            .map(Object::toString)
                            .collect(joining("\n"))
                            + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
*/


