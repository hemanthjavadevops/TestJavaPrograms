package mypractiseprograms;
import java.io.*;


public class SIzeofGivenFolderWithLimitedFileMethods {
	
	public static void main(String [] args) throws Exception{
		
		long filesSize = filesList("Users/useruser/Desktop/Hemanth", new File("/"));
		System.out.println(filesSize);
	}

	
	static long filesList(String path, File root) throws Exception{
		
		String[] paths = path.split("/");
		File[] files = root.listFiles();
		
		for(String folderName:paths) {
			
			for (File folder:files) {
				//System.out.println(folder.getName());
				if(folderName.equalsIgnoreCase(folder.getName())) {
					if(folder.isDirectory()) {
						files = folder.listFiles();
						break;
					}
				} 
			}
		}
		
		return filesSize(files);
	}
	
	static long filesSize(File[] files) {
		
		long size = 0;
		for(File folder:files) {
			if(folder.isDirectory()) {
				size += filesSize(folder.listFiles());
			} else {
				size += folder.length();
			}
		}
		return size;
	}
}
