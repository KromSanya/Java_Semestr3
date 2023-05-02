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


    public List<String> fileNameFilter(String dir, Pattern name) {
        List<String> files = new ArrayList<>();
        MyFileVisitor myFileVisitor = new MyFileVisitor(name);
        try {
            Files.walkFileTree(Paths.get(dir), myFileVisitor);
            files = myFileVisitor.getFiles();
            System.out.println(files);
            return files;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public List<String> fileNameFilt(String dir, Pattern name) {
        File currentDir = new File(dir);
        Path path = Path.of(dir);
        Matcher matcher;
        List<String> filess = null;
        if(!currentDir.exists())    throw new IllegalArgumentException();
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path))
        {
            for (Path path2 : files)
            {
                File dirtemp = new File(String.valueOf(path2));
                if(dirtemp.isFile())
                {
                    matcher = name.matcher(path2.getFileName().toString());
                    if(matcher.find())
                    {
                        filess.add(String.valueOf(path2));
                    }
                }
                if(dirtemp.isDirectory())
                {
                    fileNameFilt(dir,name);
                }
            }
        } catch (IOException e) {
                throw new RuntimeException(e);
            }


        return filess;
    }



    public List<String> fileNameFilt2(String dir, Pattern name)
    {
        File currentDir = new File(dir);
        Path path = Path.of(dir);
        List<String> filess = new ArrayList<>();
        Matcher matcher = name.matcher(path.getFileName().toString());
        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path file : files) {
                filess.add(String.valueOf(file));
            }
            System.out.println(filess);
            for(String ff : filess){

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return filess;
    }


}