package com.edstem.java.download;

import java.nio.Buffer;

public class DownloadFileAndSave {
    public static void main(String[] args) {
        String url = "testurl.com";
        String fileName = "testFileName.txt";
        Download myDownload = new Download(url);
        Buffer fileContent = myDownload.doDownload();
        File myFile = new File(fileName, "./tmp", fileContent);
        myFile.save();
    }
}
