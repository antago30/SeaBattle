package field;

public interface Field {
    int getField(int x, int y);
    void addShip (int[] coordinates);
    void addOreol(int[] coordinates);
    void printField ();
}
