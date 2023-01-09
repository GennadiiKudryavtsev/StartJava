public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 23;
        double height = 1.84;
        String gender = "male";

        if (age > 20) {
            System.out.println("Ты достаточно взрослый!");
        } else {
            System.out.println("Ты младше 20!");
        }

        if (gender != "male") {
            System.out.println("Ты девушка!");
        } else {
            System.out.println("Ты мужчина!");
        }

        if (height < 1.80) {
            System.out.println("Твой рост ниже 1.80 см!");
        } else {
            System.out.println("Твой рост выше 1.80 см! Пойдем играть в волейбол");
        }

        char capitalLetter = "Kate".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println("Ваше имя начинается на букву 'M'");
        } else if (capitalLetter == 'I') {
            System.out.println("Ваше имя начинается на букву 'I'");
        } else {
            System.out.println("Добро пожаловать агент " + capitalLetter 
                + "! Приятно познакомиться!");
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 9;
        int num2 = 32;
        if (num1 > num2) {
            System.out.println("Максимальным числом является " + num1);
            System.out.println("Минимальным числом является " + num2);
        } else if (num1 < num2) {
            System.out.println("Максимальным числом является " + num2);
            System.out.println("Минимальным числом является " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа\n");
        int num = 3;

        if (num == 0) {
            System.out.println("Число " + num + " является нулем");
        } else if (num % 2 == 0) {
            System.out.println("Число " + num + " является четным");
        } else {
            System.out.println("Число " + num + " является нечетным");
        }
        if (num > 0) {
            System.out.println("Число " + num + " является положительным");
        } else {
            System.out.println("Число " + num + " является отрицательным");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");

        num1 = 333;
        num2 = 123;
        int hundreds1 = num1 / 100;
        int tens1 = num1 % 100 / 10;
        int ones1 = num1 % 100 % 10;
        int hundreds2 = num2 / 100;
        int tens2 = num2 % 100 / 10;
        int ones2 = num2 % 100 % 10;

        if (hundreds1 != hundreds2 && tens1 != tens2 && ones1 != ones2) {
            System.out.println("Между числами " + num1 + " и " + num2 + " отсутствуют одинаковые цифры:");
        } else {
            System.out.println("Между числами " + num1 + " и " + num2 + " одинаковые цифры:");
            if (hundreds1 == hundreds2) {
                System.out.println("- в первом разряде " + hundreds1);
            } 
            if (tens1 == tens2) {
                System.out.println("- во втором разряде " + tens1);
            }
            if (ones1 == ones2) {
                System.out.println("- в третьем разряде " + ones1);
            } 
        }

        System.out.println("\n5. Определение символа по его коду\n");

        char ch = '\u0054';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " - это большая буква");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " - это маленькая буква");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " - это число");
        } else {
            System.out.println(ch + " - не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %\n");

        int depositSum = 300000;
        int percent = 5;

        if (depositSum >= 100000 && depositSum <= 300000) {
            percent = 7;
        } else if (depositSum > 300000) {
            percent = 10;
        }
        int totalDepositAmount = depositSum + depositSum * percent / 100;
        System.out.println("Сумма вклада = " + depositSum + "\n" + "Начисленный % = " 
            + percent + "\n" + "Итоговая сумма с % = " + totalDepositAmount);

        System.out.println("\n7. Определение оценки по предметам\n");

        int history = 59;
        int programming = 91;
        int averagePercentage = (history + programming) / 2;
        if (history <= 60 && history >= 0) {
            System.out.println("История - 2");
        } else if (history > 60 && history <= 73) {
            System.out.println("История - 3");
        } else if (history > 73 && history <= 91) {
            System.out.println("История - 4");
        } else {
            System.out.println("История - 5");
        }

        if (programming <= 60 && programming >= 0) {
            System.out.println("Программирование - 2");
        } else if (programming > 60 && programming <= 73) {
            System.out.println("Программирование - 3");
        } else if (programming > 73 && programming <= 91) {
            System.out.println("Программирование - 4");
        } else {
            System.out.println("Программирование - 5");
        }
        System.out.println("Средний % по предметам - " + averagePercentage + " %");
        if (averagePercentage <= 60 && averagePercentage >= 0) {
            System.out.println("Средний балл оценок по предметам - 2");
        } else if (averagePercentage > 60 && averagePercentage <= 73) {
            System.out.println("Средний балл оценок по предметам - 3");
        } else if (averagePercentage > 73 && averagePercentage <= 91) {
            System.out.println("Средний балл оценок по предметам - 4");
        } else {
            System.out.println("Средний балл оценок по предметам - 5");
        }

        System.out.println("\n8. Расчет прибыли за год\n");

        int income = 13000;
        int rent = 5000;
        int expenses = 9000;
        int annualProfit = (income - (rent + expenses)) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: " + "+" + annualProfit);
        } else {
            System.out.println("Прибыль за год: " + annualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот\n");

        int requestedSum = 567; 
        int countHungredesInBank = 10;
        int countTensInBank = 5;
        int countOnesInBank = 50;
        int countHungredesWhichRequested = requestedSum / 100;
        int countTensWhichRequested = (requestedSum - countHungredesWhichRequested * 100) / 10;
        int countOnesWhichRequested = requestedSum % 10;
        int sumInBank = countHungredesInBank * 100 + countTensInBank * 10 + countOnesInBank;
        int countHungredes = 0;
        int countTens = 0;
        int countOnes = 0;

        if (sumInBank < requestedSum) {
            System.out.println("В банкомате не хватает банкнот!");
        } else {
            if (countHungredesInBank < countHungredesWhichRequested) {
                countHungredes = countHungredesInBank;
                countTensWhichRequested += 
                    (countHungredesWhichRequested - countHungredesInBank) * 100 / 10;
            } else {
                countHungredes = countHungredesWhichRequested;
            }
            if (countTensInBank > countTensWhichRequested) {
                countTens = countTensWhichRequested;
                if (countOnesInBank > countOnesWhichRequested) {
                    countOnes = countOnesWhichRequested;
                    int sum = countHungredes * 100 + countTens * 10 + countOnes;
                    if (sum == requestedSum) {
                        System.out.println("Банкомат выдает: \n" + countHungredes + " - сотен\n" 
                            + countTens + " - десятков\n" + countOnes + " - единиц\n" + "Всего - " 
                            + requestedSum);
                    } else {
                        System.out.println("Запрашиваемая сумма не может быть обработана");
                    }
                } else {
                    System.out.println("В банкомате не хватает банкнот!");
                }
            } else {
                countOnesWhichRequested += (countTensWhichRequested - countTensInBank) * 10;
                countTens = countTensInBank;
                if (countOnesInBank > countOnesWhichRequested) {
                    countOnes = countOnesWhichRequested;
                    int sum = countHungredes * 100 + countTens * 10 + countOnes;
                    if (sum == requestedSum) {
                        System.out.println("Банкомат выдает: \n" + countHungredes + " - сотен\n" 
                            + countTens + " - десятков\n" + countOnes + " - единиц\n" + "Всего - " 
                            + requestedSum);
                    } else {
                        System.out.println("Запрашиваемая сумма не может быть обработана");
                    }
                } else {
                    System.out.println("В банкомате не хватает банкнот!");
                }
            }
        }
    }
}