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

        System.out.println("Модель mac = " + modelMac + "\nПамять = " + memory
                + "\nПамять на диске = " + disk + "\nГрафика = " + graphics 
                + "\nПроцессор = " + processor + "\nНомер версии = " + version 
                + "\nПервая буква устройства = " + ch + "\nКачество = " + quality + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");

        int penPrice = 100;
        int bookPrice = 200;
        int discountSum = (penPrice + bookPrice) * 11 / 100;
        int discountPrice = penPrice + bookPrice - discountSum;

        System.out.println("Сумма скидки = " + discountSum 
                + "\nОбщая стоимость товаров со скидкой = " + discountPrice + "\n");

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

        System.out.println("Максимальное число типа byte = " + maxByte 
                + "\nУвеличили максимальное число типа byte на 1 = " 
                + ++maxByte + "\nУменьшили максимальное число типа byte на 1 = " 
                + --maxByte + "\nМаксимальное число типа short = " + maxShort 
                + "\nУвеличили максимальное число типа short на 1 = " + ++maxShort 
                + "\nУменьшили максимальное число типа short на 1 = " + --maxShort 
                + "\nМаксимальное число типа int = " + maxInt 
                + "\nУвеличили максимальное число типа int на 1 = " 
                + ++maxInt + "\nУменьшили максимальное число типа int на 1 = " + --maxInt 
                + "\nМаксимальное число типа long = " + maxLong 
                + "\nУвеличили максимальное число типа long на 1 = " 
                + ++maxLong + "\nУменьшили максимальное число типа long на 1 = " + --maxLong 
                + "\n"); 

        System.out.println("5. Перестановка значений переменных");

        int num1 = 2;
        int num2 = 5;
        System.out.println("- с помощью третьей переменной");
        int tmp = num1;
        num1 = num2;
        num2 = tmp; 
        System.out.println(num1 + "\n" + num2);

        System.out.println("\n- с помощью арифметических операций");
        num1 += num2; // 5 + 2 = 7
        num2 = num1 - num2; // 7 - 2 = 5
        num1 -= num2; // 7 - 5 = 2
        System.out.println(num1 + "\n" + num2);

        System.out.println("\n- с помощью битовых операций");
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println(num1 + "\n" + num2 + "\n");

        System.out.println("6. Вывод символов и их кодов");

        char symbol35 = '#';
        char symbol38 = '&';
        char symbol64 = '@';
        char symbol94 = '^';
        char symbol95 = '_';
        System.out.println("Символ кода " + (int) symbol35 + " = " + symbol35 + "\nСимвол кода " 
                + (int) symbol38 + " = " + symbol38 + "\nСимвол кода " + (int) symbol64 + " = " 
                + symbol64 + "\nСимвол кода " + (int) symbol94 +" = " + symbol94 + "\nСимвол кода " 
                + (int) symbol95 + " = " + symbol95 + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis 
                + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + "" + underscore + underscore + underscore + underscore + slash 
                + backslash + underscore + underscore + backslash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");

        num1 = 123;
        int hundreds = num1 / 100;
        int tens = num1 % 100 / 10;
        int ones = num1 % 10;
        int sumDigits = hundreds + tens + ones;
        int prodDigits = hundreds * tens * ones;
        System.out.println("Число 123 содержит:\n" + hundreds + " сотен\n"
                + tens + " десятков\n" + ones + " единиц\n" 
                + "Сумма его цифр = " + sumDigits + "\n" 
                + "Произведение = " + prodDigits + "\n");

        System.out.println("9. Вывод времени");

        int sec = 86399;
        int hour = sec / 3600;
        int min = (sec % 3600) / 60;
        int second = sec % 60;
        System.out.println(hour + ":" + min + ":" + second + "\n");
    }
}