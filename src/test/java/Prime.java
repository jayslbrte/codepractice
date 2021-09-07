public class Prime {
         static void checkPrime(int n) {
             int i, m = 0, flag = 0;
            m = n / 2;       // m=14
             if (n == 0 || n == 1) {  //7
                 System.out.println(n + "is not a prime number");
             } else {
                 for (i = 2; i <= m; i++) { // 7
                     if (n % i == 0) {     //7 %  3
                         System.out.println(n + "is not a prime number");
                         flag = 1;
                         break;
                     }
                 }
                 if (flag == 0) {
                     System.out.println(n + "is a prime number");
                 }

             }
         }
             public static void main(String[] args){
            //checkPrime(1);
            checkPrime(5);
            //checkPrime(17);
            //checkPrime(20);
        }
    }

