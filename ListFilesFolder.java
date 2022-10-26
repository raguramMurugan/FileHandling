package filehandling;
import java.io.File;
public class ListFilesFolder {

	public static void main(String[] args) {
		File file=new File("E:\\javatraining\\FileHandling");
		File[] f=file.listFiles();
		for(File files:f)
		{
			if(files.isFile())
			{
				String filename=files.getName();
				int lastdigit=filename.lastIndexOf(".");
				String extension=filename.substring(lastdigit+1);
				if(extension.equals("txt"))
				{
					System.out.println(filename);
				}
			}
		}
	}

}
