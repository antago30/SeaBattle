package validator;

import field.Field;

public class ValidatorImpl implements Validator{

    // Проверка что коориднаты от 0 до 9, количество координат соответствует количеству палуб
    @Override
    public boolean coordinatesCheck(int[] coordinates, int numberOfDesk) {
        boolean result = false;

        if (coordinates.length == numberOfDesk * 2) {
            for(int i: coordinates) {
                result = i > 0 && i < 9;
                if (!result) break;
            }
        }

        return result;
    }

    // Проверка валидности корабля, то есть что введенные координаты идут по порядку
    @Override
    public boolean validationCheck(int[] coordinates) {
        boolean result = false;

        if(coordinates[0] == coordinates[2] && coordinates[2] == coordinates[4] && coordinates[4] == coordinates[6]) {

            if (coordinates[3] == coordinates[1]+1 && coordinates[5] == coordinates[3]+1 && coordinates[7] == coordinates[5]+1)
                result = true;
            else if (coordinates[3] == coordinates[1]-1 && coordinates[5] == coordinates[3]-1 && coordinates[7] == coordinates[5]-1)
                result = true;

        } else if (coordinates[1] == coordinates[3] && coordinates[3] == coordinates[5] && coordinates[5] == coordinates[7]) {

            if (coordinates[2] == coordinates[0]+1 && coordinates[4] == coordinates[2]+1 && coordinates[6] == coordinates[4]+1)
                result = true;
            else if (coordinates[2] == coordinates[0]-1 && coordinates[4] == coordinates[2]-1 && coordinates[6] == coordinates[4]-1)
                result = true;

        }

        return result;
    }

    // Проверка что корабль распологается в свободнгом месте и создание ореола
    @Override
    public boolean positionCheck(int[] coordinates, Field field) {
        boolean result = true;

        for(int i = 0; i < coordinates.length; i = i + 2) {
            if (field.getField(i, ++i) != 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}
