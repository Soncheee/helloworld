public class Main {
    public static void main(String[] args) {
        byte cat = 3;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        short dog = 5;
        System.out.println("Значение переменной dog с типом short равно " + dog);
        int people = 1000000;
        System.out.println("Значение переменной people с типом int равно " + people);
        long virus = 90000000;
        System.out.println("Значение переменной virus с типом long равно " + virus);
        float money = 3.01f;
        System.out.println("Значение переменной money с типом float равно " + money);
        double trees = 2.02478595;
        System.out.println("Значение переменной trees с типом double равно " + trees);

        float a = 27.12f;
        long b = 987_678_965_549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short lists = 480;
        var listPerStudent = lists / (firstClass + secondClass + thirdClass);
        System.out.println("На каждого ученика рассчитано " + listPerStudent + " листов бумаги");

        byte bottles = 16;
        byte minutes = 2;
        var productivity = bottles / minutes;
        byte twentyMin = 20;
        short day = 1440;
        short threeDays = 4320;
        int month = 43200;
        var bottlesPerTwentyMin = productivity * twentyMin;
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMin + " штук бутылок");
        var bottlesPerDay = productivity * day;
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        var bottlesPerThreeDays = productivity * threeDays;
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        var bottlesPerMonth = productivity * month;
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        byte sumCans = 120;
        byte whitePerClass = 2;
        byte brownPerClass = 4;
        var Classes = sumCans / (whitePerClass + brownPerClass);
        var whitePaint = whitePerClass * Classes;
        var brownPaint = brownPerClass * Classes;
        System.out.println("В школе, где " + Classes + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        byte oneBanana = 80;
        var bananas = 5 * oneBanana;
        byte mliters = 100;
        byte gramsForMilk = 105;
        var milk = (200/mliters) * gramsForMilk;
        byte brickets = 2;
        byte gramsForIceCream = 100;
        var iceCream = brickets * gramsForIceCream;
        byte oneEgg = 70;
        var eggs = 4 * oneEgg;
        var breakfastGrams = bananas + milk + iceCream + eggs;
        double brekfastKg = (double) breakfastGrams / 1000;
        System.out.println(breakfastGrams + "г");
        System.out.println(brekfastKg + "кг");

        int mashaMonth = 67760;
        int denisMonth = 83690;
        int christinaMonth = 76230;
        var mashaYearCurrent = mashaMonth * 12;
        var denisYearCurrent = denisMonth * 12;
        var christinaYearCurrent = christinaMonth * 12;
        mashaMonth  = mashaMonth + ((mashaMonth/100)*10);
        denisMonth = denisMonth + ((denisMonth/100)*10);
        christinaMonth = christinaMonth + ((christinaMonth/100)*10);
        var mashaYearDiff = (mashaMonth * 12) - mashaYearCurrent;
        var denisYearDiff = (denisMonth * 12) - denisYearCurrent;
        var christinaYearDiff = (christinaMonth * 12) - christinaYearCurrent;
        System.out.println("Маша теперь получает " + mashaMonth + " рублей. Годовой доход вырос на " + mashaYearDiff +" рублей");
        System.out.println("Денис теперь получает " + denisMonth + " рублей. Годовой доход вырос на " + denisYearDiff +" рублей");
        System.out.println("Кристина теперь получает " + christinaMonth + " рублей. Годовой доход вырос на " + christinaYearDiff +" рублей");
    }


}


