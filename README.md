# LeetCode Solutions

My Java solutions to LeetCode problems, solved as part of my ongoing DSA practice. Each solution follows LeetCode's required method signature and is organized by problem number for easy reference. Where relevant, notes on approach and time/space complexity are included.

## Structure
- Each solution is a standalone file: `NNNN-Problem-Name.java`
- Solutions are written to be submission-ready for LeetCode's judge
- Progress is tracked in the table below

## Progress
| # | Title | Difficulty | Solution | Notes |
|---|-------|-----------|----------|-------|
| 1 | Two Sum | Easy | [0001-Two-Sum.java](./0001-Two-Sum.java) | Brute-force nested loop checks all pairs. O(n²) time, O(1) space. Faster O(n) approach possible using a HashMap. |
| 7 | Reverse Integer | Medium | [0007-Reverse-Integer.java](./0007-Reverse-Integer.java) | Extracts digits and rebuilds in reverse using a `long` to safely detect 32-bit overflow before casting back to `int`. Returns 0 on overflow. O(log n) time, O(1) space. |
| 9 | Palindrome Number | Easy | [0009-Palindrome-Number.java](./0009-Palindrome-Number.java) | Reverses the number by extracting digits and compares to original. Negative numbers return false. O(log n) time, O(1) space. |
| 151 | Reverse Words in a String | Medium | [0151-Reverse-Words-in-a-String.java](./0151-Reverse-Words-in-a-String.java) | Trims leading/trailing spaces, splits on `\s+` (one or more whitespace) to collapse internal multiple spaces, then reverses the word array with a two-pointer swap and rejoins with `String.join`. O(n) time, O(n) space. |
| 167 | Two Sum II - Input Array Is Sorted | Medium | [0167-Two-Sum-II.java](./0167-Two-Sum-II.java) | Two-pointer approach: pointers start at both ends and move inward based on comparing the running sum to target. Returns 1-indexed positions. O(n) time, O(1) space. |
| 258 | Add Digits | Easy | [0258-add-digits.java](./0258-add-digits.java) | Repeatedly sum digits until single digit remains. O(log n) time, O(1) space. Bonus: digital root formula `1 + (num-1) % 9` for O(1). |
| 709 | To Lower Case | Easy | [0709-to-lower-case.java](./0709-to-lower-case.java) | Uses built-in `toLowerCase()`. O(n) time, O(n) space. |
| 771 | Jewels and Stones | Easy | [0771-Jewals-and-Stones.java](./0771-Jewals-and-Stones.java) | Nested loop checks each jewel character against each stone character. O(n×m) time, O(1) space. Faster O(n+m) possible using a HashSet. |
| 896 | Monotonic Array | Easy | [0896-Monotonic-Array.java](./0896-Monotonic-Array.java) | Single pass tracking two flags (`isIncreasing`, `isDecreasing`); returns true if either stays true through the whole array. O(n) time, O(1) space. |
| 1281 | Subtract the Product and Sum of Digits of an Integer | Easy | [1281-subtract-product-and-sum-of-digits.java](./1281-subtract-product-and-sum-of-digits.java) | Extracts digits one at a time, tracking running product and sum, then returns the difference. O(log n) time, O(1) space. |
| 1431 | Kids With the Greatest Number of Candies | Easy | [1431-Kids-with-the-greatest-candies.java](./1431-Kids-with-the-greatest-candies.java) | Finds the max candy count, then checks whether each kid's candies plus extra candies would reach it. O(n) time, O(n) space (output list). |
| 1662 | Check If Two String Arrays are Equivalent | Easy | [1662-Check-if-Two-String-Arrays-are-Equavalent.java](./1662-Check-if-Two-String-Arrays-are-Equavalent.java) | Concatenates each array into a single string using string concatenation, then compares with `.equals()`. O(n) time, O(n) space. |
| 1816 | Truncate Sentence | Easy | [1816-Truncate-Sentence.java](./1816-Truncate-Sentence.java) | Splits sentence by spaces, rebuilds first `k` words with a `StringBuilder`, then trims trailing whitespace. O(n) time, O(n) space. |
| 2114 | Maximum Number of Words Found in Sentences | Easy | [2114-Maximum-Number-of-Words-Found-in-Sentences.java](./2114-Maximum-Number-of-Words-Found-in-Sentences.java) | Split each sentence by spaces, track max word count. O(n) time, O(n) space (O(1) extra space possible via manual space-counting). |
| 2235 | Add Two Integers | Easy | [2235-Add-Two-Integers.java](./2235-Add-Two-Integers.java) | Simple sum of the two inputs. O(1) time, O(1) space. |
| 2427 | Number of Common Factors | Easy | [2427-Number-Of-Common-Factors.java](./2427-Number-Of-Common-Factors.java) | Loops from 1 to `min(a, b)` inclusive, counting values that divide both. O(min(a,b)) time, O(1) space. |
| 2469 | Convert the Temperature | Easy | [2469-Convert-the-Tempreture.java](./2469-Convert-the-Tempreture.java) | Applies Kelvin and Fahrenheit conversion formulas, returns both in an array. O(1) time, O(1) space. |
| 2710 | Remove Trailing Zeros From a String | Easy | [2710-Remove-trailing-zeros-from-a-string.java](./2710-Remove-trailing-zeros-from-a-string.java) | Scans from the end of the string, decrementing an index while trailing `'0'` characters are found, then returns the substring up to that point. Avoids parsing to a numeric type to prevent overflow on large inputs. O(n) time, O(1) extra space. |
| 3110 | Score of a String | Easy | [3110-Score-of-a-String.java](./3110-Score-of-a-String.java) | Iterates adjacent character pairs and sums the absolute difference of their ASCII values. O(n) time, O(1) space. |
| 3340 | Check Balanced String | Easy | [3340-Check-Balanced-String.java](./3340-Check-Balanced-String.java) | Sums digits at even indices and digits at odd indices separately, then checks if the two sums are equal. O(n) time, O(1) space. |
| 3492 | Maximum Containers on a Ship | Easy | [3492-Maximum-Containers-on-a-Ship.java](./3492-Maximum-Containers-on-a-Ship.java) | Answer is bounded by the smaller of total deck slots (`n²`) and weight capacity (`maxWeight / w`). Uses `long` arithmetic to avoid overflow on `n * n`. O(1) time, O(1) space. |
| 3925 | Concatenate Array With Reverse | Easy | [3925-Concatenate-Array-With-Reverse.java](./3925-Concatenate-Array-With-Reverse.java) | Builds a new array of length 2n: copies `nums` into the first half, and fills the second half with `nums` in reverse order using `ans[i+n] = nums[n-i-1]`. O(n) time, O(n) space. |

## Stats
- **Total solved:** 22
- **Easy:** 19 | **Medium:** 3 | **Hard:** 0

## License
This repository is for personal practice and reference. Feel free to browse for inspiration, but try solving problems yourself first!
