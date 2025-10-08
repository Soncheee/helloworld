public class Main {
    public static void main(String[] args) {
        int firstFriday = 1;
        int days = 0;
        for (; firstFriday < 31; firstFriday += 7) {
            days++;
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }

        int distance = 0;
        do {
            System.out.println("Держитесь! Осталось " + (42195 - distance) + " метров");
            distance += 500;
        } while (distance <= 42195);

        int distance2 = 0;
        for (; distance2 <= 42195; distance2 += 500) {
            System.out.println("Держитесь! Осталось " + (42195 - distance2) + " метров");
        }

        int currentDay = 1;
        int money = 500;
        for (; money > 0; ) {
            if (currentDay % 5 == 0) {
                currentDay++;
                continue;
            }
            System.out.println("День " + currentDay + " Сумма " + money);
            money -= 100;
            currentDay++;
        }

        System.out.println();

        int day = 1;
        int summ = 500;
        while (summ > 0) {
            if (day % 5 == 0) {
                day++;
                continue;
            }
            System.out.println("День " + day + " Сумма " + summ);
            summ -= 100;
            day++;
        }

        System.out.println();

        int month = 0;
        double total = 0;
        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total *= 1.07;
            }
            System.out.printf("Месяц %d Сумма %.0f %n", month, total);
            if (total >= 12000000) {
                break;
            }
        }

        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100) {
            minute++;
            charge += 2;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев");
            }
            if (overheats > 3) {
                System.out.println("Досрочное завершение");
                break;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}