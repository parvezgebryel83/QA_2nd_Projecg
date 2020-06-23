package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class filePropertysetting {

	public static void main(String[] args) throws IOException {// it asks exceptions we accept IOException
		// TODO Auto-generated method stub
		filePropertysetting crt = new filePropertysetting();
		crt.Parameters();

	}
	public void Parameters() throws IOException {
		//create object for properties
		Properties writing = new Properties();//import properties class from java
		FileInputStream obj =  new FileInputStream("C:\\Users\\parve\\eclipse-workspace\\JavaBasics\\src\\Parvez.properties");// we should import fileinputstream class also from java io
		// now it will ask arguments which is the path of the file properties
	//after that it will give us exception erro and we select no file found exception
		writing.load(obj);
		System.out.println(writing.getProperty("Name"));
		System.out.println(writing.getProperty("City"));
		System.out.println(writing.get("State"));
		System.out.println(writing.getProperty("Country"));
		System.out.println(writing.getProperty("Occupation"));
	}

}
