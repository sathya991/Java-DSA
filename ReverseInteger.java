class Solution {
    public int reverse(int x) {
        int y = Math.abs(x);
        long returnVal = 0;
        while (y > 0) {
            int val = y % 10;
            y /= 10;
            returnVal = (returnVal * 10) + val;
        }
        if (x < 0) {
            returnVal *= (-1);
        }
        return (Integer.MAX_VALUE >= returnVal && Integer.MIN_VALUE <= returnVal) ? (int) returnVal : 0;
    }
}

/*
 * Basic - Make int to string and reverse it.
 * 
 * Optimal - First take the absolute value and loop till that becomes 0
 * use modulus to take the last value and add it to return result * 10
 * In the end check if original value was negative and multiply by -1 if
 * negative.
 * As the value may go beyond Int max while reversing take long data type and
 * check the value in the end.
 */