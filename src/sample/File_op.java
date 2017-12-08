package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class File_op {
	
	private static final String FILENAME = "C:\\test\\intrusion_alarm.txt";
	

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;

		try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;
			
			

			while ((sCurrentLine = br.readLine()) != null) {

				String tag = "<string name=\"type\">actualString</string>";

				StringTokenizer st = new StringTokenizer(sCurrentLine, " ");
				StringBuilder sb = new StringBuilder();
				sb.append("intrusion_");
				while (st.hasMoreTokens()) {
					sb.append(st.nextToken().toString().toLowerCase());
					sb.append("_");

				}

				String tag1 = tag.replace("type", sb.toString().substring(0, sb.length() - 1));
				String tag2 = tag1.replace("actualString", sCurrentLine);

				// System.out.println("R.string."+sb.toString().substring(0,
				// sb.length()-1));
				//  System.out.println(sb.toString().substring(0,
				// sb.length()-1));
//				System.out.println(tag2);
				
				
				String putCmd = "put(\"event_type\" , R.string.eventString);";
				
				String put1 = putCmd.replace("eventString", sb.toString().substring(0, sb.length() - 1));
				// String put2 = put1.replace("event_type", sCurrentLine);
				
				System.out.println(put1);

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

}
