import java.util.*;
import java.util.List;


    public class FindNumber {

        /*
         * Complete the 'findNumber' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY arr
         *  2. INTEGER k
         */

        public static void main(String[] args) {
            int k = 12;
            List<Integer> arr = new ArrayList<Integer>();

            for(int i=1;i<=2; i++){
                arr.add(i);
            }

            String n = FindNumber.findNumber(arr, k);

            System.out.println(n);

        }

        public static String findNumber(List<Integer> arr, int k) {
            // Write your code
            String n = "NO";
            String y = "YES";
            int c = arr.size();
            //List<Integer> list = new ArrayList<Integer>(c);
            for (int i = 0; i < c; i++) {
                if (arr.get(i) == k) {
                    return y;
                }

            }
            return n;
        }
    }
/*
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            //int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
            int arrCount = 10;

            List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            //int k = Integer.parseInt(bufferedReader.readLine().trim());
            int k = 12;

            System.out.println(arr);
            // arr = 10 ; k = 12
            String result = findNumber(arr, k);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
*/
