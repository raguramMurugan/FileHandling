//Program to create a Folder with sub-folder
package filehandling;
import java.io.File;
public class FolderCreate {

	public static void main(String[] args) {
		File folder=new File("E:\\javatraining\\FileHandling");
		boolean found=folder.exists();
		System.out.println("Already Folder created: "+" "+found);
		if(found ==false)
		{
			folder.mkdirs();
		}
		found=folder.exists();
		System.out.println("Already folder created: "+" "+found);
	}

}
