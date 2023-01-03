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

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;

        System.out.println("Максимальное число типа byte = " + maxByte + "" + '\n' 
                + "Увеличили максимальное число типа byte на 1 = " 
                + ++maxByte + "" + '\n' + "Уменьшили максимальное число типа byte на 1 = " 
                + --maxByte + "" + '\n' + "Максимальное число типа short = " + maxShort + "" + '\n' 
                + "Увеличили максимальное число типа short на 1 = " + ++maxShort + "" + '\n' 
                + "Уменьшили максимальное число типа short на 1 = " + --maxShort + "" + '\n'
                + "Максимальное число типа int = " + maxInt + "" + '\n' + "Увеличили максимальное число типа int на 1 = " 
                + ++maxInt + '\n' + "" +"Уменьшили максимальное число типа int на 1 = " + --maxInt + '\n' + ""
                + "Максимальное число типа long = " + maxLong + "" + '\n' + "Увеличили максимальное число типа long на 1 = " 
                + ++maxLong + "" + '\n' + "Уменьшили максимальное число типа long на 1 = " + --maxLong + '\n');

        System.out.println("5. Перестановка значений переменных");

        int num1 = 2;
        int num2 = 5;
        System.out.println("- с помощью третьей переменной");
        int tmp = num1;
        num1 = num2;
        num2 = tmp; 
        System.out.println(num1 + "" + '\n' + num2 + '\n');

        System.out.println("- с помощью арифметических операций");
        num1 += num2; // 5 + 2 = 7
        num2 = num1 - num2; // 7 - 2 = 5
        num1 -= num2; // 7 - 5 = 2
        System.out.println(num1 + "" + '\n' + num2 + '\n');

        System.out.println("- с помощью арифметических операций");
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println(num1 + "" + '\n' + num2 + '\n');

        System.out.println("6. Вывод символов и их кодов");

        char symbol35 = 35;
        char symbol38 = 38;
        char symbol64 = 64;
        char symbol94 = 94;
        char symbol95 = 95;
        System.out.println("Символ кода 35 = " + symbol35 + '\n' + "Символ кода 38 = " + symbol38 + '\n' 
                + "Символ кода 64 = " + symbol64 + '\n' + "Символ кода 94 = " + symbol94 + '\n' 
                + "Символ кода 95 = " + symbol95 + '\n');

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char doubleBackslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + doubleBackslash);
        System.out.println("   " + slash + "  " + doubleBackslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + doubleBackslash);
        System.out.println(" " + slash + "      " + doubleBackslash);
        System.out.println(slash + "" + underscore + underscore + underscore + underscore + slash + 
                doubleBackslash + underscore + underscore + doubleBackslash + '\n');

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");

        num1 = 123;
        int hundreds = num1 / 100;
        int tens = num1 % 100 / 10;
        int ones = num1 % 10;
        int sumDigits = hundreds + tens + ones;
        int prodDigits = hundreds * tens * ones;
        System.out.println("Число 123 содержит:\n" + hundreds + " сотен\n"
                + tens + " десятков\n" + ones + " единиц\n" 
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