package validator;

import field.Field;

public interface Validator {
    boolean coordinatesCheck(int[] coordinates, int numberOfDesk);
    boolean validationCheck(int[] coordinates);
    boolean positionCheck(int[] coordinates, Field field);
}
