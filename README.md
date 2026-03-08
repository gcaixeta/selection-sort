# Selection Sort

Exercise from the **Data Structures 2** course, implementing the **Selection Sort** algorithm in three programming languages: Python, Go, and Java.

---

## The Algorithm

**Selection Sort** is a simple sorting algorithm that works as follows:

1. Scan the array to find the smallest element in the unsorted subarray.
2. Swap that element with the first element of the unsorted subarray.
3. Advance the boundary of the sorted subarray by one position.
4. Repeat until the entire array is sorted.

### Complexity

| Case    | Time  | Space |
|---------|-------|-------|
| Best    | O(n²) | O(1)  |
| Average | O(n²) | O(1)  |
| Worst   | O(n²) | O(1)  |

Selection Sort always performs O(n²) comparisons regardless of the initial state of the array. Its main advantage is the minimum number of swaps: at most **n-1 swaps**.

---

## Repository Structure

```
selection-sort/
├── python/
│   └── ssort.py          # Python implementation
├── go/
│   └── ssort.go          # Go implementation
└── java/
    └── selection-sort/
        └── src/main/java/dev/gustavorosa/
            ├── Main.java           # Entry point
            └── SelectionSort.java  # Algorithm logic
```

---

## Implementations

### Python (`python/ssort.py`)

- `find_smallest(array, start)` — finds the smallest value and its index starting from a given position.
- `generate_random_array(size, min, max)` — generates a random integer array.
- `selection_sort(array)` — sorts the array and prints the state after each iteration.
- Tests with arrays of size 10, 100, and 1000.

**How to run:**
```bash
cd python
python ssort.py
```

---

### Go (`go/ssort.go`)

- `generateRandomArray(size, max int)` — generates a random integer array.
- `selectionSort(unsorted []int)` — sorts the array in-place and returns it.
- Tests with arrays of size 10, 100, and 1,000,000.

**How to run:**
```bash
cd go
go run ssort.go
```

---

### Java (`java/selection-sort/`)

- Standard Maven project structure.
- `SelectionSort.java` — contains static methods `sort` and `findIndexOfSmallest`.
- `Main.java` — generates random arrays and calls the algorithm, printing the partial state after each swap.
- Tests with arrays of size 10 and 100.

**How to run:**
```bash
cd java/selection-sort
mvn compile exec:java -Dexec.mainClass="dev.gustavorosa.Main"
```

Or open the project in IntelliJ IDEA and run `Main.java` directly.

---

## Expected Output

All implementations print:

- The unsorted array.
- At each iteration: the smallest element found and its position.
- The partially sorted state of the array after each swap.
- The fully sorted array at the end.

Example (Python, array of size 5):

```
Unsorted array:
[42, 7, 19, 3, 55]

The smallest number in the 0th round is 3 in the 3 position
Partially ordered array:
[3, 7, 19, 42, 55]

...

Sorted array:
[3, 7, 19, 42, 55]
```

---

## Course

> Data Structures 2 — Sorting algorithms implementation exercise.
