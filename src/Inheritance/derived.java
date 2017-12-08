package Inheritance;

public class derived implements test1 ,test2 {
	
	public void testprint(){
		System.out.println(test1.i);
		System.out.println(test2.i);
	}

	@Override
	public void myTestMtd() {
		// TODO Auto-generated method stub
		
	}

	
}
