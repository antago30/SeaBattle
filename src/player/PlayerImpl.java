package player;

import field.Field;

import java.util.Scanner;

public class PlayerImpl implements Player{
    private String name;

    public PlayerImpl(String name){
        this.name = name;
    }

    @Override
    public void addShips(Field field) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(name + "расставляет свои корабли.");
        System.out.println("Введите координаты четырёхпалубного корабля в формате x1,y1,x2,y2,x3,y3,x4,y4");


    }
}
