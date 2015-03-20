package net.saltfactory.utils;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) {
        String systemEncoding = new OutputStreamWriter(new ByteArrayOutputStream()).getEncoding();
        String fileEncdoing = System.getProperty("file.encoding");
        try {
            if (args[0].toUpperCase().equals("SYSTEM")) {
                System.out.println("System Encoding: " + systemEncoding);
            } else if (args[0].toUpperCase().equals("FILE")) {
                System.out.println("File Encoding: " + fileEncdoing);

            } else if (args[0].toUpperCase().equals("BOTH")) {
                System.out.println("System Encoding: " + systemEncoding);
                System.out.println("File Encoding: " + fileEncdoing );
            } else {
                System.out.println("Not support arguments! Arguments are only \"system\" or \"file\" or \"both\"");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Not found arguments! Run it with arguments \"system\" or \"file\" or \"both\"");
        }
    }

}
