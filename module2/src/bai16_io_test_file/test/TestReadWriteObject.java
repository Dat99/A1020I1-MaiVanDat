package bai16_io_test_file.test;

import bai6_ke_thua.thuc_hanh.Shape.Student;

import java.io.*;

public class TestReadWriteObject {
    public static void main(String[] args) throws IOException {
        Student student = new Student(1, "Dat", 22);
        BufferedWriter bufferedWriter
                = new BufferedWriter(new FileWriter(new File("D:/lapTrinh/codegym/A1020I1_MaiVanDat/" +
                "A1020I1_MaiVanDat" + "/A1020I1-MaiVanDat/module2/src/bai16_io_test_file/test/list_student.csv"), true));
        String line = student.getId() + "," + student.getName() + "," + student.getAge();
        bufferedWriter.write(line);
        bufferedWriter.close();

        // doc file
        BufferedReader bufferedReader
                = new BufferedReader(new FileReader(new File("D:/lapTrinh/codegym/A1020I1_MaiVanDat/" +
                               "A1020I1_MaiVanDat/A1020I1-MaiVanDat/module2/src/bai16_io_tebst_file/test/" +
                "list_student.csv")));
        String lineRead;
        String[] lineReadArray;
        Student studentRead;
        while ((lineRead = bufferedReader.readLine()) != null) {
            studentRead = new Student();
            lineReadArray = lineRead.split(",");

            studentRead.setId(Integer.parseInt(lineReadArray[0]));
            studentRead.setName(lineReadArray[1]);
            studentRead.setAge(Integer.parseInt(lineReadArray[2]));
            System.out.println(studentRead);
        }

    }
}