# 📝 2844. Sum of Squares of Special Elements  (LeetCode)

🔗 [Problem Link](https://leetcode.com/problems/sum-of-squares-of-special-elements/)

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
Array, Enumeration

### 🚀 Performance
- **Runtime:** 1 ms
- **Memory:** 46.5 MB

---

### 📜 Problem Description

You are given a  **1-indexed**  integer array  `nums`  of length  `n` .

An element  `nums[i]`  of  `nums`  is called  **special**  if  `i`  divides  `n` , i.e.  `n % i == 0` .

Return  *the  **sum of the squares**  of all  **special**  elements of*  `nums` .

**Example 1:**

```
Input: nums = [1,2,3,4]
Output: 21
Explanation: There are exactly 3 special elements in nums: nums[1] since 1 divides 4, nums[2] since 2 divides 4, and nums[4] since 4 divides 4. 
Hence, the sum of the squares of all special elements of nums is nums[1] * nums[1] + nums[2] * nums[2] + nums[4] * nums[4] = 1 * 1 + 2 * 2 + 4 * 4 = 21.  

```

**Example 2:**

```
Input: nums = [2,7,1,19,18,3]
Output: 63
Explanation: There are exactly 4 special elements in nums: nums[1] since 1 divides 6, nums[2] since 2 divides 6, nums[3] since 3 divides 6, and nums[6] since 6 divides 6. 
Hence, the sum of the squares of all special elements of nums is nums[1] * nums[1] + nums[2] * nums[2] + nums[3] * nums[3] + nums[6] * nums[6] = 2 * 2 + 7 * 7 + 1 * 1 + 3 * 3 = 63. 

```

**Constraints:**

	
- `1 <= nums.length == n <= 50`
	
- `1 <= nums[i] <= 50`

---
### Notes:

1. Define a variable to store the final result,that is to be returned at the end of the program.(here I have used result)
2. Initialize a loop to traverse through the array.(There are two ways you can initialize the loop:1. Start the loop from 0(ie. i=0),then put the condition as i<nums.length and i++. 2.Start the loop from 1(ie.i=1),put condtion as i<= nums.length,and i++ )
3. Inside the loop you set the condition for if.
   - If the loop is initialized using the first method,then make sure that the condition is written as nums.length % (i+1) == 0,this avoids the error of division by zero,when i is at index 0.
   - if its the second method,the condition would be nums.length % i == 0.
4. If the if condition becomes true then we run the block inside if:
    - If loop initiaized using first method : result += nums[i]*nums[i].
    - if initialized using second method : result += nums[i-1]*nums[i-1].(to avoid index out of bound error)
5. Return result.

...
