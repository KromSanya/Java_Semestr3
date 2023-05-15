package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameFilter {


    public static List<String> fileNameFilter(String dir, Pattern name) {
        List<String> files = new ArrayList<>();
        MyFileVisitor myFileVisitor = new MyFileVisitor(name);
        try {
            Files.walkFileTree(Paths.get(dir), myFileVisitor);
            files = myFileVisitor.getFiles();
            //System.out.println(files);
            return files;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}