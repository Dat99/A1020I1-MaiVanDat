package commons;

public class FuncValidationService {
    private static String regex = "";

    // --------------- Check Input With Regex ---------------- //

    public static boolean checkID(String str) {
        regex = "^SV([V,L]{2}|[H,O]{2}|[R,O]{2})-[\\d]{4}$";
        return str.matches(regex);
    }

    public static boolean checkRoomServices(String str) {
        regex = "^(Room)[\\d]*$";
        return str.matches(regex);
    }
    public static boolean checkVillaServices(String str) {
        regex = "^(Villa)[\\d]*$";
        return str.matches(regex);
    }
    
    public static boolean checkHouseServices(String str) {
        regex = "^(House)[\\d]*$";
        return str.matches(regex);
    }

    public static boolean checkArea(String str) {
        regex = "^[3-9][\\d]{1,2}|[\\d]{3}$";
        return str.matches(regex);
    }

    public static boolean checkMaxNumberOfPeople(String str) {
        regex = "^([1-9]{1}|([1][\\d]{1})|20)$";
        return str.matches(regex);
    }

    public static boolean checkRentPrice(String str) {
        regex = "^[\\d]*$";
        return str.matches(regex);
    }

    public static boolean checkFreeServices(String str) {
        regex = "^(Massage|Karaoke|Food|Drink|Car)$";
        return str.matches(regex);
    }

    public static boolean checkNumberOfFloors(String str) {
        regex = "^[\\d]{1,2}$";
        return str.matches(regex);
    }

    public static boolean checkTypeRent(String str) {
        regex = "^(day|hour|month)$";
        return str.matches(regex);
    }

    public static boolean checkStandardRoom(String str) {
        regex = "^[A-Z][\\w]{1,100}$";
        return str.matches(regex);
    }

}
