import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class Print {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		try {
		FileReader reader = new FileReader("sample.txt");
		properties.load(reader);
		System.out.println(properties.getProperty("Name"));
		System.out.println(properties.getProperty("Size"));
		System.out.println(properties.getProperty("Author"));
		System.out.println(properties.getProperty("Date Of Creation"));
		System.out.println(properties.getProperty("Date of Update"));
		reader.close();
		}catch(FileNotFoundException ex)
		{
		System.out.println(ex.getMessage());	
		}catch(IOException ex)
		{
			ex.getMessage();
		}
	}


}


