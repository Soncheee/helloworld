public class Main {
    public static void main(String[] args) {
        byte age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        byte airTemp = 5;
        if (airTemp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        byte carSpeed = 70;
        if (carSpeed >= 60) {
            System.out.println("Если скорость " + carSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + ", то можно ездить спокойно");
        }
        byte age4 = 8;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        }
        else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        }
        else if (age >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в университет");
        }
        else if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить а работу");
        }
        byte attractionAge = 18;
        if (attractionAge < 5) {
            System.out.println("Если возраст ребенка равен "+ attractionAge + ", то ему нельзя кататься на аттракционе");
        }
        else if (attractionAge >=5 && attractionAge < 14) {
            System.out.println("Если возраст ребенка равен "+ attractionAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else if (attractionAge >= 14) {
            System.out.println("Если возраст ребенка равен "+ attractionAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        byte capacity = 102;
        byte seatingPlaces = 60;
        byte people = 25;
        if (people == capacity) {
            System.out.println("Вагон забит");
        }
        else if (people < capacity && people > seatingPlaces) {
            System.out.println("В вагоне " + (capacity - people) + " стоячих мест");
        }
        else if (people < capacity && people < seatingPlaces) {
            System.out.println("В вагоне " + (capacity - people) + " свободных мест, из них " + (seatingPlaces - people) + " сидячих мест");
        }
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && two >three) {
            System.out.println(one + " наибольшее число");
        }
        else if (two > one && one > three) {
            System.out.println(two + " наибольшее число");
        }
        else {
            System.out.println(three + " наибольшее число");
        }
    }

}

