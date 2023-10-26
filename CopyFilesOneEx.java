import java.io.*;

public class CopyFilesOneEx {
    public static long copyFile (File in,File out) throws IOException{
        try (InputStream is = new FileInputStream(in);
            OutputStream os = new FileOutputStream(out)){
            return is.transferTo(os);
        }
    }

    public static long copyFolder(File folderIn, File folderOut, String ext) throws IOException{
        File[] files = folderIn.listFiles();
        long fileCopied = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile() && files[i].getName().contains(ext)){
                File out = new File(folderOut, files[i].getName());
                copyFile(files[i], out);
fileCopied +=1;
            }

        }
return fileCopied;
}}
