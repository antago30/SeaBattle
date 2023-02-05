package field;

public class FieldImpl implements Field{
    private final int[][] field;

    public FieldImpl() {
        field = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

    }

    public int getField(int x, int y) {
        return field[x][y];
    }

    public void addShip (int[] coordinates) {
        for(int i = 0; i < coordinates.length; i = i + 2){
            field[i][++i] = 1;
        }
    }

    public void addOreol (int[] coordinates) {

    }

    public void printField () {
        for(int[] x: field) {
            for (int y: x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
