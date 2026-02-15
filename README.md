# DSA In Java — 2026 (Day Wise Practice)

> **No regret. Only result.**
> Daily DSA practice using Java with day-wise code + output.

---

## 🎯 Purpose
This repository is my **2026 consistency challenge** to master:
- Data Structures & Algorithms (DSA)
- Java fundamentals through problem solving
- Better coding logic for **SDET / Automation Testing**
- Strong foundation for future **Java Developer** role

---

## 📌 What this repo contains
✅ Day-wise folders with:
- Java code solutions  
- Output / result screenshots or output text  

---

## 🚀 Day-wise Topic:
### 📅 Day 10 — Pattern Problems

| No. | Pattern Name | Core Logic / Condition |
|----:|--------------|------------------------|
| 1 | Hollow Rectangle | i==1 || i==r || j==1 || j==c |
| 2 | Star Plus | i==n/2+1 || j==n/2+1 |
| 3 | Centered Triangle | `j>=c-(i-1) && j<=c+(i-1)` |
| 4 | Star Cross (X) | i==j || i+j==n+1 |
| 5 | Floyd’s Triangle | Continuous number increment |
| 6 | Binary Triangle | `(i+j)%2` |
| 7 | Odd Number Triangle | Odd AP (`+2` increment) |
| 8 | Vertically Flipped Triangle | `i+j>n` |

### 📅 Day 11 — Pattern Problems

| No. | Pattern Name | Core Logic / Condition |
|----:|--------------|------------------------|
| 1 | Vertically Flipped Star Triangle | `j >= (n + 1 - i)` |
| 2 | Vertically Flipped Number Triangle | `j >= (n + 1 - i)` + counter |
| 3 | Star Triangle (Best Method) | spaces = `n - i`, stars = `i` |
| 4 | Number Triangle (Best Method) | spaces = `n - i`, print `j` |
| 5 | Alphabet Triangle | `(char)(i + 64)` |
| 6 | Rhombus Pattern | fixed stars + spaces = `mid - i` |
| 7 | Inverted Star Triangle (HW) | spaces = `i - 1`, stars = `n - (i - 1)` |
| 8 | Pyramid (Formula Based) | stars = `(2 * i) - 1` |
| 9 | Pyramid (Variable Based) | `nsp--`, `nst += 2` |

### 📅 Day 12 — Pattern Problems

| No. | Pattern Name | Core Logic / Condition |
|----:|--------------|------------------------|
| 1 | Diamond Pattern (Method 1) | `nsp-- , nst += 2` (upper) → `nsp++ , nst -= 2` (lower) |
| 2 | Diamond Pattern (Method 2) | spaces = `n - i`, stars = `(2 * i) - 1` |
| 3 | Inverted Diamond (Lower Half) | stars = `(2 * n - 1) - 2 * i` |
| 4 | Bridge Pattern (Top Line) | stars = `2 * n - 1` |
| 5 | Bridge Pattern (Body) | left/right stars = `n - i`, mid spaces = `(2 * i) - 1` |
| 6 | Number Spiral Pattern | `Math.min(a, b)` |
| 7 | Row Reflection | `if (i > n) i = 2 * n - i` |
| 8 | Column Reflection | `if (j > n) j = 2 * n - j` |

### 📅 Day 13 — Pattern Problems (Java)

| No. | Pattern Name | Core Logic / Condition |
|----:|--------------|------------------------|
| 1 | Square Hollow Pattern | `i==1 || i==n || j==1 || j==n` |
| 2 | Number Triangle (Right Aligned) | Spaces: `j<=n-i`, print `i` |
| 3 | Number Increasing Pyramid | Inner loop prints `1` to `j` |
| 4 | Number Increasing Reverse Pyramid | Loop till `n+1-i` |
| 5 | Number Changing Pyramid | Helper variable increment (`num++`) |
| 6 | Zero-One Triangle | `(i + j) % 2` |
| 7 | Palindromic Number Triangle | Decrease till mid, then increase |
| 8 | Rhombus Pattern | Leading spaces `j<=i-1`, fixed stars |
| 9 | Diamond Pattern | Upper + lower half separation |
|10 | Butterfly Star Pattern | `stars + spaces + stars` symmetry |

### 📅 Day 14 — Pattern Problems (Java)

