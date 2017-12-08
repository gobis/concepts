package trycatch;

public class TestTryCatch {
	
	
	public int testMtd(){
		
		try{
			
			int k = 1/0;
			
		}catch(Exception e){
			System.err.println(e);
			return 23;
		}finally{
			return 45;
		}
	}



}
