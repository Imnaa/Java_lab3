package ru.bstu.it31.romashenko.lab3;

import java.util.Scanner;

/** @author Ромащенко Н.А.
 *
 * @version 1. 22.02.19
 *
 * Имя класса: Roket (Ракетка)
 *
 * Назначение:
 *
 */

//TODO: class Roket
public class Roket extends SportStock {
    private double diametr;

    public double getDiametr() {
        return diametr;
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
        System.out.println("Тип спортивного инвентаря: Ракетка");
        sportType = 2;
        //
        System.out.println("Название: Ракетка");
        name = "Ракетка";
        //
        System.out.print("Введите массу в кг: ");
        massa = scanner.nextDouble();
        scanner.nextLine();
        //
        System.out.println("Введите тип материала:");
        System.out.println("\t> 1. Аллюминий.");
        System.out.println("\t> 2. Железо.");
        System.out.println("\t> 3. Стекло.");
        material = scanner.nextInt();
        scanner.nextLine();
        //
        System.out.print("Введите диаметр: ");
        diametr = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Тип спортивного инвентаря: Ракетка" + "\n" +
                "Название: "        + name          + "\n" +
                "Тип материала: "   + material      + "\n" +
                "Диаметр: "         + diametr       + "\n";
    }
}