| No. | Pattern Name | Core Logic / Condition |
|----:|--------------|------------------------|
| 1 | Square Filled Pattern | Print `*` for all rows and columns |
| 2 | Right Half Star Pyramid | Inner loop: `j <= i` |
| 3 | Reverse Right Half Pyramid | Inner loop: `j <= n + 1 - i` |
| 4 | Left Half Pyramid | Spaces: `j <= n - i`, then stars |
| 5 | Reverse Left Half Pyramid | Spaces: `j <= i - 1`, stars till `n + 1 - i` |
| 6 | K Star Pattern | Top: `n + 1 - i`, Bottom: `i + 1` |
| 7 | Triangle Star Pattern | Leading spaces + `* ` till `i` |
| 8 | Reverse Number Triangle | Helper variable starts from `i` |
| 9 | Mirror Image Number Triangle | Upper + lower numeric mirror |
|10 | Hollow Triangle Pattern | `j==1 || j==i || i==n` |

### 📅 Day 15 — Pattern Problems (Java)

| No. | Pattern Name | Core Logic / Condition |
|----:|--------------|------------------------|
| 1 | Hollow Reverse Triangle | `i==1 || j==1 || j==n+1-i` |
| 2 | Hollow Diamond Pyramid | Upper: `j==1 || j==i` , Lower: `j==1 || j==n-i` |
| 3 | Hollow Hourglass Pattern | Top: `i==1 || j==1 || j==n+1-i` , Bottom: `j==1 || j==i+1 || i==n-1` |
| 4 | Pascal’s Triangle (Basic) | `j==1 || j==i` → `1`, else `i-1` |
| 5 | Right Pascal’s Triangle | Stars increase till `i`, then decrease |

### 📅 Day 16 — Java Methods & Functions

| No. | Topic / Program | Core Concept / Logic |
|----:|-----------------|----------------------|
| 1 | Method Calling Flow | One method calling another → execution follows call stack order |
| 2 | Void Methods | No return value, only execution (`adarsh()`, `aman()`, `virat()`) |
| 3 | Parameters vs Arguments | Parameters = placeholders, Arguments = actual values passed |
| 4 | Built-in Math Methods | `Math.max()`, `Math.sqrt()`, `Math.pow()`, `Math.abs()` |
| 5 | Method Overloading | Same method name, different parameter list (`max(a,b)` & `max(a,b,c)`) |
| 6 | Return Type Methods | Value returned using `return` statement (`pritam()`, `partner()`) |
| 7 | Factorial Function | Loop-based multiplication from `n` to `1` |
| 8 | nCr Calculation | `n! / (r! * (n-r)!)` using factorial method |
| 9 | Pass by Value | Changes inside method do **not** affect original variable |
|10 | Swap Logic | Swap inside method fails due to pass-by-value |

### 📅 Day 17 — Arrays Basics
| No. | Topic / Program                    | Core Concept / Logic                            |
| --: | ---------------------------------- | ----------------------------------------------- |
|   1 | Array Initialization (Literal)     | `int[] x = {6,19,7,69,171,5};`                  |
|   2 | Array Indexing                     | Access elements using `x[index]`                |
|   3 | Updating Array Element             | Arrays are mutable → `x[index] = newValue`      |
|   4 | Array Initialization (new keyword) | `int[] x = new int[size];`                      |
|   5 | Traversal using For Loop           | Index-based loop → `i < x.length`               |
|   6 | Traversal using For-Each Loop      | Value-based traversal → `for (int i : x)`       |
|   7 | Default Values in Array            | New int array → all elements initialized to `0` |
|   8 | User Input in Array                | Loop + `Scanner.nextInt()`                      |
|   9 | Printing Negative Elements         | Condition check → `if (i < 0)`                  |
|  10 | Sum of Array Elements              | Accumulator logic → `sum += i`                  |

### 📅 Day 18 — Array Min & Max Problems
| No. | Topic / Program           | Core Concept / Logic                            |
| --: | ------------------------- | ----------------------------------------------- |
|   1 | Print Array Elements      | Traverse array using `for` loop                 |
|   2 | Maximum Element in Array  | Compare with reference → `max = arr[0]`         |
|   3 | Max Logic Update          | Condition → `if (max <= arr[i])`                |
|   4 | Minimum Element in Array  | Compare with reference → `min = arr[0]`         |
|   5 | Min Logic Update          | Condition → `if (min >= arr[i])`                |
|   6 | Handling Negative Numbers | Comparison works for negative & zero values     |
|   7 | Single-Pass Traversal     | Loop from index `1` to `arr.length - 1`         |
|   8 | Problem Solving (GFG)     | Applied logic on real interview-style questions |

