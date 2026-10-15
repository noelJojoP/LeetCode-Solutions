# 📝 11. Container With Most Water (LeetCode)

🔗 [Problem Link](https://leetcode.com/problems/container-with-most-water/)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
Array, Two Pointers, Greedy

### 🚀 Performance
- **Runtime:** 5 ms
- **Memory:** 77.5 MB

---

### 📜 Problem Description

You are given an integer array  `height`  of length  `n` . There are  `n`  vertical lines drawn such that the two endpoints of the  `ith`  line are  `(i, 0)`  and  `(i, height[i])` .

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return  *the maximum amount of water a container can store* .

**Notice**  that you may not slant the container.

**Example 1:**

 ![image](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg) 

```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

```

**Example 2:**

```
Input: height = [1,1]
Output: 1

```

**Constraints:**

	
- `n == height.length`
	
- `2 <= n <= 105`
	
- `0 <= height[i] <= 104`
---
### Notes:
1. We use the two pointer method,where one pointer starts from the left most element and the other from the right most element.
2. We run a while loop, which will ensure that left index will be less than right index.
3.for the length,we will take minimum of two lines(ie value at left and right at that current index) being compared.And for the width,we will subtract the right index position with the left index position( since the right index value will aways be greater than left index and index position because width is being considered according to index ),then area = length*width.
3. We update area,if we get a higher area value than the current area.
4. Condition for incrementing left or decrementing right.

IMPORTANT:
- Once you check that maximum width, you have to move inward to see if a better container exists. Every time you step inward, your width is guaranteed to decrease by 1.Since the width is shrinking, the only way a new container can beat your current maximum area is if it gets a much taller height to make up for the lost width.
- If you move the shorter line inward, you are abandoning the bottleneck! You might find a much taller line next, which could give you a massive height increase that easily overrides the small loss in width.
- The water height will always be determined by the minimum (shorter) line between the two lines you are comparing. If you tried to fill the container any higher than the shorter line, the water would just spill out over the side.
- Since the shorter line is the bottleneck limiting the height of the water, you always want to abandon the shorter line and move it inward in hopes of finding a taller one.
---
