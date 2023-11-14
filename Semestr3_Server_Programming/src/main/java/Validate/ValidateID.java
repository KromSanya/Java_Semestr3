package Validate;

import java.util.List;

//public class Validators {
//    private static final int maxlength = 20;
//    public static boolean validateID(int id)
//    {
//        return id>0;
//    }
//
//    public static boolean validateString(String str)
//    {
//        return str != null && !str.equals("") && str.length() < maxlength;
//    }
//
//    public static boolean validateDate(String date)
//    {
//        String regex = ;
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(date);
//        return matcher.matches();
//    }
//}

public class ValidateID {

    public static List<String> validateId(long id, String fieldName) {
        // Валидатор для проверки положительного числа
        // Возможно, вам захочется добавить дополнительные проверки
        return id > 0 ? List.of() : List.of(fieldName + " must be a positive number.");
    }
}

