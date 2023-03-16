import java.io.File;
import java.io.IOException;
public class FileCreation {

	public static void main(String[] args) throws IOException {
		File file = new File("sample.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
	}

}
