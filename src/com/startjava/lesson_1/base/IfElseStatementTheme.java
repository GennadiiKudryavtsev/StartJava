package com.startjava.lesson_1.base;

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
        } else {
            if (num % 2 == 0) {
                System.out.println("Число " + num + " четное");
            } else {
                System.out.println("Число " + num + " нечетное");
            }
            if (num > 0) {
                System.out.println("Число " + num + " положительное");
            } else {
                System.out.println("Число " + num + " отрицательное");
            }
        }   

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        num1 = 341;
        num2 = 123;
        int hundreds1 = num1 / 100;
        int tens1 = num1 / 10 % 10;
        int ones1 = num1 % 10;
        int hundreds2 = num2 / 100;
        int tens2 = num2 / 10 % 10;
        int ones2 = num2 % 10;

        if (hundreds1 != hundreds2 && tens1 != tens2 && ones1 != ones2) {
            System.out.println("Между числами " + num1 + " и " + num2 
                + " отсутствуют одинаковые цифры:");
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
        int historyPersent = 59;
        int programmingPersent = 91;
        int programingEvaluation;
        int historyEvaluation;
        if (historyPersent <= 60 && historyPersent >= 0) {
            historyEvaluation = 2;
            System.out.println("История - " + historyEvaluation);
        } else if (historyPersent > 60 && historyPersent <= 73) {
            historyEvaluation = 3;
            System.out.println("История - " + historyEvaluation);
        } else if (historyPersent > 73 && historyPersent <= 91) {
            historyEvaluation = 4;
            System.out.println("История - " + historyEvaluation);
        } else {
            historyEvaluation = 5;
            System.out.println("История - " + historyEvaluation);
        }
        if (programmingPersent <= 60 && programmingPersent >= 0) {
            programingEvaluation = 2;
            System.out.println("Программирование - " + programingEvaluation);
        } else if (programmingPersent > 60 && programmingPersent <= 73) {
            programingEvaluation = 3;
            System.out.println("Программирование - " + programingEvaluation);
        } else if (programmingPersent > 73 && programmingPersent <= 91) {
            programingEvaluation = 4;
            System.out.println("Программирование - " + programingEvaluation);
        } else {
            programingEvaluation = 5;
            System.out.println("Программирование - " + programingEvaluation);
        }
        int averagePercentage = (historyPersent + programmingPersent) / 2;
        System.out.println("Средний % по предметам - " + averagePercentage + " %");
        int averageScore = (programingEvaluation + historyEvaluation) / 2;
        System.out.println("Средний балл оценок по предметам = " + averageScore);

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
        int inBank100 = 10;
        int inBank10 = 5;
        int inBank1 = 50;
        int whichRequested100 = requestedSum / 100;
        int whichRequested10 = (requestedSum - whichRequested100) / 10 % 10;
        int whichRequested1 = requestedSum % 10;
        int sumInBank = inBank100 * 100 + inBank10 * 10 + inBank1;
        int countH100 = 0;
        int count10 = 0;
        int count1 = 0;
        if (sumInBank < requestedSum) {
            System.out.println("В банкомате не хватает банкнот!");
        } else {
            if (inBank100 < whichRequested100) {
                countH100 = inBank100;
                whichRequested10 += 
                    (whichRequested100 - inBank100) * 100 / 10;
            } else {
                countH100 = whichRequested100;
            }
            if (inBank10 > whichRequested10) {
                count10 = whichRequested10;
                if (inBank1 > whichRequested1) {
                    count1 = whichRequested1;
                    int sum = countH100 * 100 + count10 * 10 + count1;
                    if (sum == requestedSum) {
                        System.out.println("Банкомат выдает: \n" + countH100 + " - сотен\n" 
                            + count10 + " - десятков\n" + count1 + " - единиц\n" + "Всего - " 
                            + requestedSum);
                    } else {
                        System.out.println("Запрашиваемая сумма не может быть обработана");
                    }
                } else {
                    System.out.println("В банкомате не хватает банкнот!");
                }
            } else {
                whichRequested1 += (whichRequested10 - inBank10) * 10;
                count10 = inBank10;
                if (inBank1 > whichRequested1) {
                    count1 = whichRequested1;
                    int sum = countH100 * 100 + count10 * 10 + count1;
                    if (sum == requestedSum) {
                        System.out.println("Банкомат выдает: \n" + countH100 + " - сотен\n" 
                            + count10 + " - десятков\n" + count1 + " - единиц\n" + "Всего - " 
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