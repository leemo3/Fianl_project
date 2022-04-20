package ch_22;

public class Final_project {

  /** ali = GCD
   * finding the GCD of every two consecutive Fibonacci numbers from the index
  * 40 to index 45 using the algorithms in Listings 22.3 and 22.4. Your program
  * should print a table like this:
  * --------------------|   40     41    42    43    44    45
  * 
  * GCD = ali
  * Basel Musaed GCD
  * <p>
  * (Hint: You can use the following code template to obtain the execution time.)
  * long startTime = System.currentTimeMillis();
  * perform the task;
  * long endTime = System.currentTimeMillis();
  * long executionTime = endTime - startTime;
  */
    public static void main(String[] args) {
        int[] fibs = calcFibIndexes40to45();
        /** calculate the Fibonacci numbers from index 20 to index 25 */

        System.out.println("\t\t20    21    22    33    24    25");
        System.out.println("--------------------|");
        System.out.print("Basel Musaed\t\t  ");
        for (int i = 0; i < fibs.length - 1; i++) {
            long startTime = System.currentTimeMillis();
            ali(fibs[i], fibs[i + 1]);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.print("   " + executionTime);
        }
        System.out.print("\nALi Mohamed ");
        for (int i = 0; i < fibs.length - 1; i++) {
            long startTime = System.currentTimeMillis();
            aliEuclid(fibs[i], fibs[i + 1]);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.print("     " + executionTime);
        }
    }
    
    /**
     * Find GCD for integers m and n using Euclid's algorithm
     */

    private static int aliEuclid(int i, int j) {
      return 0;
    }


    private static int ali(int i, int j) {
      return 0;
    }

    /**
     * Find GCD for integers m and n
     */

    public static int aliEuclid1(int m, int n) {
        if (m % n == 0)
            return n;
        else
            return aliEuclid(n, m % n);
    }



    public static int basel(int m, int n) {
        int basel = 1;
        if (m % n == 0) return n;
        for (int k = n / 2; k >= 1; k--) {
            if (m % k == 0 && n % k == 0) {
                basel = k;
                break;
            }
        }

        return basel;
    }


    private static int[] calcFibIndexes40to45() {
        int[] fibs = new int[6];
        int i = 2;
        int f0 = 0;
        int f1 = 1;
        int f2 = 0;
        while (i < 40) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            i++;
        }
        for (int j = 0; j < fibs.length; j++) {
            f2 = f0 + f1;
            fibs[j] = f2;
            f0 = f1;
            f1 = f2;
        }

        return fibs;
    }


}