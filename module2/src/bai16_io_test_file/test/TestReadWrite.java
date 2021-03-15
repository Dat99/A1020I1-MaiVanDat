package bai16_io_test_file.test;

import java.io.*;

public class TestReadWrite {
    public static void main(String[] args) throws IOException {

//        File fileIO = new File("src/bai16_io_test_file/test/listStudent.abc");
//        FileReader fileReader = new FileReader(fileIO);
//        BufferedReader bufferedReader = new BufferedReader((fileReader));

          BufferedReader bufferedReader =
                  new BufferedReader(new FileReader(new File("D:/lapTrinh/codegym/A1020I1_MaiVanDat/A1020I1_MaiVanDat" +
                          "/A1020I1-MaiVanDat/module2/src/bai16_io_test_file/test/listStudent.abc")));
        String line;
        while ((line=bufferedReader.readLine()) !=  null){
            System.out.println(line);
        }
// mỗi lần readline thì trỏ xuống dòng tiếp theo, kiểm tra dòng 1 và hiển thị dòng 2

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                (new File("D:/lapTrinh/codegym/A1020I1_MaiVanDat/A1020I1_MaiVanDat" +
                "/A1020I1-MaiVanDat/module2/src/bai16_io_test_file/test/listStudent.abc"), true));
        bufferedWriter.newLine();
        bufferedWriter.write("nhat");
        bufferedWriter.close();


    }
}
