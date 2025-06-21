# Exercise 3: Sorting Customer Orders

## Step 1: Understand Sorting Algorithms

### 🔹 1. Bubble Sort
- Compares and swaps adjacent elements until the array is sorted.
- Simple but inefficient for large data sets.
- **Time Complexity:**
  - Best Case: `O(n)` (already sorted)
  - Average/Worst Case: `O(n²)`
- **Space Complexity:** `O(1)`

---

### 🔹 2. Insertion Sort
- Builds the final sorted array one item at a time.
- Good for small or nearly sorted arrays.
- **Time Complexity:**
  - Best Case: `O(n)`
  - Average/Worst Case: `O(n²)`
- **Space Complexity:** `O(1)`

---

### 🔹 3. Merge Sort
- Divide and Conquer strategy.
- Splits the array, recursively sorts and merges.
- **Time Complexity:** `O(n log n)` in all cases
- **Space Complexity:** `O(n)` (needs extra memory)

---

###  4. Quick Sort
- Picks a pivot, partitions the array, and recursively sorts the partitions.
- Efficient and commonly used.
- **Time Complexity:**
  - Best/Average: `O(n log n)`
  - Worst: `O(n²)` (rare, depends on pivot)
- **Space Complexity:** `O(log n)` (stack space)

------------------------------------------
- **Step 4 Analysis:** 
Scenario     bubbleSort    quickSort
Best Case.   O(n)          O(n logn)
avaerage case O(n²)         O(n log n)
worstcase     O(n²).        O(n²)(rare case)

## Quick sort is preferred over bubble sort beacause
1.Efficiency-quick sort is significantly faster in most real-world use cases due its divide and conquer strategy
2.Scalability-Quick sort handles large datasets efficiently
3.widely-used
quicksort is commonly used in standard library implementations and is considered production grade
4.better average case
quick sort has O(n log n) avearge time,while bubble sort remains O(n2) even for random inputs.



