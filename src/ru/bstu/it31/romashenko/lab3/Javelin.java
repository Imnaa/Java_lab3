package ru.bstu.it31.romashenko.lab3;

import java.util.Scanner;

/** @author Ромащенко Н.А.
 *
 * @version 1. 22.02.19
 *
 * Имя класса: Javelin (Метательное копье)
 *
 * Назначение:
 *
 */

//TODO: class Javelin
public class Javelin  extends SportStock {
    private double weight;
    private double diament;

    public double getDiament() {
        return diament;
    }

    public double getWeight() {
        return weight;
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

    @Override
    public void init(Scanner scanner) {
        /*
        1. Мяч
        2. Ракетка
        3. Метательное копье
        4. Тренажерный инвентарь
         */
        System.out.println("Тип спортивного инвентаря: Метательное копье");
        sportType = 3;
        //
        System.out.println("Название: Метательное копье");
        name = "Метательное копье";
        //
        super.init(scanner);
        scanner.nextLine();
        //
        System.out.print("Введите длину: ");
        weight = scanner.nextDouble();
        scanner.nextLine();
        //
        System.out.print("Введите диаметр");
        diament = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Тип спортивного инвентаря: Метательное копье" + "\n" +
                "Название: "                + name          + "\n" +
                "Масса: "                   + massa + " кг" + "\n" +
                "Тип материала: "           + material      + "\n" +
                "Длина: "                   + weight        + "\n" +
                "Диаметр: "                 + diament       + "\n";
    }
}
