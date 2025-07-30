Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

public boolean isPalindrome(int x) {
        int n=x;
        int revNo=0;
        if(x<0)return false;
        else if(x==0){return true;}
        else{
            while(x>0){
                int ld=x%10;
                revNo=(revNo*10)+ld;
                x/=10;
            }
            return n==revNo;
        }
}

OR
  
        if(x<0)return false;
        String s=Integer.toString(x);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-i-1)){
                continue;
            }else {
                return false;
            }
        }
        return true;
