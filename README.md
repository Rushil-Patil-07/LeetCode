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
| 4 | Median of Two Sorted Arrays | Hard | [0004-Median-of-Two-Sorted-Arrays.java](./0004-Median-of-Two-Sorted-Arrays.java) | Copies both arrays into one combined array, sorts it, then picks the middle element (odd length) or averages the two middle elements (even length). O((m+n) log(m+n)) time, O(m+n) space. Accepted, but the problem asks for O(log(m+n)); a binary search on the partition of the smaller array achieves O(log(min(m,n))) time and O(1) space. |
| 7 | Reverse Integer | Medium | [0007-Reverse-Integer.java](./0007-Reverse-Integer.java) | Extracts digits and rebuilds in reverse using a `long` to safely detect 32-bit overflow before casting back to `int`. Returns 0 on overflow. O(log n) time, O(1) space. |
| 9 | Palindrome Number | Easy | [0009-Palindrome-Number.java](./0009-Palindrome-Number.java) | Reverses the number by extracting digits and compares to original. Negative numbers return false. O(log n) time, O(1) space. |
| 26 | Remove Duplicates from Sorted Array | Easy | [0026-Remove-Duplicates-from-Sorted-Array.java](./0026-Remove-Duplicates-from-Sorted-Array.java) | Builds a list of unique values in a single pass, comparing each element to the next, then copies the unique values back into `nums` (only the first `k` elements need to be correct, per LeetCode's checker). O(n) time, O(n) extra space (ArrayList). A tighter O(1)-extra-space two-pointer approach is also possible. |
| 27 | Remove Element | Easy | [0027-Remove-Element.java](./0027-Remove-Element.java) | TBD |
| 66 | Plus One | Easy | [0066-Plus-One.java](./0066-Plus-One.java) | Adds one to the last digit and propagates the carry leftward through the array; if a carry remains after the leftmost digit, allocates a new array of size n+1 with a leading 1. O(n) time, O(n) space (output array). |
| 151 | Reverse Words in a String | Medium | [0151-Reverse-Words-in-a-Sring.java](./0151-Reverse-Words-in-a-Sring.java) | Trims leading/trailing spaces, splits on `\s+` (one or more whitespace) to collapse internal multiple spaces, then reverses the word array with a two-pointer swap and rejoins with `String.join`. O(n) time, O(n) space. |
| 167 | Two Sum II - Input Array Is Sorted | Medium | [0167-Two-Sum-II.java](./0167-Two-Sum-II.java) | Two-pointer approach: pointers start at both ends and move inward based on comparing the running sum to target. Returns 1-indexed positions. O(n) time, O(1) space. |
| 204 | Count Primes | Medium | [0204-Count-Primes.java](./0204-Count-Primes.java) | For each candidate `i` from 2 to n-1, tests divisibility by every `j` up to `√i`, breaking early on the first divisor found and incrementing a count when none divide evenly. O(n√n) time, O(1) extra space. Sieve of Eratosthenes (O(n log log n)) is faster for the largest constraints. |
| 217 | Contains Duplicate | Easy | [0217-Contains-Duplicate.java](./0217-Contains-Duplicate.java) | TBD |
| 258 | Add Digits | Easy | [0258-add-digits.java](./0258-add-digits.java) | Repeatedly sum digits until single digit remains. O(log n) time, O(1) space. Bonus: digital root formula `1 + (num-1) % 9` for O(1). |
| 283 | Move Zeroes | Easy | [0283-Move-Zeroes.java](./0283-Move-Zeroes.java) | Nested loop swaps each zero with the next non-zero element found ahead of it, preserving relative order of non-zero elements. O(n²) time, O(1) space. Faster O(n) approach possible using a single-pass two-pointer/insert-position technique. |
| 334 | Increasing Triplet Subsequence | Medium | [0334-Increasing-Triplet-Subsequence.java](./0334-Increasing-Triplet-Subsequence.java) | Tracks the smallest and second-smallest values seen so far in a single pass; returns true as soon as a value exceeds both. O(n) time, O(1) space. |
| 344 | Reverse String | Easy | [0344-Reverse-String.java](./0344-Reverse-String.java) | TBD |
| 412 | Fizz Buzz | Easy | [0412-Fizz-Buzz.java](./0412-Fizz-Buzz.java) | Iterates 1 to n, checking divisibility by 15, 3, and 5 in order to build the output list ("FizzBuzz", "Fizz", "Buzz", or the number as a string). O(n) time, O(n) space (output list). |
| 520 | Detect Capital | Easy | [0520-Detect-Capital.java](./0520-Detect-Capital.java) | TBD |
| 709 | To Lower Case | Easy | [0709-to-lower-case.java](./0709-to-lower-case.java) | Uses built-in `toLowerCase()`. O(n) time, O(n) space. |
| 771 | Jewels and Stones | Easy | [0771-Jewals-and-Stones.java](./0771-Jewals-and-Stones.java) | Nested loop checks each jewel character against each stone character. O(n×m) time, O(1) space. Faster O(n+m) possible using a HashSet. |
| 896 | Monotonic Array | Easy | [0896-Monotonic-Array.java](./0896-Monotonic-Array.java) | Single pass tracking two flags (`isIncreasing`, `isDecreasing`); returns true if either stays true through the whole array. O(n) time, O(1) space. |
| 1281 | Subtract the Product and Sum of Digits of an Integer | Easy | [1281-subtract-product-and-sum-of-digits.java](./1281-subtract-product-and-sum-of-digits.java) | Extracts digits one at a time, tracking running product and sum, then returns the difference. O(log n) time, O(1) space. |
| 1431 | Kids With the Greatest Number of Candies | Easy | [1431-Kids-with-the-greatest-candies.java](./1431-Kids-with-the-greatest-candies.java) | Finds the max candy count, then checks whether each kid's candies plus extra candies would reach it. O(n) time, O(n) space (output list). |
| 1470 | Shuffle the Array | Easy | [1470-Shufflr the Array.java](./1470-Shufflr%20the%20Array.java) | TBD |
| 1480 | Running Sum of 1d Array | Easy | [1480-Running-Sum-of-1d-Array.java](./1480-Running-Sum-of-1d-Array.java) | Builds a prefix-sum array by adding each element to the running total from the previous index. O(n) time, O(n) space. |
| 1662 | Check If Two String Arrays are Equivalent | Easy | [1662-Check-if-Two-String-Arrays-are-Equavalent.java](./1662-Check-if-Two-String-Arrays-are-Equavalent.java) | Concatenates each array into a single string using string concatenation, then compares with `.equals()`. O(n) time, O(n) space. |
| 1672 | Richest Customer Wealth | Easy | [1672-Richest-Customer-Wealth.java](./1672-Richest-Customer-Wealth.java) | TBD |
| 1678 | Goal Parser Interpretation | Easy | [1678-Goal-Parser-Interpretation.java](./1678-Goal-Parser-Interpretation.java) | TBD |
| 1769 | Minimum Number of Operations to Move All Balls to Each Box | Medium | [1769-Minimum-Number-of-Operations-to-Move-All-Balls-to-Each-Box.java](./1769-Minimum-Number-of-Operations-to-Move-All-Balls-to-Each-Box.java) | Brute force: for each destination box `i`, sums the absolute distance `|i-j|` to every box `j` containing a ball. O(n²) time, O(n) space (output array). An O(n) two-pass prefix/suffix approach is also possible. |
| 1816 | Truncate Sentence | Easy | [1816-Truncate-Sentence.java](./1816-Truncate-Sentence.java) | Splits sentence by
