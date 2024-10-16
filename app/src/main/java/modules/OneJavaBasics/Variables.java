package modules.OneJavaBasics;

public class Variables {
    public static void variables() {
        System.out.println("переменные нужны для использования в любой части программы");
        var greeting = "Father!";
        System.out.println(greeting + "<- Это выведено с помощью переменной");
        System.out.println("Для имени переменной используется любой набор допустимых символов, к которым относятся "
                + "буквы английского алфавита, цифры, знак _");
        System.out.println("При этом цифру нельзя ставить в начале");
        System.out.println("Имена переменных регистрозависимы, то есть имя hello и имя heLLo - это два разных имени и "
                + "две переменные");
        greeting = "Mother!";
        System.out.println(greeting + " <- Мы изменили переменную");
        System.out.println("Java — статически типизированный язык. Это значит, что тип переменной задается при \n"
                + "определении и больше не меняется.");
        System.out.println("\nЛюбая переменная может быть частью любого выражения. \n"
                + "В момент вычисления вместо имени переменной подставляется ее значение");
        System.out.println("\nВ отличие от переменных, в начале определения константы используют ключевое слово final"
                + "Оно сообщает компилятору запрет на изменение");
    }
}
