package bai16_io_test_file.bai_tap.test_coppy_file;

import java.util.Scanner;

public class MainCoppyFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap link file name read:");
        String fileNameRead = input.nextLine();
        System.out.println("Nhap link file name write:");
        String fileNameWrite = input.nextLine();
        WriteAndReadCoppyFile.writeFile(fileNameWrite, WriteAndReadCoppyFile.readFile(fileNameRead));
    }
}
