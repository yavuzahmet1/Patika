import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        String data="\n" +
                "The student having the highest Cumulative Grade Point Average (CGPA) is served first.\n" +
                "Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.\n" +
                "Any students having the same CGPA and name will be served in ascending order of the id.\n" +
                "Create the following two classes:";
        File file = new File("newPatika.txt");
        try {

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();

        }catch (Exception e){

        }
    }
}
