package testproperties;

import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class TestPro {
	public static void main(String[] args) {

		 try (InputStream input = TestPro.class.getClassLoader().getResourceAsStream("db.properties")) {

	            Properties prop = new Properties();

	            if (input == null) {
	                System.out.println("Sorry, unable to find config.properties");
	                return;
	            }

	            //load a properties file from class path, inside static method
	            prop.load(input);

	            //get the property value and print it out
	            System.out.println(prop.getProperty("db.url"));
	            System.out.println(prop.getProperty("db.user"));
	            System.out.println(prop.getProperty("db.password"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }

	    }


		
	}

