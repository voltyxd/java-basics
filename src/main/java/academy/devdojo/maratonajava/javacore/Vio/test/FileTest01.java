package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("isCreated: " + isCreated);
            System.out.println("Path: " +file.getPath());
            System.out.println("Path absolute: " +file.getAbsolutePath());
            System.out.println("isDirectory: " + file.isDirectory());
            System.out.println("isFile: " + file.isFile());
            System.out.println("isHidden: " + file.isHidden());
            System.out.println("last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted: " + file.delete());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
