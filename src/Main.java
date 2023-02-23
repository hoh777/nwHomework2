public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        long threeDays = 4320L;
        Float month = 43.200f;
        float totalTime =  performanceBottles * ( month + threeDays + day + inminutes )   ;
        System.out.println("за 48 980 минут машина произвела "+ totalTime + " штук бутылок");













    }
}