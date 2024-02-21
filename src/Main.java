public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Task 2");
        var incrementDog = dog + 4;
        var incrementCat = cat + 4;
        var incrementPaper = paper + 4;
        System.out.println(incrementDog);
        System.out.println(incrementCat);
        System.out.println(incrementPaper);

        System.out.println("Task 3");
        var decrementDog = dog - 3.5;
        var decrementCat = cat - 1.6;
        var decrementPaper = paper - 7639;
        System.out.println(decrementDog);
        System.out.println(decrementCat);
        System.out.println(decrementPaper);

        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Task 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);
        var deltaWeight = Math.abs(firstBoxerWeight - secondBoxerWeight);
        System.out.println(deltaWeight);

        System.out.println("Task 7");
        var remainderOfDivision = secondBoxerWeight % firstBoxerWeight;
        System.out.println(remainderOfDivision);

        System.out.println("Task 8");
        var totalTime = 640;
        var workTimeOfDay = 8;
        var countOfEmployee = totalTime / workTimeOfDay;
        System.out.println("Всего работников в компании " + countOfEmployee + " человек");
        var newCountOfEmployee = countOfEmployee + 94;
        var newTotalTime = workTimeOfDay * newCountOfEmployee;
        System.out.println("Если в компании работает " + newCountOfEmployee +
                " человек, то всего " + newTotalTime + " часов работы может быть поделено между сотрудниками");
    }
}
