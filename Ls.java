package sandbox;

import java.io.File;

public class Ls {
	
	private static void ls(String path) {
		File direcotryPath = new File(path);
		
		File files[] = direcotryPath.listFiles();
		
		System.out.println("List of files in " + path + ":");
		for(int i = 0 ; i < files.length ; i++) {
			String type = files[i].getName().split("\\.").length > 1 ? "file" : "directory";
			System.out.println(files[i].getName() + "\t: " + type);
		}
	}

	public static void main(String[] args) {

		ls("C:\\");

	}

}
