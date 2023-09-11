package Hnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributeTeste01 {

	public static void main(String[] args) throws IOException{
		Path path = Paths.get("/home/Georges/dev/arquivo.txt");
        PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posix.permissions());
        System.out.println("Alterando as permissoes");
        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
        Files.setPosixFilePermissions(path,permissions);
        posix = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posix.permissions());

	}

}
