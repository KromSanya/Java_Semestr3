package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    Pattern name;
    List<String> files = new ArrayList<>();

    public List<String> getFiles() {
        return files;
    }

    public MyFileVisitor(Pattern name) {
        this.name = name;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Matcher matcher = name.matcher(file.getFileName().toString());
        if(matcher.find())
        {
            files.add(String.valueOf(file.toAbsolutePath()));
        }
        return FileVisitResult.CONTINUE;
    }
}
