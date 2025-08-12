class A{
    int a;
    int b;
	A()
	{
		a=1;
		b=2;
		System.out.println("default constructor");
	}
	
    A(int a, int b)
    {
        this.a = a;
        this.b = b;
		System.out.println("paarmeterised constructor");
    }
	
    A(A obj2)
    {
        this.a = obj2.a;
        this.b = obj2.b;
		System.out.println("copy constructor");
    }
}

class D {
    public static void main(String[] args)
    {
        A obj0 = new A();
        System.out.println(obj0.a + " " + obj0.b);
		
		A obj1 = new A(3, 4);
        System.out.println(obj1.a + " " + obj1.b);
		
        A obj2 = new A(obj1);
        System.out.println(obj2.a + " " + obj2.b);
    }
}