public class Main {
    public static void main (String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper); // task1
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper); // task2
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper); // task3
        var friend = 19;
        System.out.print("friend = ");
        System.out.println(friend);
        friend = friend + 2;
        System.out.print("friend = ");
        System.out.println(friend);
        friend = friend / 7;
        System.out.print("friend = ");
        System.out.println(friend); // task4
        var frog = 3.5;
        System.out.print("frog = ");
        System.out.println(frog);
        frog = frog * 10;
        System.out.print("frog = ");
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.print("frog = ");
        System.out.println(frog);
        frog = frog + 4;
        System.out.print("frog = ");
        System.out.println(frog); // task5
        System.out.println(" Задача №6");
            var weightBoxer1 = 78.2;
            var weightBoxer2 = 82.7;
            var summWeight = weightBoxer1 + weightBoxer2;
            System.out.println("Общий вес бойцов " + summWeight + " кг");
        System.out.println(" Задача №7");
            var diffBoxers = weightBoxer2 - weightBoxer1;
            System.out.println("Разница в весе между бойцами составляет " + diffBoxers + " кг, данная величина получилась вычитанием из большего веса меньшего веса");
            diffBoxers = weightBoxer2 % weightBoxer1;
        System.out.println("Разница в весе между бойцами составляет  " + diffBoxers + " кг, в расчете использовалась функция остатка от деления");
        System.out.println(" Задача №8");
        var summHour = 640;
        var oneWorker = 8;
        var countWorkers = summHour / oneWorker;
        System.out.println("1. Всего работников в компании - " + countWorkers + " человек");
        countWorkers = countWorkers + 94;
        summHour = countWorkers * oneWorker;
        System.out.println("2. Если в компании работает " + countWorkers + " человек, то всего " + summHour + " часов работы может быть поделено между сотрудниками");

    }
}