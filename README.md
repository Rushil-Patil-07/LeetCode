# LeetCode Solutions
My Java solutions to LeetCode problems, solved as part of my ongoing DSA practice. Each solution follows LeetCode's required method signature and is organized by problem number for easy reference. Where relevant, notes on approach and time/space complexity are included.
## Structure
- Each problem has its own folder: `NNNN-problem-name/`
- Solutions are written to be submission-ready for LeetCode's judge
- Progress is tracked in the table below
## Progress
| # | Title | Difficulty | Solution | Notes |
|---|-------|-----------|----------|-------|
| 1 | Two Sum | Easy | [Solution.java](./0001-two-sum/Solution.java) | Brute-force nested loop checks all pairs. O(n²) time, O(1) space. Faster O(n) approach possible using a HashMap. |
| 9 | Palindrome Number | Easy | [Solution.java](./0009-palindrome-number/Solution.java) | Reverses the number by extracting digits and compares to original. Negative numbers return false. O(log n) time, O(1) space. |
| 258 | Add Digits | Easy | [Solution.java](./0258-add-digits/Solution.java) | Repeatedly sum digits until single digit remains. O(log n) time, O(1) space. Bonus: digital root formula `1 + (num-1) % 9` for O(1). |
| 709 | To Lower Case | Easy | [Solution.java](./0709-to-lower-case/Solution.java) | Uses built-in `toLowerCase()`. O(n) time, O(n) space. |
| 2114 | Maximum Number of Words Found in Sentences | Easy | [Solution.java](./2114-maximum-number-of-words-found-in-sentences/Solution.java) | Split each sentence by spaces, track max word count. O(n) time, O(n) space (O(1) extra space possible via manual space-counting). |
## Stats
- **Total solved:** 5
- **Easy:** 5 | **Medium:** 0 | **Hard:** 0
## License
This repository is for personal practice and reference. Feel free to browse for inspiration, but try solving problems yourself first!
