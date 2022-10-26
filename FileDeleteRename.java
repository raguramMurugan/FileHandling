package filehandling;
import java.io.File;
public class FileDeleteRename {

	public static void main(String[] args) {
		File myfile=new File("E:\\javatraining\\FileHandling\\firstfile.xlsx");
		myfile.delete();
		boolean filefound=myfile.exists();
		
		System.out.println("file exists :"+filefound);
		
		File rename=new File("E:\\javatraining\\FileHandling\\SampleFile.xls");
		File newname=new File("E:\\javatraining\\FileHandling\\JavaProgram.xls");
		
		boolean name_change=rename.renameTo(newname);
		System.out.println("File renamed success: "+" "+name_change);
	}

}
