public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");

        byte modelMac = 13;
        short memory = 8;
        int disk= 256;
        long graphics = 6501536;
        float processor = 3.1f;
        double version = 10.14;
        char ch = 'M';
        boolean quality = true;

        System.out.println("Модель mac = " + modelMac);
        System.out.println("Память = " + memory);
        System.out.println("Память на диске = " + disk);
        System.out.println("Графика = " + graphics);
        System.out.println("Процессор = " + processor);
        System.out.println("Номер версии = " + version);
        System.out.println("Первая буква устройства = " + ch);
        System.out.println("Качество = " + quality);
        System.out.println("");

        System.out.println("2. Расчет стоимости товара со скидкой");

        int pen = 100;
        int book = 200;
        int sumDiscount = (pen + book) * 11/100;
        int sumWithDiscount = pen + book - sumDiscount;

        System.out.println(sumDiscount);
        System.out.println(sumWithDiscount);
        System.out.println("");

        System.out.println("3. Вывод слова JAVA");

        System.out.println("   J    a  V     V  a");
        System.out.println("   J   a a  V   V  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println("");

        System.out.println("4. Вывод min и max значений целых числовых типов");

        byte b = 126;
        short sh = 32766;
        int in = 2147483646;
        long ln = 9223372036854775806L;

        System.out.println(b);
        System.out.println(++b);
        System.out.println(--b);

        System.out.println(sh);
        System.out.println(++sh);
        System.out.println(--sh);

        System.out.println(in);
        System.out.println(++in);
        System.out.println(--in);

        System.out.println(ln);
        System.out.println(++ln);
        System.out.println(--ln);
        System.out.println("");

        System.out.println("5. Перестановка значений переменных");

        int t = 2;
        int f = 5;
        System.out.println("- с помощью третьей переменной");
        int p = t;
        t = f;
        f = p; 
        System.out.println(t + "" + '\n' + f + '\n');

        System.out.println("- с помощью арифметических операций");
        t = t + f; // 5 + 2 = 7
        f = t - f; // 7 - 2 = 5
        t = t - f; // 7 - 5 = 2
        System.out.println(t + "" + '\n' + f + '\n');

        System.out.println("- с помощью арифметических операций");
        t = t ^ f;
        f = t ^ f;
        t = t ^ f;
        System.out.println(t + "" + '\n' + f + '\n');

        System.out.println("6. Вывод символов и их кодов");

        char a = '"';
        char o = '&';
        char c = '@';
        char d = '^';
        char e = '_';
        System.out.println("35 = " + a + '\n' + "38 = " + o + '\n' + 
            "64 = " + c + '\n' + "94 = " + d + '\n' + "95 = " + e + '\n');

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");

        char sim = '/';
        char sim1 = '\\';
        char sim2 = '_';
        char sim3 = '(';
        char sim4 = ')';
        System.out.println("    " + sim + sim1);
        System.out.println("   " + sim + "  " + sim1);
        System.out.println("  " + sim + sim2 + sim3 + " " + sim4 + sim1);
        System.out.println(" " + sim + "      " + sim1);
        System.out.println(sim + "" + sim2 + sim2 + sim2 + sim2 + sim + 
            sim1 + sim2 + sim2 + sim1 + '\n');

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");

        int num = 123;
        int num2 = num % 1000 / 100;
        int num3 = num % 100 / 10;
        int num4 = num % 10;
        int numSum = num2 + num3 + num4;
        int numPro = num2 * num3 * num4;
        System.out.println("Число 123 содержит:\n" + num2 + " сотен\n"
                + num3 + " десятков\n" + num4 + " единиц\n" 
                + "Сумма его цифр = " + numSum + '\n' 
                + "Произведение = " + numPro + '\n');

        System.out.println("9. Вывод времени");

        int sec = 86399;
        int h = sec / 3600;
        int min = (sec % 3600) / 60;
        int second = sec % 60;
        System.out.println(h + ":" + min + ":" + second + '\n');
    }
}