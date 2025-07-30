class Solution {
    public int reverse(int x) {
        int n=x;
        if(n<0){
            n*=-1;
            return func(n)*-1;
        }
        else{
            return func(n);
        }
    }
    int func(int n){
        int revNo=0;
        while(n>0){
            int ld=n%10;
            if(revNo>Integer.MAX_VALUE/10 || revNo==Integer.MAX_VALUE/10 && ld>7)return 0;
            if(revNo<Integer.MIN_VALUE/10 || revNo==Integer.MIN_VALUE/10 && ld<-8)return 0;
            revNo=(revNo*10)+ld;
            n=n/10;
            }
            return revNo;
    }
}

////If cases are for even if n is -2^31 to 2^31 but reversed no. is getting beyond that we should return 0
///example: 1534236469 getting O/P as 1056389759 should return 0
