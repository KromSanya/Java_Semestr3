package org.example;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ExtensionFilter implements FilenameFilter {
    public String extension;

    public ExtensionFilter(String extension) {
        this.extension = extension;
    }
    public boolean accept(File dir, String name){
        return name.endsWith(extension);
    }

    public  List<String> fileExtensionFilter(String dir){
        File currentDir = new File(dir);
        if(!currentDir.exists())    throw new IllegalArgumentException();
        List<String> files = List.of(Objects.requireNonNull(currentDir.list(new ExtensionFilter(extension))));
        //System.out.println(files);
        return files;

    }

}
