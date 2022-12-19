class Solution {
    public int subtractProductAndSum(int n) {
        return (product(n)-curSum(n));
    }
    int product(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*product(n/10);
    }
    int curSum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10)+curSum(n/10);
    }
    
}