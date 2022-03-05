package ru.skypro;

public class Main {

    public static void main(String[] args) {
// Задача 1
              byte aaa = 1;
              short  bbb = 2;
              int cсс = 3;
              long ddd = 4L;
              float eee = 3.45f;
              double fff = 2.34;



 // Задача 2



              float firstBoxerWeight = 78.2f;
              float secondBoxerWeight = 82.7f;
              float TotalWeight = firstBoxerWeight + secondBoxerWeight;
              float differenceOfWeight = secondBoxerWeight - firstBoxerWeight;
              System.out.println("Общий вес боксеров: " + TotalWeight);
              System.out.println("разница в весе боксеров: " + differenceOfWeight + "кг");

//  Задача 3

        byte oneBanana = 80;
        byte oneHandredMlOfMilk = 105;
        byte icecreamBrick = 100;
        byte egg = 70;
        int allBanana =  oneBanana * 5;
        int allMilk = oneHandredMlOfMilk * 2;
        int allIcecream =  icecreamBrick * 2;
        int allEgg = egg * 4;
        float breakfastInG = allBanana + allMilk + allIcecream + allEgg;
        float breakfastInKg = breakfastInG / 1000;
        System.out.println("Вес завтрака в граммах : " + breakfastInG);
        System.out.println("Вес завтрака в киллограммах : " + breakfastInKg);


// Задача 4



        float needWeightLoss = 7f;
        float oneDayweightLossOne = 0.25f;
        float oneDayweightLossTwo = 0.5f;
        float howDayNeedOne =  needWeightLoss / oneDayweightLossOne;
        float howDayNeedTwo = needWeightLoss / oneDayweightLossTwo;
        float dayAverage = (howDayNeedOne + howDayNeedTwo) / 2;

                System.out.println("Если худеть в день на 250 грамм то потребуется : " + howDayNeedOne + " дней");
                System.out.println("Если худеть в день на 500 грамм то потребуется : " + howDayNeedTwo + " дней");
                System.out.println("В среднем потребуется : " + dayAverage + " дней");

// Задача 5





        int mashaZp = 67760;
        int denisZp = 83690;
        int kristinaZp = 76230;
        float mashaZpTwo = 67760 * 1.1f;
        float denisZpTwo = 83690 * 1.1f;
        float kristinaZpTwo = 76230 * 1.1f;
        float mashaDifference = (mashaZpTwo - mashaZp) * 12;
        float denisDifference = (denisZpTwo - denisZp) * 12;
        float kristinaDifference = (kristinaZpTwo - kristinaZp) * 12;
        System.out.println("Маша теперь получает : " + mashaZpTwo + " Годовой доход вырос на : " + mashaDifference);
        System.out.println("Денис теперь получает : " + denisZpTwo + " Годовой доход вырос на : " + denisDifference);
        System.out.println("Кристина теперь получает : " + kristinaZpTwo + " Годовой доход вырос на : " + kristinaDifference);




        // Задача 6

        int aaaa = 12;
        int bbbb = 27;
        int cccc = 44;
        int dddd = 15;
        int eeee = 9;
        int result = aaaa * (bbbb + (cccc - dddd * eeee));
        System.out.println(result - result - result);

        // Задача 7


        int aa = 5;
        int ba = 7;
        ba = ba * aa / (aa = (aa * ba) / aa);
        System.out.println(aa);
        System.out.println(ba);


        // Задача 8


        int a = 256;
        int c = a / 10;
        int b = c % 10;

        System.out.println(b);



    }
}
