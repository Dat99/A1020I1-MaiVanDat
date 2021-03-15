package bai16_io_test_file.bai_tap.coppy_file_text;

import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader
                = new BufferedReader(new FileReader(new File("D:/lapTrinh/codegym/A1020I1_MaiVanDat/" +
                "A1020I1_MaiVanDat/A1020I1-MaiVanDat/" +
                "module2/src/bai16_io_test_file/bai_tap/coppy_file_text/bkdn.abc")));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }


        BufferedWriter bufferedWriter
                = new BufferedWriter(new FileWriter(new File("D:/lapTrinh/codegym/A1020I1_MaiVanDat" +
                "/A1020I1_MaiVanDat/A1020I1-MaiVanDat/module2/src/bai16_io_test_file" +
                "/bai_tap/coppy_file_text/codegym.xyz"), true));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}