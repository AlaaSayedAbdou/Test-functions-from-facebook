package Configration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCradintial {
	//4
	private String[] loginconfigration =new String[4];
	private String[] registration =new String [6];
	
	public void ReadCradintials() {
		int i=0;
		BufferedReader reader;
		
		try {
			reader=new BufferedReader(new FileReader("G:/automation testing/login.txt"));
			String line =reader.readLine();
			
			while(line != null) {
				loginconfigration[i]=line;
				line=reader.readLine();
				i++;
			}
			reader.close();
		}
			
			catch(IOException e) {
				e.printStackTrace();
			}
		//return loginconfigration;

		}
	
	public String[] configration() {
		ReadCradintials();
		return loginconfigration;
	}
	
	
	
	public void Readregistration() {
		int i =0;
		BufferedReader reader ; 
		
		try
		{
			reader=new BufferedReader(new FileReader("G:/automation testing/registration.txt"));
			String line =reader.readLine();
			while(line !=null) {
				registration[i]=line;
				line=reader.readLine();
				i++;
			}
			reader.close();
		}
			catch(IOException e) {
			e.printStackTrace();
	
		}
		
	
	}
	
	public String[] configRegistration() {
		
		Readregistration();
		return registration;
		
	}
		
		
	}




