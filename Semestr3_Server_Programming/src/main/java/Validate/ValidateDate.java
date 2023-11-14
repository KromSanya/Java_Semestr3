package Validate;

import java.util.List;

public class ValidateDate {
    public static List<String> validateDate(String date) {
        // Валидатор для даты с использованием регулярного выражения
        String dateRegex = "^(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$";
        if (!date.matches(dateRegex)) {
            return List.of("Invalid date format. Expected format: YYYY-MM-DD");
        }
        return List.of();
    }
}
