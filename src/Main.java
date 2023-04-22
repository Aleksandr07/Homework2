public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух боксеров " + totalWeight + " кг");
        var differentWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами боксеров " + differentWeight + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var differentWeight1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами боксеров(первый способ) " + differentWeight1 + " кг");
        var differentWeight2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница между весами боксеров(второй способ) " + differentWeight2 + " кг");
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalWorkingTime = 640;
        var oneWorkerWorkingTime = 8;
        var numberOfWorkers = totalWorkingTime / oneWorkerWorkingTime;
        System.out.println("Всего работников в компании - " + numberOfWorkers + " человек");
        var numberOfWorkers2 = numberOfWorkers + 94;
        var totalWorkingTime2 = numberOfWorkers2 * 8;
        System.out.println("Если в компании работает " + numberOfWorkers2 + " человек, то всего " + totalWorkingTime2 +
                " часов работы может быть поделено между сотрудниками");
    }


}