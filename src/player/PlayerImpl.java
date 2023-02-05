package player;

import field.Field;
import validator.Validator;
import validator.ValidatorImpl;

import java.util.Scanner;

public class PlayerImpl implements Player{
    private final String name;
    private final Field field;


    public PlayerImpl(String name, Field field){
        this.name = name;
        this.field = field;
    }

    @Override
    public void addShips() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + " расставляет свои корабли.");
        int ships = 10;
        int numberOfDecks = 0;

        while (ships > 0){
            switch (ships) {
                case (10) -> {
                    numberOfDecks = 4;
                    System.out.println("Введите координаты четырёхпалубного корабля в формате x1,y1,x2,y2,x3,y3,x4,y4");
                }
                case (9), (8) -> {
                    numberOfDecks = 3;
                    System.out.println("Введите координаты трёхпалубного корабля в формате x1,y1,x2,y2,x3,y3");
                }
                case (7), (6), (5) -> {
                    numberOfDecks = 2;
                    System.out.println("Введите координаты двухпалубного корабля в формате x1,y1,x2,y2");
                }
                case (4), (3), (2), (1) -> {
                    numberOfDecks = 1;
                    System.out.println("Введите координаты однопалубного корабля в формате x1,y1");
                }
            }

            String[] coordinatesStr = scanner.nextLine().split(",");
            int[] coordinatesInt = new int[coordinatesStr.length];

            for (int i = 0; i < coordinatesStr.length; i++) {
                coordinatesInt[i] = Integer.parseInt(coordinatesStr[i]);
            }

            Validator v = new ValidatorImpl();
            if (v.coordinatesCheck(coordinatesInt, numberOfDecks) && v.validationCheck(coordinatesInt)
                && v.positionCheck(coordinatesInt, field)) {

                field.addShip(coordinatesInt);
                //field.addOreol(coordinatesInt);
                field.printField();

                ships--;
            }
        }
    }
}
