import java.util.Arrays;

public class arrayPairsGreaterZero {
    static int findNumOfPair(int a[], int n)
    {

        // Sorting the given array
        Arrays.sort(a); //-2, 1, 3

        // Variable to store the count of pairs
        int ans = 0;

        // Loop to iterate through the array
        for (int i = 0; i < n; ++i) {

            // Ignore if the value is negative
            if (a[i] <= 0)
                continue;

            // Finding the index using lower_bound
            // find length of array
            int len = a.length; // len = 3
            int j = 0;

            // traverse in the array
            while (j < len) {     //0 < 3

                // if the j-th element is n
                // then return the index
                if (a[j] == n) {
                    return j;
                }
                else {
                    j = j + 1;
                }
            }
            // Finding the number of pairs between
            // two indices i and j
            ans += i - j;
        }
        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        int a[] = { 3, -2, 1 };
        int n = a.length;

        int ans = findNumOfPair(a, n);
        System.out.println(ans);
    }
}

