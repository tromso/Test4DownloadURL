package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class Main {

    public static void main(String[] args) throws IOException {

        Path targetFile = Paths.get("files","a.txt");
        String url = "http://www.smileowl.com/val";

        URL website = new URL(url);
        try (InputStream in = website.openStream()) {
            Files.copy(in, targetFile, StandardCopyOption.REPLACE_EXISTING);
        }



    }
}
