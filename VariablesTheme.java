public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");

        byte modelMac = 13;
        short memory = 8;
        int disk = 256;
        long graphics = 6501536;
        float processor = 3.1f;
        double version = 10.14;
        char ch = 'M';
        boolean quality = true;

        System.out.println("Модель mac = " + modelMac + '\n' + "Память = " + memory + '\n'
                + "Память на диске = " + disk + '\n' + "Графика = " + graphics + '\n'
                + "Процессор = " + processor + '\n' + "Номер версии = " + version + '\n'
                + "Первая буква устройства = " + ch + '\n' + "Качество = " + quality + '\n');

        System.out.println("2. Расчет стоимости товара со скидкой");

        int penPrice = 100;
        int bookPrice = 200;
        int discountSum = (penPrice + bookPrice) * 11 / 100;
        int discountPrice = penPrice + bookPrice - discountSum;

        System.out.println("Сумма скидки = " + discountSum + " " + '\n' + "Общая стоимость товаров со скидкой = " 
                + discountPrice + '\n');

        System.out.println("3. Вывод слова JAVA");

        System.out.println("   J    a  V     V  a\n"
                + "   J   a a  V   V  a a\n" 
                + "J  J  aaaaa  V V  aaaaa\n"
                + " JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");

        byte valueByte = 127;
        short valueShort = 32767;
        int valueInt = 2147483647;
        long valueLong = 9223372036854775807L;

        System.out.println("Максимальное число типа byte = " + valueByte + "" + '\n' 
                + "Увеличили максимальное число типа byte на 1 = " 
                + ++valueByte + "" + '\n' + "Уменьшили максимальное число типа byte на 1 = " 
                + --valueByte + "" + '\n' + "Максимальное число типа short = " + valueShort + "" + '\n' 
                + "Увеличили максимальное число типа short на 1 = " + ++valueShort + "" + '\n' 
                + "Уменьшили максимальное число типа short на 1 = " + --valueShort + "" + '\n'
                + "Максимальное число типа int = " + valueInt + "" + '\n' + "Увеличили максимальное число типа int на 1 = " 
                + ++valueInt + '\n' + "" +"Уменьшили максимальное число типа int на 1 = " + --valueInt + '\n' + ""
                + "Максимальное число типа long = " + "" + '\n' + "Увеличили максимальное число типа long на 1 = " 
                + ++valueLong + "" + '\n' + "Уменьшили максимальное число типа long на 1 = " + --valueLong + '\n');

        System.out.println("5. Перестановка значений переменных");

        int firstVariable = 2;
        int secondVariable = 5;
        System.out.println("- с помощью третьей переменной");
        int thirdVariable = firstVariable;
        firstVariable = secondVariable;
        secondVariable = thirdVariable; 
        System.out.println(firstVariable + "" + '\n' + secondVariable + '\n');

        System.out.println("- с помощью арифметических операций");
        firstVariable = firstVariable + secondVariable; // 5 + 2 = 7
        secondVariable = firstVariable - secondVariable; // 7 - 2 = 5
        firstVariable = firstVariable - secondVariable; // 7 - 5 = 2
        System.out.println(firstVariable + "" + '\n' + secondVariable + '\n');

        System.out.println("- с помощью арифметических операций");
        firstVariable = firstVariable ^ secondVariable;
        secondVariable = firstVariable ^ secondVariable;
        firstVariable = firstVariable ^ secondVariable;
        System.out.println(firstVariable + "" + '\n' + secondVariable + '\n');

        System.out.println("6. Вывод символов и их кодов");

        System.out.println("Символ кода 35 = " + (char) 35 + '\n' + "Символ кода 38 = " + (char) 38 + '\n' 
                + "Символ кода 64 = " + (char) 64 + '\n' + "Символ кода 94 = " + (char) 94 + '\n' 
                + "Символ кода 95 = " + (char) 95 + '\n');

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");

        char symbol1 = '/';
        char symbol2 = '\\';
        char symbol3 = '_';
        char symbol4 = '(';
        char symbol5 = ')';
        System.out.println("    " + symbol1 + symbol2);
        System.out.println("   " + symbol1 + "  " + symbol2);
        System.out.println("  " + symbol1 + symbol3 + symbol4 + " " + symbol5 + symbol2);
        System.out.println(" " + symbol1 + "      " + symbol2);
        System.out.println(symbol1 + "" + symbol3 + symbol3 + symbol3 + symbol3 + symbol1 + 
                symbol2 + symbol3 + symbol3 + symbol2 + '\n');

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");

        int value123 = 123;
        int hundredValue = value123/ 100;
        int tenValue = value123 % 100 / 10;
        int unitValue = value123 % 10;
        int sumDigits = hundredValue + tenValue + unitValue;
        int prodDigits = hundredValue * tenValue * unitValue;
        System.out.println("Число 123 содержит:\n" + hundredValue + " сотен\n"
                + tenValue + " десятков\n" + unitValue + " единиц\n" 
                + "Сумма его цифр = " + sumDigits + '\n' 
                + "Произведение = " + prodDigits + '\n');

        System.out.println("9. Вывод времени");

        int sec = 86399;
        int hour = sec / 3600;
        int min = (sec % 3600) / 60;
        int second = sec % 60;
        System.out.println(hour + ":" + min + ":" + second + '\n');
    }
}