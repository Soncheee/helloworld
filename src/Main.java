public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var summaryWeight = secondBoxer + firstBoxer;
        System.out.println(summaryWeight);
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println(weightDifference);
        var remFromDivWeight = secondBoxer % firstBoxer;
        System.out.println(remFromDivWeight);
        var sumHours = 640;
        var hoursPerEmployee = 8;
        var employees = sumHours / hoursPerEmployee;
        System.out.println("Всего работников в компании" + employees + "человек");
        employees = employees + 94;
        var newSumHours = employees * hoursPerEmployee;
        System.out.println("Если в компании работает" + employees + "человек, то всего" + newSumHours + "часов работы может быть поделено между сотрудниками");
    }


}


