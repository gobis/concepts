package general;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class EventMapper {

	private static final String FILENAME = "D:\\source.txt";
	private static final String FILENAME2 = "D:\\source2.txt";
	
	public static int count = 0 ;
	
	public static void main(String[] args) {
		readFile1();
	}

	
	private static void readFile1(){

		BufferedReader br = null;
		FileReader fr = null;

		BufferedReader br2 = null;
		FileReader fr2 = null;
		
		try {

			// br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			/*fr2 = new FileReader(FILENAME2);
			br2 = new BufferedReader(fr2);*/

			String sCurrentLine;
		 // 	String sCurrentLine2;
			
			while ((sCurrentLine = br.readLine()) != null) {
				
				createHashmp(sCurrentLine);
				
			}
			
			

			
			/*for( ; count < 234 ; count++) {
				sCurrentLine = br.readLine() ;
				sCurrentLine2 = br2.readLine(); 
				
				String ret1 = parseFile1(sCurrentLine); 
				String ret2 =  parseFile2(sCurrentLine2);
				
				System.out.println(ret2 +","+ret1+");");
				
			}*/
			
			
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}
	
	
	
	private static void createHashmp(String line){
		
		StringTokenizer token = new StringTokenizer(line,"=");
		if(token.hasMoreElements()){
			String elem = token.nextToken().toString().trim();
			
			if(token.hasMoreElements()){
				String elem2 = token.nextToken().toString().trim();
				elem2 = elem2.replace("new EventCodeMapper(", "");
				elem2 = elem2.replace(",null);", "");
				
				System.out.println("mAlarmEventCodeMapper.put("+elem+","+elem2+");");
			}
			
			
		}
		
		
		
		
	}
	
	
	private static void readFile2(){

		BufferedReader br = null;
		FileReader fr = null;

		try {

			// br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME2);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				  parseFile2(sCurrentLine);
				  
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}
	
	
	public static String  parseFile1(String line ){
		
		String elem = "";
		
		StringTokenizer token = new StringTokenizer(line," =");
		if(token.hasMoreElements()){
			elem = token.nextToken().toString();
		}
		
		return elem;
	}
	
	
	public static String  parseFile2(String line ){
		
		String elem = "";
		StringTokenizer token = new StringTokenizer(line,",");
		if(token.hasMoreElements()){
			elem = token.nextToken().toString();
		}
		return elem;
	}
	
	
	
	
}
