package practice.dsa.java.a.intro;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimeComplexity {

    public static void main(String[] args) {
        // Record the start time to measure execution duration
        LocalDateTime start = LocalDateTime.now(); // 1 operation, O(1) time, uses constant space

        int j = 0;      // 1 operation, O(1) time, uses 4 bytes (int)
        int n = 10;     // 1 operation, O(1) time, uses 4 bytes (int)

        // The for-loop runs from i = 0 to i < n (i.e., n times)
        // Loop details:
        // - Initialization: int i = 0        → 1 time, O(1)
        // - Check condition: i < n           → n+1 times, O(n)
        // - Increment: i++                   → n times, O(n)
        // - Body (per iteration): 
        //   - int a = i;  (assigns i to a)   → n times, O(n)
        //   - j = j + a;  (adds a to j)      → n times, O(n)
        for (int i = 0; i < n; i++) {        
            int a = i;   // Each iteration, O(1) per iteration
            j = j + a;   // Each iteration, O(1) per iteration
        }

        // Record the end time after the loop
        LocalDateTime end = LocalDateTime.now(); // 1 operation, O(1) time

        // Calculate the duration between start and end
        Duration duration = Duration.between(start, end); // 1 operation, O(1) time

        // Print the execution time in nanoseconds
        System.out.println("Time taken: " + duration.toNanos());

        /*
         * --- Time Complexity Calculation ---
         * Operations outside loop:           O(1) each (start, j, n, end, duration, print)
         * Loop runs 'n' times:
         *   - int a = i;                     O(1) per iteration, O(n) total
         *   - j = j + a;                     O(1) per iteration, O(n) total
         * For-loop headers (init, check, increment): O(n) total
         * Total operations: O(1) + O(n) + O(n) + O(n) = O(n)
         * So, Time Complexity: O(n)
         *
         * --- Space Complexity Calculation ---
         * Variables:
         *   - start, end, duration (objects): constant space
         *   - int j, n, i, a: primitive variables, constant space each
         * No arrays or collections that grow with 'n'.
         * Even though 'a' is declared in the loop, it's re-used each iteration (not O(n) additional space)
         * So, Space Complexity: O(1)
         */
    }
}