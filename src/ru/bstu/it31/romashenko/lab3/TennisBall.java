package ru.bstu.it31.romashenko.lab3;

import java.lang.Object;
import java.util.Scanner;

/** @author Ромащенко Н.А.
 *
 * @version 1. 22.02.19
 *
 * Имя класса: TennisBall (Теннисный мяч)
 *
 * Назначение:
 *
 */

//TODO: class TennisBall
public class TennisBall extends Ball {
    private int countShipi = 0;

    public double getCountShipi() {
        return countShipi;
    }

    @Override
    public void init(Scanner scanner) {
        /*
        1. Мяч
        2. Ракетка
        3. Метательное копье
        4. Тренажерный инвентарь
         */
        System.out.println("Тип спортивного инвентаря: Мяч");
        sportType = 1;
        //
        System.out.println("Название: Тенисный мяч");
        name = "Тенисный мяч";
        //
        System.out.print("Введите количкество пупырышек: ");
        countShipi = scanner.nextInt();
        scanner.nextLine();
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
        System.out.print("Введите радиус: ");
        radius = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Тип спортивного инвентаря: Мяч"             + "\n" +
                "Название: "                + name          + "\n" +
                "Количкество пупырышек: "   + countShipi    + "\n" +
                "Масса: "                   + massa + " кг" + "\n" +
                "Тип материала: "           + material      + "\n" +
                "Радиус: "                  + radius        + "\n";
    }
}
