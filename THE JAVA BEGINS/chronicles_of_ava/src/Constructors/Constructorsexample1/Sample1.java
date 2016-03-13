package Constructors.Constructorsexample1;
class Sample1{
	Sample1(Demo1 arg1){
		System.out.println("x value:"+arg1.x);
		System.out.println("y value:"+arg1.y);
	    arg1.disp();
	    arg1.count++;
	}
	    void test(Demo1 arg1){
		arg1.x=40;
		arg1.y=20;
		System.out.println("x value:"+arg1.x);
		System.out.println("y value:"+arg1.y);
		arg1.disp();
	}
}