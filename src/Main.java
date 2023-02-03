import field.Field;
import field.FieldImpl;
import player.Player;
import player.PlayerImpl;

public class Main {
    public static void main(String[] args) {
        Field fieldPlayer1 = new FieldImpl();
        Field fieldPlayer2 = new FieldImpl();

        Player player1 = new PlayerImpl("Игрок1", fieldPlayer1);
        Player player2 = new PlayerImpl("Игрок2", fieldPlayer2);

        player1.addShips();
        fieldPlayer1.printField();
    }
}