Asymptotic notation is a mathematical way to describe the time or space complexity of an algorithm as the input size (n) grows large.

Big O represents the upper bound (worst-case) of an algorithm's time or space complexity.

It tells us how the runtime grows with respect to the input size n.


## Self-Evaluation - Exercise 2: E-commerce Search Function

- Implemented both Linear and Binary Search algorithms successfully.
- Understood the importance of sorting before applying Binary Search.
- Verified search results with user input and compared both search methods.
- Gained clarity on why Binary Search is O(log n) — due to halving the search space.
- Learned to use `Arrays.sort()` with `Comparator.comparing(...)` for case-insensitive sorting.
- Encountered and resolved indexing confusion after sorting.

###analysis
#Use Binary Search when:
- product list is sorted by name (or you can sort once).

-Performance is important, especially with large inventories (e.g., 10,000+ products).

-Fast search response is needed to improve user experience.

#Use Linear Search when:
-Data is small or unsorted.

-Quick prototype or simplicity is preferred.

-Sorting overhead is not acceptable

##Time Complexity of Linear Search
Best Case: O(1)
→ When the target element is the first item in the array.

Average Case: O(n)
→ When the target is somewhere in the middle; on average, it checks half the elements.

Worst Case: O(n)
→ When the target is the last element or not present at all.

 #Time Complexity of Binary Search
Best Case: O(1)
→ When the target is exactly in the middle of the array.

Average Case: O(log n)
→ Because with each comparison, it eliminates half the array.

Worst Case: O(log n)
→ When it keeps halving until one element is left.

Note: Binary Search requires the array to be sorted.