### 📅 Day 19 — Advanced Array Concepts (Java)
| No. | Topic / Program               | Core Concept / Logic                           |
| --: | ----------------------------- | ---------------------------------------------- |
|   1 | Default Values (char array)   | Default → `'\0'` (prints as blank / ASCII `0`) |
|   2 | Default Values (double array) | Default → `0.0`                                |
|   3 | Default Values (String array) | Default → `null`                               |
|   4 | Pass by Reference (Array)     | Changes inside method affect original array    |
|   5 | Method Modifying Array        | Direct index update → `arr[index] = value`     |
|   6 | Shallow Copy                  | Same reference → `int[] y = x`                 |
|   7 | Shallow Copy Effect           | Change in copy reflects in original array      |
|   8 | Deep Copy                     | New array created → `Arrays.copyOf()`          |
|   9 | Deep Copy Safety              | Changes do not affect original array           |
|  10 | Sorting Array (Ascending)     | Built-in sort → `Arrays.sort(arr)`             |
|  11 | Print Utility Method          | Reusable method for array traversal            |
|  12 | Index-Based Manipulation (HW) | Even index → `+10`, Odd index → `*2`           |
|  13 | Linear Search (HW)            | Traverse + compare each element                |
|  14 | Search Flag Logic             | Boolean flag to track element presence         |
|  15 | User Input in Search          | `Scanner.nextInt()` for dynamic search value   |

### 📅 Day 20 — Array Problem Solving (Java)
| No. | Topic / Program                  | Core Concept / Logic                              |
| --: | -------------------------------- | ------------------------------------------------- |
|   1 | Linear Search (Index Return)     | Single variable used as flag → `found = -1`       |
|   2 | Target Search Output             | Found → index, Not found → `-1`                   |
|   3 | Two Sum (Brute Force)            | Nested loops → check `arr[i] + arr[j] == target`  |
|   4 | Early Loop Break                 | Use flag + `break` to stop unnecessary iterations |
|   5 | Second Largest Element (2 Loops) | First loop → max, Second loop → next max          |
|   6 | Ignore Duplicate Max             | Condition → `arr[i] != max`                       |
|   7 | Alternative Approach (Commented) | Sorting + reverse traversal logic                 |
|   8 | For-Each Loop                    | Value-based traversal → `for (int ele : arr)`     |
|   9 | Reverse Array (New Copy)         | New array + reverse index mapping                 |
|  10 | Reverse Index Formula            | `j = (length - 1) - i`                            |
|  11 | Utility Print Method             | Reusable method for array output                  |
|  12 | Interview-Oriented Problems      | Search, Two Sum, Second Largest, Reverse          |

### 📅 Day 21 — Array Reverse & Rotation
| No. | Topic / Program         | Core Concept / Logic            |
| --: | ----------------------- | ------------------------------- |
|   1 | Reverse Array           | Two-pointer swap → `i++`, `j--` |
|   2 | In-Place Operation      | No extra space (O(1))           |
|   3 | Helper Reverse Method   | Reverse subarray using indices  |
|   4 | Array Rotation (Left)   | Reversal algorithm approach     |
|   5 | Modulo Optimization     | Handle large `d` → `d % n`      |
|   6 | Time & Space Complexity | O(n) time, O(1) space           |

### 📅 Day 22 — Weekly Revision (Arrays)
| No. | Topic / Program        | Core Concept / Logic                 |
| --: | ---------------------- | ------------------------------------ |
|   1 | Reverse Array          | Two-pointer swap approach            |
|   2 | Rotate Array           | Reversal algorithm + `d % n`         |
|   3 | Linear Search          | One variable as index/flag           |
|   4 | Two Sum (Brute Force)  | Nested loops + early break           |
|   5 | Second Largest Element | Ignore max while comparing           |
|   6 | For-Each Loop          | Value-based traversal                |
|   7 | Reverse Copy of Array  | New array with reverse index mapping |

### 📅 Day 23 — Array Math & Counting Problems

| No. | Topic / Program          | Core Concept / Logic                 |
| --: | ------------------------ | ------------------------------------ |
|   1 | Missing Number in Array  | Sum formula → `n*(n+1)/2`             |
|   2 | Array Sum Calculation    | Accumulator logic                    |
|   3 | Difference Technique     | `totalSum - arraySum`                |
|   4 | Count Zeros              | Frequency counting                   |
|   5 | Segregate 0s and 1s      | Fill array using count               |
|   6 | In-Place Update          | No extra array used                  |
|   7 | Time Complexity          | O(n)                                 |

