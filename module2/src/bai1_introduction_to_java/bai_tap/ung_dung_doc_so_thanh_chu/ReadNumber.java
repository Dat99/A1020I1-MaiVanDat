package bai1_introduction_to_java.bai_tap.ung_dung_doc_so_thanh_chu;

    import java.util.Scanner;

    public class ReadNumber {
        final static String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
        final static String twos[] = {" ", " ", " TWENTY", " THIRTY", " FORTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};

        private static void numberToWord(int number, String val) {
            System.out.print(number > 19 ? twos[number / 10] + " " + ones[number % 10] : ones[number]);
            System.out.print(number > 0 ? val : "");
        }

        public static void main(String[] args) {
            System.out.print("Input a numberber:");
            int number = new Scanner(System.in).nextInt();
            numberToWord(((number / 100) % 10), " HUNDRED AND");
            numberToWord((number % 100), " ");
        }

    }

