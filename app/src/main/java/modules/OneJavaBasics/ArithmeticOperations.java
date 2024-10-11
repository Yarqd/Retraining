package modules.OneJavaBasics;

public class ArithmeticOperations {
    public static void arithmeticOperations() {
        System.out.println("Операции:\n"
                + "* — умножение\n"
                + "/ — деление\n"
                + "- — вычитание\n"
                + "% — остаток от деления\n");
        System.out.println(8 / 2); //делениt
        System.out.println(3 * 3 * 3); //возведениt в степень
        System.out.println(7 % 2); //вычислениt остатка от деления
        System.out.println("Оператор — просто символ, который выполняет операцию, например, сложение:\n" +
                "System.out.println(8 + 2);\n"
                + "В этом примере + — это оператор, а числа 8 и 2 — это операнды.\n"
                + "System.out.println(-3); // => -3\n"
                + "Выше пример применения унарной операции к числу 3. Оператор «минус» перед тройкой говорит \n"
                + "интерпретатору — возьми число 3 и найди противоположное, то есть -3.\n"
                + "\n"
                + "Операции выполняются по очереди\n"
                + "В математике существуют разные виды чисел, например:\n"
                + "\n"
                + "Натуральные — это целые числа от 1 и больше\n"
                + "Рациональные — это числа с точкой, например, 0.5\n"
                + "С точки зрения устройства компьютеров, между этими видами чисел — пропасть. "
                + "Попробуем сложить два рациональных числа:\n"
                + "\n"
                + "0.2 + 0.1 = 0.3\n"
                + "А теперь посмотрим, что на это скажет Java:\n"
                + "\n"
                + "0.2 + 0.1; // 0.30000000000000004\n"
                + "Операция сложения двух рациональных чисел внезапно привела к неточному вычислению результата. "
                + "Тот же самый результат выдадут и другие языки программирования.\n"
                + "\n"
                + "Такое поведение обуславливается ограничениями вычислительных мощностей. В отличие от чисел, объем "
                + "памяти конечен — при этом бесконечное количество чисел требовало бы бесконечного количества памяти "
                + "для своего хранения.\n"
                + "\n"
                + "С натуральными числами эта проблема решается простым ограничением по верхней границе. Есть "
                + "некоторое максимальное число, которое можно ввести:\n"
                + "\n"
                + "System.out.println(Integer.MAX_VALUE);\n"
                + "// => 2147483647\n"
                + "С рациональными числами такой финт не пройдет. Дело в том, что они не выстроены в непрерывную "
                + "цепочку, между 0.1 и 0.2 лежит бесконечное множество чисел.\n"
                + "\n"
                + "А как тогда хранить рациональные числа? Подавляющее число языков программирования в этом случае "
                + "опирается на единый стандарт, который описывает, как организовывать память в таких случаях.\n"
                + "\n"
                + "Разработчикам важно понимать, что операции с плавающими числами неточны, но эту точность можно "
                + "регулировать. Это значит, что при решении задач с подобными числами необходимо прибегать к "
                + "специальным трюкам, которые позволяют добиться необходимой точности.");

        System.out.println((-8)/(-4));
        System.out.println(100%3);
        System.out.println((-8)/(-4)+100%3);
    }
}
