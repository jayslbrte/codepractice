import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

class OddbyHackerank {

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        List<Integer> list = new ArrayList<Integer>();
        for (int num = l; num<= r;l++)
        {
            if (num % 2 == 0){
            }
            else {
                list.add(num);
            }
        }
        return list;
    }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            //int l = Integer.parseInt(bufferedReader.readLine().trim());
            int l = 1;
            //int r = Integer.parseInt(bufferedReader.readLine().trim());
            int r = 9;
            List<Integer> result = oddNumbers(l, r);

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


