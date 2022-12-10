package com.edstem.java.download;

import java.nio.Buffer;

public class File {
    private final String fileName;
    private final String path;
    private final Buffer fileContent;

    public File(String fileName, String path, Buffer fileContent) {
        this.fileName = fileName;
        this.path = path;
        this.fileContent = fileContent;
    }

    public void save() {
        //TODO : Save file content to the path with file name;
    }
}
