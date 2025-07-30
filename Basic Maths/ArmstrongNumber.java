You are given a 3-digit number n, Find whether it is an Armstrong number or not.

An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. 

static boolean armstrongNumber(int n) {
        // code here
        int arm=0;
        int x=n;
        while(n>0){
            int i=n%10;
            n=n/10;
            arm+=Math.pow(i,3);
        }
        return x==arm;
    }
