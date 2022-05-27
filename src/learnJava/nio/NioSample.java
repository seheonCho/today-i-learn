package learnJava.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {

    public static void main(String[] args) {


        NioSample sample = new NioSample();
        sample.basicWriteAndRead();
    }

    private void basicWriteAndRead() {
        String fileName = "/niotest/nio.txt";
        try {
            writeFile(fileName, "test NIO sample");
            readFile(fileName);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void writeFile(String fileName, String data) throws FileNotFoundException, IOException {
        FileChannel channel = new FileOutputStream(fileName).getChannel();
        byte[] byteData = data.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(byteData);
        channel.write(buffer);
        channel.close();
    }

    private void readFile(String fileName) throws FileNotFoundException, IOException {
        FileChannel channel = new FileInputStream(fileName).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
        channel.close();
    }


}
