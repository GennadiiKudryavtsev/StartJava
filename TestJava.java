public class TestJava {

    public static void main(String[] args) {

        int num1 = 899;
        int num2 = 999;

        int num3 = num1 / 100;
        int num4 = num1 % 100 / 10;
        int num5 = num1 % 100 % 10;

        int num6 = num2 / 100;
        int num7 = num2 % 100 / 10;
        int num8 = num2 % 100 % 10;

        if (num5 != num6 && num4 != num6 && num5 != num8) {
            System.out.println("Между числами " + num1 + " и " + num2 + " отсутствуют одинаковые цифры:");
        } else {
            System.out.println("Между числами " + num1 + " и " + num2 + " одинаковые цифры:");
            if (num3 == num6) {
                System.out.println("- в первом разряде " + num3);
            } 
            if (num4 == num7) {
                System.out.println("- во втором разряде " + num4);
            }
            if (num5 == num8) {
                System.out.println("- в третьем разряде " + num5);
            } 
        }


        int i = 2;
        int result = 1;
        while(i <= 5) {
            result = result + i;
            if (result % 2== 0) {
                System.out.println("Число " + result + " является четным");
            } else {
                System.out.println("Число " + result + " является нечетным");
            }
            i++;
        }
    }
}