### 📅 Day 24 — Two Pointer & Pattern Problems

| No. | Topic / Program              | Core Concept / Logic              |
| --: | ---------------------------- | --------------------------------- |
|   1 | Segregate 0s & 1s (1-Pass)   | Two-pointer swap approach         |
|   2 | In-Place Optimization        | No extra space used               |
|   3 | Pointer Movement Control     | Conditional `i++` and `j--`       |
|   4 | Wave Array                   | Swap adjacent elements            |
|   5 | Step-wise Traversal          | Loop increment by `i += 2`        |
|   6 | Time Complexity              | O(n)                              |
|   7 | Space Complexity             | O(1)                              |

### 📅 Day 25 — ArrayList & Carry Problem

| No. | Topic / Program        | Core Concept / Logic          |
| --: | ---------------------- | ----------------------------- |
|   1 | ArrayList Basics       | Dynamic array operations      |
|   2 | Add / Get / Set / Remove | Built-in methods usage      |
|   3 | Reverse List           | Built-in & two-pointer method |
|   4 | Add One Problem        | Carry propagation logic       |
|   5 | Edge Case Handling     | Extra digit if carry remains  |

### 📅 Day 26 — Merge Two Sorted Arrays

| No. | Topic / Program            | Core Concept / Logic          |
| --: | -------------------------- | ----------------------------- |
|   1 | Merge Two Sorted Arrays    | Compare & insert in order     |
|   2 | Three Pointer Technique    | `i`, `j`, `k` movement        |
|   3 | Remaining Elements Handling| Copy leftover elements        |
|   4 | Result Array Creation      | Size = n + m                  |
|   5 | Merge Sort Foundation      | Core merging step             |

### 📅 Day 27 — Array Revision & Carry Problems

| No. | Topic / Program        | Core Concept / Logic        |
| --: | ---------------------- | --------------------------- |
|   1 | Add One Problem        | Carry propagation logic     |
|   2 | Reverse Result         | `Collections.reverse()`     |
|   3 | Add Two Arrays         | Digit-wise addition         |
|   4 | Unequal Length Handling| Process remaining elements  |
|   5 | Final Carry Check      | Insert extra digit if needed|

### 📅 Day 28 — Merge & Duplicate Detection

| No. | Topic / Program              | Core Concept / Logic          |
| --: | ---------------------------- | ----------------------------- |
|   1 | Reverse Merge of Arrays      | Backward 3-pointer approach   |
|   2 | Time Complexity Analysis     | O(n + m)                      |
|   3 | Duplicate (Brute Force)      | Nested loops O(n²)            |
|   4 | Duplicate (Marking Array)    | Boolean tracking O(n)         |
|   5 | Duplicate (Sum Formula)      | Mathematical difference       |

### 📅 Day 29 — Weekly Revision (9 Feb – 14 Feb)

| No. | Topic / Program              | Core Concept / Logic          |
| --: | ---------------------------- | ----------------------------- |
|   1 | Missing Number               | Sum formula method            |
|   2 | Segregate 0s & 1s            | Two-pointer swapping          |
|   3 | Wave Array                   | Adjacent element swapping     |
|   4 | Add One to Array             | Carry handling logic          |
|   5 | Merge Sorted Arrays          | Backward 3-pointer approach   |

---

## 🧠 Rules I Follow (Discipline Mode)
- ✅ Practice daily (no zero day)
- ✅ Upload code in day-wise folders only
- ✅ Keep solutions clean & readable
- ✅ Focus on solving first, optimizing later

---

## 🚀 Why I’m doing this
Because I want:
- Better logic building
- Faster debugging
- Clean code habits
- Strong interview preparation
- Confidence in coding

**Consistency > Motivation**

---

## 🛠️ Tech Used
- Java
- DSA concepts (arrays, strings, recursion, sorting, searching, stacks, queues, linked list, trees, graphs etc.)

---

## ✅ Start Date
📅 18 January 2026

---

## 🏁 End Goal
By end of 2026:
- Strong DSA foundation
- High problem-solving speed
- No regret, only results

---

## ⭐ Quote
> “No one is coming. Work harder.”  
> — David Goggins
