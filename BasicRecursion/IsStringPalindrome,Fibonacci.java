//Palindrome

class Solution {
    boolean isPalindrome(String s) {
        // code here
        //your code goes here
        int n=s.length()-1;
        return func(0,n,s);
    }
    boolean func(int i,int n,String s){
        if(i>=n)return true;
        if(s.charAt(i)!=s.charAt(n))return false;
        return func(i+1,n-1,s);
    }
}

//Fibonacci Number

class Solution {
    public int fib(int n) {
        if(n==0)return 0;
        else if(n==1)return 1;
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
