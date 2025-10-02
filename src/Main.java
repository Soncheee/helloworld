//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println(i);

        }
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        for (int i = 1904; i <= 2096; i = i +4) {
            System.out.println(i + " год является високосным");
        }
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total  = total + 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2  = total2 + total2/100;
            total2 = total2 + 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total2 + " рублей");
        }
        int two  = 2;
        int multiplication = 0;
        for (int i = 1; i <= 10; i++) {
            multiplication  = two * i;
            System.out.println(i + " * " + two + " = " + multiplication);
        }
    }
}
