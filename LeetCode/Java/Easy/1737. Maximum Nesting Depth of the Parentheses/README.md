# 📝 1737. Maximum Nesting Depth of the Parentheses (LeetCode)

🔗 [Problem Link](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/)

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
String, Stack, Bracket Sequences

### 🚀 Performance
- **Runtime:** 0 ms
- **Memory:** 42.4 MB

---

### 📜 Problem Description

Given a  **valid parentheses string**   `s` , return the  **nesting depth**  of **  `s` . The nesting depth is the  **maximum**  number of nested parentheses.

**Example 1:**

**Input:**  s = "(1+(2*3)+((8)/4))+1"

**Output:**  3

**Explanation:**

Digit 8 is inside of 3 nested parentheses in the string.

**Example 2:**

**Input:**  s = "(1)+((2))+(((3)))"

**Output:**  3

**Explanation:**

Digit 3 is inside of 3 nested parentheses in the string.

**Example 3:**

**Input:**  s = "()(())((()()))"

**Output:**  3

**Constraints:**

	
- `1 <= s.length <= 100`
	
- `s`  consists of digits  `0-9`  and characters  `'+'` ,  `'-'` ,  `'*'` ,  `'/'` ,  `'('` , and  `')'` .
	
- It is guaranteed that parentheses expression  `s`  is a VPS.

---
## Notes:
1. Use charAt function if you want to access each element in a string without converting the string into an  array( reduces space complexity).
2. Each opening bracket should be incremented with 1 and closing bracket with -1.
3. Return the maximum number of of opening brackets.(since that would be the maximum depth)
