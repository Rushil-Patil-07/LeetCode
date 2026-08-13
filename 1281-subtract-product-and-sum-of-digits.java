class Solution {
    public int subtractProductAndSum(int n) {
        int rem_mul = 1, rem_add = 0, result;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            rem_mul = rem * rem_mul;
            rem_add = rem_add + rem;
        }
        result = rem_mul - rem_add;
        return result;
    }
}