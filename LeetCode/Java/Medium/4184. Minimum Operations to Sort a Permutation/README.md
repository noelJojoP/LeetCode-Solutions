# 📝 3942. Minimum Operations to Sort a Permutation (LeetCode)

🔗 [Problem Link](https://leetcode.com/problems/minimum-operations-to-sort-a-permutation/)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
Array

### 🚀 Performance
- **Runtime:** 10 ms
- **Memory:** 94.5 MB

---

### 📜 Problem Description

You are given an integer array  `nums`  of length  `n` , where  `nums`  is a permutation of the integers from 0 to  `n - 1` .

You may perform  **only**  the following operations:

	
- **Reverse**  the entire array.
	
- **Rotate Left by One** : Move the first element to the end of the array, and rest elements to left by one position.

Return an integer denoting the  **minimum**  number of operations required to sort the array in  **increasing**  order. If it is  **not possible**  to sort the array using only the given operations, return -1.

**Example 1:**

**Input:**  nums = [0,2,1]

**Output:**  2

**Explanation:**

	
- Rotate Left by one:  `[2, 1, 0]`
	
- Reverse the array:  `[0, 1, 2]`

The array becomes sorted in 2 operations, which is minimal

**Example 2:**

**Input:**  nums = [1,0,2]

**Output:**  2

**Explanation:**

	
- Reverse the array:  `[2, 0, 1]`
	
- Rotate Left by one:  `[0, 1, 2]`

The array becomes sorted in 2 operations, which is minimal.

**Example 3:**

**Input:**  nums = [2,0,1,3]

**Output:**  -1

**Explanation:**

It is impossible to reach  `[2, 0, 1, 3]` . Thus, the answer is -1.

**Constraints:**

	
- `1 <= n == nums.length <= 105`
	
- `0 <= nums[i] <= n - 1`
	
- `nums`  is a permutation of integers from 0 to  `n - 1` .
---
### 💡 Core Takeaway (The Cyclic Lock Trick)
When an array can only be manipulated via full array reversals and single left-rotations, the relative ordering of the elements becomes "cyclically locked".
You cannot randomly swap individual elements. Therefore, the array is only sortable if it already exists in a continuous circular sequence from the start. Instead of writing a complex simulation, classify the array as one of two hidden circular states:
1. A Climbing Circle: The numbers continuously wrap around in increasing order (e.g., [2, 3, 4, 0, 1]).
2. A Sliding Circle: The numbers continuously wrap around in decreasing order (e.g., [2, 1, 0, 4, 3]).
---
### 🔍 Pattern Verification (The Modulo Check)
Because the input array is a strict permutation from 0 to n - 1, we can flawlessly check cyclic continuity across the array boundaries using the modulo operator (% n):
 - Climbing Formula: nums[(i + 1) % n] == (nums[i] + 1) % n
 - Sliding Formula: nums[(i + 1) % n] == (nums[i] - 1 + n) % n
If a sequence breaks its circular continuity more than once, it is physically impossible to ever sort the array using the allowed moves. Instantly return -1.
---
### 📐 Calibrated Cost Optimization Formulas
<img width="684" height="341" alt="image" src="https://github.com/user-attachments/assets/bf08c3ea-5a5c-4d87-89d1-535c2567df90" />

