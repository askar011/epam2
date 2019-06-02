package optinaltasks.errors.validator;

public class DoubleNumberValidator {

    public static boolean isValid(double data) {
        return data < Double.MAX_VALUE && data > Double.MIN_VALUE;
    }
}
