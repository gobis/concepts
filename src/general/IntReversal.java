package general;


public class IntReversal {

	
	
	public static void main(String []args){
		
		
		int k  = 63534;
		
		reverse(k);
		
		String input = String.valueOf(k);
		System.out.println("input is "+ input);
		StringBuilder sb = new StringBuilder();
		
		try{
		for(int i =input.length() -1 ; i>=0  ; i--){
			sb.append(input.charAt(i));
		}
		}catch(Exception e){
			
		}
		
		System.out.println("Result is "+Integer.parseInt(sb.toString()));
		
		
		
	
		
	}
	
	
	public static void reverse(int value){
		
		int finalVal = 0 ;
		int result = 0 ;
		while(value > 0){
			finalVal = value %10 ;
			value = value/10 ;
			
			result = result * 10 + finalVal;
			// System.out.println("Final val "+finalVal + "  val" + value + " Result " + result);
		}
		
		System.out.println("Result 2 is "+result);
		
		
	}
	
	
	
	
}
