// Sum of first n numbers

public static void main(String[] args) {
	   int sum=0;
	    System.out.println(func(sum,5));
	}
	static int func(int sum,int n){
	    if(n==0)return sum; 
	    sum+=n;
	    return func(sum,n-1);
	}

// Factorial of n numbers

class Solution {
    static int factorial(int n) {
        // code here
        if(n==1)return 1;
        return n*factorial(n-1);
    }
}

// Reverse an Array

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        func(0,arr.length-1,arr);
    }
    void func(int i,int n,int arr[]){
        if(i>=n)return;
        int temp=arr[i];
        arr[i]=arr[n];
        arr[n]=temp;
        func(i+1,n-1,arr);
    }
}
