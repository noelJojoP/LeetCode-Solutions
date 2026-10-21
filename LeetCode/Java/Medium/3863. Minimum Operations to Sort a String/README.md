# 📝 3863. Minimum Operations to Sort a String (LeetCode)

🔗 [Problem Link](https://leetcode.com/problems/minimum-operations-to-sort-a-string/?envType=daily-question&envId=2026-10-21)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
String

### 🚀 Performance
- **Runtime:** N/A
- **Memory:** N/A

---

### 📜 Problem Description

You are given a string  `s`  consisting of lowercase English letters.

In one operation, you can select any  **substring**  of  `s`  that is  **not**  the entire string and  **sort**  it in  **non-descending alphabetical**  order.

Return the  **minimum**  number of operations required to make  `s`  sorted in  **non-descending**  order. If it is not possible, return -1.

**Example 1:**

**Input:**  s = "dog"

**Output:**  1

**Explanation:** ​​​​​​​

	
- Sort substring  `"og"`  to  `"go"` .
	
- Now,  `s = "dgo"` , which is sorted in ascending order. Thus, the answer is 1.

**Example 2:**

**Input:**  s = "card"

**Output:**  2

**Explanation:**

	
- Sort substring  `"car"`  to  `"acr"` , so  `s = "acrd"` .
	
- Sort substring  `"rd"`  to  `"dr"` , making  `s = "acdr"` , which is sorted in ascending order. Thus, the answer is 2.

**Example 3:**

**Input:**  s = "gf"

**Output:**  -1

**Explanation:**

	
- It is impossible to sort  `s`  under the given constraints. Thus, the answer is -1.

**Constraints:**

	
- `1 <= s.length <= 105`
	
- `s`  consists of only lowercase English letters.
---
### 💡 Core Takeaway (The Ultimate Trick)
- When a problem asks for the minimum number of operations to sort something—and the allowed operation lets you sort almost the entire collection at once (N-1 elements)—do not simulate the sorting process.
- Instead, recognize that the maximum answer is incredibly small (bounded between 0 and 3). The problem isn't about sorting; it's a boundary evaluation puzzle focused on where the absolute minimum (minChar) and absolute maximum (maxChar) elements are located.
---
### 🔍 Case Breakdown Matrix
<img width="669" height="354" alt="image" src="https://github.com/user-attachments/assets/477479e8-6e79-4b93-be9a-f9430665a467" />

---
### ⚠️ Hidden Traps & Edge Cases Discovered
1. The Length 2 Trap: If n == 2 and the string is unsorted (like "gf"), you can only select a substring of length 1. Sorting length 1 does nothing, meaning it is impossible to sort. Return -1.
2. The Duplicate Character Trap: A string like "jgg" has maxChar at index 0 and minChar at index 2. This looks like a 3-operation deadlock at first glance. However, because there is a duplicate minChar ('g') sitting safely at index 1, it allows us to break the deadlock and solve it in just 2 operations.
