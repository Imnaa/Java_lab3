package ru.bstu.it31.romashenko.lab3;

import java.util.Scanner;

/** @author Ромащенко Н.А.
 *
 * @version 1. 22.02.19
 *
 * Имя класса: Main
 *
 * Назначение:
 *
 * Создать абстрактный класс «Спортивный инвентарь»
 * public abstract void init(Scanner scanner) 	// считывание параметров с консоли
 * public int getSportType();	// возвращает вид спорта, к которому относится
 * public String toString() 	// возвращается состояние объекта в виде строки
 * 				// (определяется только в наследниках, т.к. определен в
 * 				// Object)
 * Построить иерархию классов:
 *
 * Спортивный инвентарь     → Мяч 	                → Волейбольный мяч
 * 						                            → Теннисный мяч
 * 				            → Ракетка
 * 				            → Метательное копье
 * 				            → Тренажерный инвентарь	→ Штанга
 * 							                        → Гиря
 * Написать программу, которая:
 * 1) Считывает с консоли количество предметов инвентаря (распознавать количество при вводе пользователем таких строк: вап4явап, аа4а555 (в этом случае надо распознать первое число))
 * 2) В цикле считывает параметры. Сначала спрашивается тип инвентаря и создается объект нужного класса. Затем у объекта вызывается метод init() и вводятся характеристики объекта  (вид спорта, к которому относится, характеристики: для мяча — радиус, для гири и штанги — вес и т.д.). Понятно, что метод init() разный у разных классов.
 * 3) Считанные объекты добавляются в массив.
 * 4) Ищется весь инвентарь, относящийся к теннису, и выводится на экран (вывод через toString())
 *
 */

//TODO: class Main
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        String inConsole = null;
        int inConsoleNumber = 0;
        //
        System.out.println("Введите нужное количество инвентаря: ");
        inConsole = scanner.nextLine();
        inConsole = inConsole.replaceAll("\\D", "");
        inConsoleNumber = Integer.parseInt(inConsole.substring(0, 1));
        //
        if (inConsoleNumber < 1) {
            System.out.println("Некорректный ввод!");
            return;
        }
        //
        SportStock[] sportStocks = new SportStock[inConsoleNumber];
        //
        String[] typesOfSportStocks = {
                "Мяч",
                "Волейбольный мяч",
                "Тенисный мяч",
                "Ракетка",
                "Метательное копье",
                "Штанга",
                "Гиря"
        };
        //
        for (int i = 0, n = inConsoleNumber; i < n; ++i) {
            //
            System.out.println("Типы инвентаря: ");
            for (int j = 0; j < typesOfSportStocks.length; ++j) {
                System.out.println("> " + typesOfSportStocks[j]);
            }
            //
            System.out.print("Введите нужный тип инвентаря: ");
            String type = scanner.nextLine();
            //
            if (type.equals(typesOfSportStocks[0])) { // мяч
                Ball ball = new Ball();
                ball.init(scanner);
                sportStocks[i] = ball;
            } else if (type.equals(typesOfSportStocks[1])) { // волейбольный мяч
                VolleyBall volleyBall = new VolleyBall();
                volleyBall.init(scanner);
                sportStocks[i] = volleyBall;
            } else if (type.equals(typesOfSportStocks[2])) { // теннисный мяч
                TennisBall tennisBall = new TennisBall();
                tennisBall.init(scanner);
                sportStocks[i] = tennisBall;
            } else if (type.equals(typesOfSportStocks[3])) { // ракетка
                Roket roket = new Roket();
                roket.init(scanner);
                sportStocks[i] = roket;
            } else if (type.equals(typesOfSportStocks[4])) { // метательное копье
                Javelin javelin = new Javelin();
                javelin.init(scanner);
                sportStocks[i] = javelin;
            } else if (type.equals(typesOfSportStocks[5])) { // штанга
                Rod rod = new Rod();
                rod.init(scanner);
                sportStocks[i] = rod;
            } else if (type.equals(typesOfSportStocks[6])) { // гиря
                Kettlebell kettlebell = new Kettlebell();
                kettlebell.init(scanner);
                sportStocks[i] = kettlebell;
            } else {
                System.out.println("Вы ввели неверно тип инвентаря.");
                --i;
            }
        }
        //
        for (int i = 0; i < sportStocks.length; ++i) {
            if (sportStocks[i].sportType == 1) { // мяч
                if (sportStocks[i].name.equals(typesOfSportStocks[2])) { // тенисный мяч
                    System.out.println(sportStocks[i].toString());
                }
            } else if (sportStocks[i].sportType == 2) { // ракетка
                if (sportStocks[i].name.equals(typesOfSportStocks[3])) { // ракетка
                    System.out.println(sportStocks[i].toString());
                }
            }
        }
        //
        scanner.close();
    }
}