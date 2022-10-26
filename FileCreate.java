package filehandling;
import java.io.File;
import java.io.IOException;
public class FileCreate {

	public static void main(String[] args) throws IOException {
		File myfile=new File("E:\\javatraining\\FileHandling\\SecondFile.xlsx");
		File myfile1=new File("E:\\javatraining\\FileHandling\\test.txt");
		myfile1.createNewFile();
		boolean found=myfile.exists();
		System.out.println("Already folder Created: "+" "+found);
		try {
		if(found ==false)
		{
			boolean file=myfile.createNewFile();
			System.out.println("Already File Created: "+" "+file);
		}
		}
		catch(IOException io)
		{
			System.out.println("There is an Error Occured while creating a File");
		}
	}
}
