package commons;

import libs.*;

import java.time.LocalDate;
import java.time.Period;

public class FuncValidationCustomer {
    private static String regex = "";

// -------------------------- //

    public static boolean checkNameCustomer(String name) throws NameException {
        regex = "^[A-Z][a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆ" +
                "ỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\S\\W|_]+$";
        if (!name.matches(regex)) {
            throw new NameException();
        } else {
            return name.matches(regex);
        }

    }

    public static boolean checkEmail(String email) throws EmailException {
        regex = "^[\\w._%+-]+@[\\w.-]+\\.[\\w]{2,6}$";
        if (!email.matches(regex)) {
            throw new EmailException();
        } else {
            return email.matches(regex);
        }
    }

    public static boolean checkCardNumber(String idCard) throws IdCardException {
        regex = "^(\\d{9}$)";
        if(!idCard.matches(regex))
            throw new IdCardException();
        else
            return idCard.matches(regex);
    }



    public static boolean checkGender(String gender) throws GenderException {
        regex = "^male$|^female$|^unknow$";
        if (!gender.matches(regex)){
            throw new GenderException();
        }else {
            return gender.matches(regex);
        }
    }

    public static boolean checkDayOfBirth(String dob) throws BirthdayException {
        boolean check;
        LocalDate birthday;
        regex = "\\b(0?[1-9]|[12]\\d|3[01])[\\/\\-.](0?[1-9]|[12]\\d|3[01])[\\/\\-.](\\d{2}|\\d{4})\\b";
        check = dob.matches(regex);
        if (check) {
            String[] dateString = dob.split("/");
            int date = Integer.parseInt(dateString[0]);
            int month = Integer.parseInt(dateString[1]);
            int year = Integer.parseInt(dateString[2]);
            try {
                birthday = LocalDate.of(year, month, date);
            } catch (Exception e) {
                throw new BirthdayException();
            }
            LocalDate today = LocalDate.now();
            if (Period.between(birthday, today).getYears() < 18) {
                throw new BirthdayException();
            }
            if (year < 1900) {
                throw new BirthdayException();
            }
        } else {
            throw new BirthdayException();
        }
        return check;
    }

    public static boolean checkTypeCustomer (String type) throws TypeCustomerException {
        regex = "^Diamond$|^Platinium|^Gold$|^Silver$|^Member$";
        if (!type.matches(regex)){
            throw new TypeCustomerException();
        }else {
            return type.matches(regex);
        }
    }
}
