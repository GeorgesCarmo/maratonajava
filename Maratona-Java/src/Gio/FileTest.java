package Gio;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("file.txt");
		try {
			boolean isCreate = file.createNewFile();
			System.out.println(isCreate);
			System.out.println("path "+file.getPath());
			System.out.println("path absolute "+file.getAbsolutePath());
			System.out.println("is Directory "+file.isDirectory());
			System.out.println("is file "+file.isFile());
			System.out.println("is Hidden "+file.isHidden()); // oculto
			System.out.println("last modified "+file.lastModified()); // retorna um long
			System.out.println("last modified "+Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
			boolean exists = file.exists();
			if(exists) {
				System.out.println("Deleted "+file.delete());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
