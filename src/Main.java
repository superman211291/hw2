public class Main {
    public static void main(String[] args) {
        //задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        // задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // задача 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        //Задача №6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println(firstBoxerWeight + secondBoxerWeight);
        System.out.println(secondBoxerWeight - firstBoxerWeight);
        // Задача 7
        var first = secondBoxerWeight - firstBoxerWeight;
        var second = secondBoxerWeight % firstBoxerWeight;
        // задача 8
        var workTime = 640;
        var workerWorkTime = 8;
        var workers = workTime / workerWorkTime;
        System.out.println("Всего работников в компании — " + workers + " человек");
        workers += 94;
        workTime = workers * workerWorkTime;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workTime + " часов работы может быть поделено между сотрудниками");
    }
}