package validation;


public interface Validation {
    //it only has public methods
    //no method has an implementation
    //therefore no method has a body

    public boolean isValid(Object Value);
    public String errorMessage();

}
