public class Main {
    public static void main(String[] args) {
        int total = 0;
        int months = 0;
        while (total <= 2_459_000) {
            months = months + 1;
            total = total + 15_000;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + total + " рублей");

        }
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        int a = 11;
        while (a > 1) {
            a = a - 1;
            System.out.print(a + " ");
        }
        System.out.println();
        int born = 17;
        int death = 8;
        var growing = born - death;
        int people = 12_000_000;
        int years = 0;
        while (years < 10) {
            years++;
            people += (people / 1000) * growing;
            System.out.println("Год " + years + ", численность населения составляет " + people);
        }
        System.out.println();
        int deposit = 15_000;
        months = 0;
        int bankPercents = 7;
        while (deposit < 12_000_000) {
            months++;
            deposit += ((deposit / 1000) * bankPercents);
            System.out.println("Месяц " + months + ", накопления по вкладу " + deposit);

        }
        System.out.println();
        int dep = 15_000;
        int month = 0;
        int percents = 7;
        while (dep < 12_000_000) {
            month++;
            dep += ((dep / 1000) * percents);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопления по вкладу " + dep);
            }
        }
        System.out.println();
        int deposit2 = 15_000;
        int month2 = 0;
        int monthsToYears = 12 * 9;
        int percent = 7;
        while (month2 < monthsToYears) {
            month2++;
            deposit2 += ((deposit2 / 1000) * percent);
            if (month2 % 6 == 0) {
                System.out.println(deposit2);
            }
        }
        System.out.println();
        int number = 5;
        while (number < 31) {
            System.out.println("Сегодня пятница, " + number + " число. Необходимо подготовить отчет");
            number = number + 7;
        }
        int now = 2025;
        int startYear = now - 200;
        int endYear = now + 100;
        int firstCometYear = startYear;
        while (firstCometYear % 79 != 0) {
            firstCometYear++;
        }
        for (int year = firstCometYear; year <= endYear; year += 79) {
            if (year >= startYear && year <= endYear) {
                System.out.println(year);
            }
        }

    }
}
