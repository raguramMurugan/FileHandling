package filehandling;
import java.io.File;
public class FileProperties {

	public static void main(String[] args) {
		File file=new File("E:\\javatraining\\FileHandling\\JavaProgram.xls");
		//To get the name of File
		System.out.println("File name with Extension: "+" "+file.getName());
		//To check the file is Readable
		System.out.println("File is Readable: "+" "+file.canRead());
		System.out.println("File is Writable: "+" "+file.canWrite());
		System.out.println("File can be Executable: "+file.canExecute());
	}

}
