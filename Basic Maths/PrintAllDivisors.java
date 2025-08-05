Input : n = 20
Output: 1 2 4 5 10 20
Explanation: 20 is completely divisible by 1, 2, 4, 5, 10 and 20.

class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer> l=new ArrayList();
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                l.add(i);
            
            if(i!=n/i){
                l.add(n/i);
            }
            }
        }
        Collections.sort(l);
        for(Integer i: l){
            System.out.print(i+" ");
        }
    }
}
