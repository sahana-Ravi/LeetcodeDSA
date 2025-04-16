class Solution {
    public int[] plusOne(int[] digits) {
       for (int i = digits.length - 1; i >= 0; i--) {
        digits[i] += 1;

        if (digits[i] < 10) {
            return digits; // No carry, return the result
        }

        digits[i] = 0; // Carry over, set current digit to 0
    }

    // If we're here, it means there was a carry all the way (e.g., [9,9,9] -> [1,0,0,0])
    int[] res = new int[digits.length + 1];
    res[0] = 1;
    return res;
}
}