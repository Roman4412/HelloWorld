public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!1");
        // 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // 2
        dog += 4;
        cat += 4 ;
        paper +=4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // 4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend = friend/2;
        System.out.println(friend);
        // 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        // 6
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var weightGeneral = firstFighter + secondFighter;
        System.out.println("Общий вес двух бойцов " + weightGeneral + " кг!");
        var weightDifference = Math.abs(firstFighter-secondFighter);
        System.out.println("Разница в весе " + weightDifference + " кг!");
        // 7
        weightDifference = secondFighter - firstFighter;
        weightDifference = secondFighter % firstFighter;
        // 8
        var totalHours = 640;
        var hoursForPerson = 8;
        var totalPerson = totalHours / hoursForPerson;
        System.out.println("Всего работников в компании - " + totalPerson + " человек");

        totalPerson += 94;
        totalHours = hoursForPerson * totalPerson;
        System.out.println("Если в компании работает " + totalPerson + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}