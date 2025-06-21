## Recursive Algorithms - Concept

**Recursion** is a technique in which a function calls itself to solve smaller instances of a problem.  
It is especially useful when a problem can be broken down into repetitive subproblems.

In financial forecasting, recursion helps us simulate compound growth by applying the growth rate year by year until the target year is reached.
----------------------------------------------------------------------------------

Time Complexity Analysis
Time Complexity: O(n), where n is the number of years.
Each recursive call decreases the number of years by 1.

Space Complexity: O(n), due to the call stack from recursion.

