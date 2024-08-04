public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 55000;
        System.out.println("Значение переменной a c типом int равно " + a);
        byte b = 100;
        System.out.println("Значение переменной b c типом byte равно " + b);
        short c = 30000;
        System.out.println("Значение переменной c c типом short равно " + c);
        long d = 90000000000L;
        System.out.println("Значение переменной d c типом long равно " + d);
        float f = -3.4f;
        System.out.println("Значение переменной f c типом float равно " + f);
        double g = 1.799999988;
        System.out.println("Значение переменной e c типом double равно " + g);


        float k = 27.12f;
        System.out.println(k);
        long l = 987678965549L;
        System.out.println(l);
        double m = 2.786;
        System.out.println(m);
        short n = 569;
        System.out.println(n);
        short o = -159;
        System.out.println(o);
        int p = 27897;
        System.out.println(p);
        byte r = 67;
        System.out.println(r);

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        int a4 = 480;
        System.out.println("На каждого ученика рассчитано " + a4 / (lp + as + ea) + " листов бумаги");

        byte bottle = 16;
        byte twominute = 2;
        byte oneminute = (byte) (bottle / twominute);
        System.out.println("За 20 минут машина произвела " + oneminute * 20 + " штук бутылок");
        int twentyminute = oneminute * 20;
        System.out.println("За сутки машина произвела " + (twentyminute * 3) * 24 + " штук бутылок");
        int day = (twentyminute * 3) * 24;
        System.out.println("За 3-е суток машина произвела " + day * 3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + day * 31 + " штук бутылок");

        byte paints = 120;
        byte white = 2;
        byte brown = 4;
        byte classroom = (byte) (white + brown);
        byte manyClasses = (byte) (paints / classroom);
        System.out.println("В школе, где " + manyClasses + " классов, нужно " + manyClasses * white + " банок белой краски и " + manyClasses * brown + " коричневой краски");
        ;


        int banana = (80 * 5);
        int milk = (105 * 2);
        int iceCream = (100 * 2);
        int eggs = (70 * 4);
        int breakfast = banana + milk + iceCream + eggs;
        System.out.println("Вес такого спортзавтрака " + breakfast + " грамм");
        float kg = breakfast / 1000f;
        System.out.println("Вес такого спортзавтрака " + kg + " кг");

        int loseWeight = 7 * 1000;
        int day250 = loseWeight / 250;
        System.out.println("Если терять 250 грамм в сутки, потребуется " + day250 + " дней, чтобы сбросить 7 кг");
        int day500 = loseWeight / 500;
        System.out.println("Если терять 500 грамм в сутки, потребуется " + day500 + " дней, чтобы сбросить 7 кг");

        int Maria = 67760;
        int Maria10 = Maria * 10 / 100;
        int salaryMaria = Maria + Maria10;
        System.out.println("Маша теперь получает " + salaryMaria + " рублей. Годовой доход вырос на " + Maria10 + " рублей");
        int Denis = 83690;
        int Denis10 = Denis * 10 / 100;
        int salaryDenis = Denis + Denis10;
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + Denis10 + " рублей");
        int Kristina = 76230;
        int Kristina10 = Kristina * 10 / 100;
        int salaryKristina = Kristina + Kristina10;
        System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + Kristina10 + " рублей");
    }
}