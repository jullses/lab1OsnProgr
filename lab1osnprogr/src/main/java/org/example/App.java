package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //HELLO
        System.out.println( "HELLO!" );

        //SQUARE
        for (int j = 0; j < 3; j++) {
            //перехід на нову строку
            System.out.println();
            for (int i = 0; i < 3; i++) {
                //рисуємо квадрат
                System.out.print("* ");

            }
        }

        //ANKETA
        System.out.println("Прізвище : Гудкова");
        System.out.println("Ім'я  : Юлія");
        System.out.println("По батькові  : Артемівна");
        System.out.println("Cтать : Жіноча");
        System.out.println("День народження : 2004-08-11");
        System.out.println("Адреса : Дніпро Старомостова площа");
        System.out.println("Номер телефону : 0731090986");
        System.out.println("Місце навчання : ФПМ ДНУ");
        System.out.println("Група : ПЗ-21-3");
        System.out.println("Хобі : програмування");

     }
}
