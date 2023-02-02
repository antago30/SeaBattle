package field;

public class FieldImpl implements Field{
    private byte[][] field;

    public FieldImpl() {
        field = new byte [10][10];
    }

    // Проверка что коориднаты от 0 до 9, количество координат соответствует количеству палуб
    @Override
    public boolean coordinatesCheck(int[] coordinates, int numberOfDesk) {
        boolean result = false;

        if (coordinates.length == numberOfDesk) {
            for(int i: coordinates) {
                result = i > 0 && i < 9;
            }
        }
        return result;
    }

    // Проверка валидности корабля, то есть что введенные координаты идут по порядку
    @Override
    public boolean validationCheck(int[] coordinates) {
        boolean result = false;

        for (int i = 0; i < coordinates.length - 2; i++) {
            if (coordinates[i] == coordinates[i+2]) {
                
            }
        }

        return result;
    }

    // Проверка что корабль распологается в свободнгом месте и проверка ореола
    @Override
    public void positionCheck() {

    }
}
