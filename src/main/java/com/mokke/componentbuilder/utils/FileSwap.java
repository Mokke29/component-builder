package com.mokke.componentbuilder.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

@Component
public class FileSwap{

    public String writeComponent(String data, String uniqueID) throws IOException, InterruptedException {

        String absolutePath = new FileSystemResource("src/main/resources/templates").getFile().getAbsolutePath();
        File file = new File(absolutePath,uniqueID + ".html");

        StringBuilder sb = new StringBuilder();
        sb.append("<html xmlns:th=\"http://www.thymeleaf.org\"><head><script src=\"https://cdn.tailwindcss.com\"></script></head><body><div th:fragment=\""+uniqueID+"\">");
        sb.append(data);
        sb.append("</div></body></html>");
        String completedHtmlComponent = sb.toString();
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(completedHtmlComponent);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return completedHtmlComponent;
    }

    public String newSessionComponent(String uniqueID) throws IOException, InterruptedException {

        String absolutePath = new FileSystemResource("src/main/resources/templates").getFile().getAbsolutePath();
        File file = new File(absolutePath,uniqueID + ".html");

        StringBuilder sb = new StringBuilder();
        sb.append("<html xmlns:th=\"http://www.thymeleaf.org\"><head><script src=\"https://cdn.tailwindcss.com\"></script></head><body><div th:fragment=\""+uniqueID+"\">");
        sb.append("<div th:replace=\"~{component}\"> </div>");
        sb.append("</div></body></html>");
        String completedHtmlComponent = sb.toString();
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(completedHtmlComponent);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return completedHtmlComponent;
    }

    public void deleteSessionComponent(String uniqueID) throws IOException {
        String absolutePath = new FileSystemResource("src/main/resources/templates").getFile().getAbsolutePath();
        File file = new File(absolutePath,uniqueID + ".html");
        boolean result = Files.deleteIfExists(file.toPath());
    }

    public String readSessionFile(Path path) throws IOException {
        String content = Files.readString(path, StandardCharsets.UTF_8);
        return content;
    }
}
