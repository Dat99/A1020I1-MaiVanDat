package bai16_io_test_file.bai_tap.doc_file_csv;

import bai6_ke_thua.thuc_hanh.Shape.Student;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader
                =new BufferedReader(new FileReader(new File("src\\bai16_io_test_file\\bai_tap\\doc_filAe_csv\\country.csv")));
        String lineRead;
        String[] lineReadArray;
        Country countryRead;
        while ((lineRead = bufferedReader.readLine()) != null) {
            countryRead = new Country();
            lineReadArray = lineRead.split(",");// cat chuoi
            countryRead.setStartIp(lineReadArray[0]);
            countryRead.setEndIp(lineReadArray[1]);
            countryRead.setId(lineReadArray[2]);
            countryRead.setName(lineReadArray[3]);

            System.out.println(countryRead);




        }
    }
}
