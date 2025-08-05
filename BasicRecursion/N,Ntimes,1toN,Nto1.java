// print n, n number of times:

public static void main(String[] args) {
	    func(1,5);
	}
	static void func(int i,int n){
	    if(i>n)return; 
	    System.out.print(n+" ");
	    func(i+1,n);
	}

// Print name N times using recursion

public static void main(String[] args) {
	    func(5,"name");
	}
	static void func(int i,String n){
	    if(i==0)return; 
	    System.out.print(n+" ");
	    func(i-1,n);
	}

// Print 1 to N using recursion

public static void main(String[] args) {
	    func(1,5);
	}
	static void func(int i,int n){
	    if(i>n)return; 
	    System.out.print(i+" ");
	    func(i+1,n);
	}

// Print N to 1 using recursion

public static void main(String[] args) {
	    func(5);
	}
	static void func(int n){
	    if(n==0)return; 
	    System.out.print(n+" ");
	    func(n-1);
	}

