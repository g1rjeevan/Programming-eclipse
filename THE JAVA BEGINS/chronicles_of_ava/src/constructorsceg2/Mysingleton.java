package constructorsceg2;


public class Mysingleton {
 
    private static Mysingleton myObj;
     
    static{
        myObj = new Mysingleton();
    }
     
    private Mysingleton(){
     
    }
     
    public static Mysingleton getInstance(){
        return myObj;
    }
     
    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }
     
    public static void main(String a[]){
        Mysingleton ms = getInstance();
        ms.testMe();
    }
}