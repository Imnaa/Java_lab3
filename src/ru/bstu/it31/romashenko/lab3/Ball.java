package ru.bstu.it31.romashenko.lab3;

import java.util.Scanner;

/** @author Ромащенко Н.А.
 *
 * @version 1. 22.02.19
 *
 * Имя класса: Ball (мяч)
 *
 * Назначение:
 *
 */

//TODO: class Ball
public class Ball extends SportStock {
    protected double radius;

    @Override
    public void init(Scanner scanner) {
        /*
        1. Мяч
        2. Ракетка
        3. Метательное копье
        4. Тренажерный инвентарь
         */
        //System.out.println("Тип спортивного инвентаря: Мяч");
        //sportType = 1;
        //
        /*System.out.print("Введите название: ");
        name = scanner.nextLine();
        scanner.nextLine();*/
        //
        super.init(scanner);
        //
        //System.out.print("Введите радиус: ");
        //radius = scanner.nextDouble();
        //scanner.nextLine();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSportType() {
        return sportType;
    }

    @Override
    public double getMassa() {
        return massa;
    }

    @Override
    public int getMaterial() {
        return material;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Тип спортивного инвентаря: Мяч"             + "\n" +
                "Название: "                + name          + "\n" +
                "Масса: "                   + massa + " кг" + "\n" +
                "Тип материала: "           + material      + "\n" +
                "Радиус: "                  + radius        + "\n";
    }
}