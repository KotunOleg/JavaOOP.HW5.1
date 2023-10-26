import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "/Users/olegkotun/Desktop/Testing";
        File folderIn = new File(path);
        File folderOut = new File("Result");

        folderOut.mkdirs();

        try {
            System.out.println(CopyFilesOneEx.copyFolder(folderIn, folderOut, ".docx"));
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
