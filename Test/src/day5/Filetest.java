package day5;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filetest {

	public static void main(String[] args) {
		try {
	          File file = new File("priyanka - Personal");
	          
	          //Create the file
	          if (file.createNewFile()) { 
	             System.out.println("File is created!");
	          } else {
	             System.out.println("File already exists.");
	          } 
	          
	          // Write Content
	          FileWriter writer = new FileWriter(file);
	          writer.write("HI JAVA B1");
	          writer.close();
	          
	          
	          // read content
	          FileReader reader = new FileReader(file);
	          
	          int c;
	          while ((c = reader.read()) != -1) {
	        	  char ch = (char) c;
	              System.out.print(ch);
	          }
	      } catch (IOException e) {
	         System.out.print("Exception");
	      }	

	}

}