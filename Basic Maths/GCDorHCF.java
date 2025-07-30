ITERATIVE

public static int gcd(int a, int b) {
        // code here
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        return (a==0)?b:a;
}

OR

RECURSION
  
public static int gcd(int a, int b) {
        // code here
        if(a==0)return b;
        if(b==0)return a;
  return (a>b)gcd(a%b,b):gcd(a,b%a);
}

OR if TC doesnt matter

class Solution {
    public static int gcd(int a, int b) {
        // code here
        int n=(a<=b)?a:b;
        while(n>=1){
            if((a%n==0) && (b%n==0)){
                return n;
            }
            n--;
        }
        return 1;
    }
}
