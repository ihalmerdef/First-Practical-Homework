class B extends A 
{ 
	public void sum(int x, int y) 
	{ 
		super.add(x, y); 
	} 


	public static void main(String []args) 
	{ 
		B b1 = new B(); 
		b1.sum(5, 6); 
	} 
} 
