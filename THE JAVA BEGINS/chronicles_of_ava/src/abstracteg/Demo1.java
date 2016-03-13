package abstracteg;

abstract public class Demo1 {
  abstract void test();
  abstract void test(int arg);
}

abstract class Sample1 extends Demo1{
	void test(){
		System.out.println("test() defined in Sample1 class");
	}
}
class Run1 extends Sample1{
	void test(int arg){
		System.out.println("test(int) defined in Run1 class");
	}
}

