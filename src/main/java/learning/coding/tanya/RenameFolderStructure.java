package learning.coding.tanya;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static java.lang.System.out;

public class RenameFolderStructure {
    public static void main(String[] args) {
        File file = new File(args[0]);
        String[] listOfFolder = file.list();
        for (String folder : listOfFolder) {
            String subFolderString = String.format("%s/%s", file.getAbsolutePath(), folder);
            File subFolder = new File(subFolderString);
            String[] subFilesArray = subFolder.list();
            out.printf("%s\t\t%s\n", subFolder, subFolder.getName());
            for (String subFileString : subFilesArray) {
                File subFile = new File(subFolder.getAbsolutePath(),subFileString);
//                out.printf("\t%s\n", subFile);
                try {
                    File dest = new File(String.format("%s\\%s_%s", subFolder.getAbsolutePath(), subFolder.getName(), subFileString));
//                    boolean b = subFile.renameTo(dest);
//                    Path source = Paths.get(subFile.getAbsolutePath());

                    //uncomment this folder to rename the file
//                    Files.move(subFile.toPath(), dest.toPath());
                    out.printf("\t%s-----%s\n", subFile,dest);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        out.println(Arrays.asList(listOfFolder));
    }
}
