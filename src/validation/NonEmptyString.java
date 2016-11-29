package validation;

/**
 * Created by NicholasTurner on 11/29/16.
 */


public class NonEmptyString implements Validation {
    @Override
    public boolean isValid(Object value) {
        if (!(value instanceof String)) {
            return false; // it is invalid
        }
        return ! ((String) value).trim().isEmpty();
    }

    @Override
    public String errorMessage() {
        return "This value cannot be empty";
    }
}
