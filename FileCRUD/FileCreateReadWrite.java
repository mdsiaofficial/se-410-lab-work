import java.io.*;
import java.nio.file.Files;

public class FileCreateReadWrite {
    public static void main(String[] args) {
        File FN = new File("ashiq-folder");
        FN.mkdirs();
        String path = FN.getAbsolutePath();

        File f1 = new File(path, "Teacher.txt");
        File f2 = new File(path, "Student.txt");
        try {
            // ! creating file here using createNewFile() method
            f1.createNewFile();
            f2.createNewFile();

            // ! writing file using FileWriter
            FileWriter fw1 = new FileWriter(f1);
            FileWriter fw2 = new FileWriter(f2);
            fw1.write("I am a teacher. ");
            fw2.write("I am student. ");
            fw1.close();
            fw2.close();

            // ! reading file using FileReader
            FileReader fr1 = new FileReader(f1);
            FileReader fr2 = new FileReader(f2);

            System.out.print("\nCharacter stream printing : \n");
            // ! printing file as character stream
            int data1;
            int data2;
            while ((data1 = fr1.read()) != -1) {
                System.out.print((char) data1);
            }
            System.out.print("\n");
            while ((data2 = fr2.read()) != -1) {
                System.out.print((char) data2);
            }
            System.out.print("\n");

            System.out.print("\nString printing : \n");
            // ! printing file as string
            String content1 = Files.readString(f1.toPath());
            String content2 = Files.readString(f2.toPath());
            System.out.println(content1);
            System.out.println(content2);

            fr1.close();
            fr2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}