package bai19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String TELEPHONE_REGEX ="^(\\d){2}-[0-9]$";
}
