Input: n = 456
Output: 3
Explanation: 456 has 3 digits

public int countDigits(int n) {
        int i=0;
        while(n>0){
            i++;
            n/=10;
        }
        return i;
}

OR

String s=String.valueOf(n);
        return s.length();
