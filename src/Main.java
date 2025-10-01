public class Main {
    public static void main(String[] args) {
        short clientDeviceYear = 2015;
        char clientOS = 0;
        byte monthNumber = 12;
        byte deliveryDistance = 95;

        if (clientDeviceYear >= 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        } else if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        }

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставки нет");
        }

        if (monthNumber == 0 || monthNumber > 12) {
            System.out.println("Нет месяца с таким номером");
        } else {
            switch (monthNumber) {
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Весна");
                    break;
                case 4:
                    System.out.println("Весна");
                    break;
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                    System.out.println("Лето");
                    break;
                case 7:
                    System.out.println("Лето");
                    break;
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Осень");
                    break;
                case 10:
                    System.out.println("Осень");
                    break;
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
                    break;
            }
        }
    }
}

