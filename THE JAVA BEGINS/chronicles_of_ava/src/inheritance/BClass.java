package inheritance;

public class BClass extends CClass implements AClass {

	@Override
	public void abstartMethod() {
		// TODO Auto-generated method stub

	}

	public BClass() {
		int j = x;
	}

	public static void main(String[] args) {
		System.out.println(x);
		BClass bClass = new BClass();
		bClass.overRideMethod();

	}

	protected void overRideMethod() {
		System.out.println(protectedIntNon);
		System.out.println(defaultIntNon);
		System.out.println(publicIntNon);
		System.out.println(protectedInt);
		System.out.println(defaultInt);
		System.out.println(publicInt);

	}

	private void getMethods() {
		// System.out.println(privateIntNon);

	}

}
