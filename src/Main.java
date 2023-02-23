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
    public static void task1(){
        byte banana = 50;
        System.out.println("бананов " + banana + "кг");
        short apple = 1500;
        System.out.println("яблок " + apple + " кг");
        int orande = 55000;
        System.out.println("фпельсинов " + orande +"кг");
        long peach = 10500000L;
        System.out.println("персиков " + peach + "кг" );
        float peachLeft = 1.7896f;
        System.out.println("осталось персиков " + peachLeft + "кг");
        double appleLeft = 187.78845;
        System.out.println("яблок осталось "+ appleLeft + "кг");}
    public static void task2(){
        double bottleVolume = 27.12;
        System.out.println("объем бутылки " + bottleVolume + "л");
        long buildingWeight = 987678965549L;
        System.out.println("вес здания " + buildingWeight + "кг");
        float pencils = 27.896f;
        System.out.println("карандашей " + pencils + "шт");
        int stones = 569;
        System.out.println("камней " +stones + "шт");
        short weather = -159;
        System.out.println("погода сегодня " +weather+ "градусов");
        char carsSell = 27897;
        System.out.println("машин продали " +carsSell + " в таких количествах");
        byte money = 67;
        System.out.println("денег осталось " +money + "р");}
    public static void task3(){
        byte lydmilaPavlovna = 23;
        short annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        long students = 480 / (lydmilaPavlovna + annaSergeevna + ekaterinaAndreevna) ;
        System.out.println(" на ученика расчитано " + students + "л");}
    public static void task4(){
        byte bottles = 16;
        int minutes = bottles / 2;
        System.out.println("в 1 минуту сделано  " + minutes + "шт бутылок");

        byte performanceBottles = 8;
        short inminutes =  20;
        int day = 1440;
        char threeDays = 4320;
        long month = 43200L;
        float totalTime = (inminutes + day + threeDays + month) * performanceBottles;
        System.out.println("за 48 980 минут машина произвела "+ totalTime + " штук бутылок");}
     public static void task5(){
        byte paints = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        long howManyClass = paints / (brownPaint + whitePaint);
        System.out.println("в школе где "+ howManyClass + " классов");
        int classes = 20;
        int white = 2;
        long howMonyWhite = classes * white;
        System.out.println("нужно " + howMonyWhite + " банок белой краски");
        long oneClass = 20L;
        long brown = 4L;
        long howMonyBrowm = oneClass * brown;
        System.out.println("и " + howMonyBrowm +" банок коричневой краски");}
    public static void task6(){
        int bananas = 5 * 80;
        int milk = (200 / 100) * 105;
        int iceCream = 2 * 100;
        int eggs = 4*70;
        long cocktail = bananas + milk + iceCream + eggs;
        float cocktailKg = bananas + eggs + milk + iceCream;
        System.out.println("количество граммов " + cocktail + " спортзавтрака, и " + cocktailKg + " в кг");}
     public static void  task7(){
        byte loseWeing = 7;
        float athleteWeing = 7 / 250f;
        float weing = 7 / 500f;
        long generalWeing = 250 + 500L;
        float weingTwo =  generalWeing / 2f;
        float onAverageDays = loseWeing / weingTwo;
        System.out.println("если  будет худеть на 250г "+ athleteWeing + " понадобиться дней, а если 500г " + weing +  " понадобиться дней, в среднем" + onAverageDays );}
    public static void task8(){
        int maha = 67760;
        int interestMaha = maha /10;
        int interest = maha + 6776;
        int yearSalary = 6776 * 12;
     System.out.println( "Маша теперь получвет " + interest + "рублей. Годовой доход вырос на " + yearSalary + "рублей");
     int denis = 83690;
     int interestDenis = denis / 10;
     int interestTwo = denis + 8369;
     int yearSalareDenis = 8369  * 12;
     System.out.println("Денис теперь получает " + interestTwo + " рублей. Годовой доход вырос на " +yearSalareDenis + "рублей"  );
     int kristina = 76230;
     int interestKristina = kristina / 10;
     int interestThree = kristina + 7623;
     int yearSalareKristina = 7623 * 12;
     System.out.println("Кристина теперь получает " + interestThree + "рублей. Годовой доход вырос на " + yearSalareKristina + "рублей" );


















    }
}