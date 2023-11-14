package Validate;

import java.util.List;

public class ValidateString {
    private static final int maxLength = 100;

    public static List<String> validateString(String value) {
        // Валидатор для строки: не null, не пустая и не превышает максимальную длину
        if (value == null || value.isEmpty()) {
            return List.of("Value cannot be null or empty.");
        }
        if (value.length() > maxLength) {
            return List.of("Value length exceeds the maximum allowed.");
        }
        return List.of();
    }
}
