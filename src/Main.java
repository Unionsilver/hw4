public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 30;
        if (age >= 18) {
            System.out.println("сообщение о том, что человеку 18 или больше лет");
        } else {
            System.out.println("сообщение, что возраст совершеннолетия еще не наступил и нужно немного подождать.");
        }
    }

    public static void task2() {
        int temperature = -5;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }


    public static void task3() {
        int speed = 60;
        if (speed > 60) {
            System.out.println("скорость превышена, если она больше 60 км/ч");
        } else {
            System.out.println("превышения скорости нет, если она меньше 60 км/ч.");
        }
    }


    public static void task4() {
        int age = 10;

        if (age < 2) {
            System.out.println("возраст человека  " + age + ", то ему пора спать");
        }
        else if (age >= 2 && age <= 6) {
            System.out.println("возраст человека " + age + ",то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 18) {
            System.out.println("возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        else if (age >= 18 && age < 24) {
            System.out.println("возраст человека больше " + age + ", то его место в университете");
        }
        else if (age >= 24 && age < 60){
            System.out.println("возраст человека равен " + age + ",  то ему пора ходить на работу.");
        }
        if  (age >= 60) {
            System.out.println("возраст человека равен " + age + ",  то он может отдохнуть.");
        }

    }


    public static void task5() {
        int age = 5;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя катать на атракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
        }
    }


    public static void task6() {
        int trainTotal = 102;
        int seatSpace = 60;
        int peopleSeatOnTrain = 40;
        if (peopleSeatOnTrain >= 0 && peopleSeatOnTrain < 60) {
            seatSpace = seatSpace - peopleSeatOnTrain;
            peopleSeatOnTrain = trainTotal - peopleSeatOnTrain;
            System.out.println(peopleSeatOnTrain + " места осталось всего! Из них осталось " + seatSpace + " сидячих мест!");
        } else if (peopleSeatOnTrain >= seatSpace && peopleSeatOnTrain <= trainTotal) {
            peopleSeatOnTrain = trainTotal - peopleSeatOnTrain;
            System.out.println("Мест сидячих не осталось! осталось " + peopleSeatOnTrain + " стоячих места! поторопитесь!");

        } else {
            System.out.println("Мест нету! попробуйте выбрать другую дату!!");
        }
    }


    public static void task7() {
        int one = 130;
        int two = 130;
        int tree = 19;
        if (one >= two && one >= tree) {
            System.out.println("Число " + one + " больше остальный чисел");
        } else if (two >= one && two >= tree) {
            System.out.println("Число " + two + " больше остальный чисел");
        } else {
            System.out.println("Число " + tree + " больше остальный чисел");
        }
    }
}