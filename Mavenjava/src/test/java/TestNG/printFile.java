package TestNG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class printFile {

	
	
	public static void saveLogToTXT() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\amichaito\\Desktop\\PangoErrorLogs\\"+ "TEST.txt"));
		try {
			System.out.println("a");
			String inputLine = "AAAA";
			
			out.write(inputLine);


			System.out.print("Write to log file.txt successful");
		} catch (IOException e1) {
			System.out.println("Error during reading/writing");
		} finally {
			out.close();
			in.close();
		}

	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("1");
		saveLogToTXT();
		System.out.println("2");
	}

}
