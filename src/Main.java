public class Task {
    public static void main(String[] args) {
        byte a = 5;
        System.out.println(a);
        short b = 320;
        System.out.println(b);
        int c = 349000;
        System.out.println(c);
        long d = 475849302L;
        System.out.println(d);
        float e = 7.23921f;
        System.out.println(e);
        double f = 21.5885949303;
        System.out.println(f);
        char g = 25;
        System.out.println(g);
        boolean h = 10 > 5;
        System.out.println(h);
        boolean i = 10 < 5;
        System.out.println(i);

        byte Task_2 = 2;
        System.out.println("Task" + Task_2);
        double weightBoxerFirst = 78.2;
        System.out.println("Вес первого боксера составляет " + weightBoxerFirst + " кг");
        double weightBoxerSecond = 82.7;
        System.out.println("Вес второго боксера составляет " + weightBoxerSecond + " кг");
        double totalWeight = weightBoxerFirst + weightBoxerSecond;
        System.out.println("Общий вес боксеров составляет " + totalWeight + " кг");
        double differenceWeight = Math.abs(weightBoxerFirst - weightBoxerSecond);
        System.out.println("Разница в весе боксеров составляет " + differenceWeight + " кг");

        byte Task_3 = 3;
        System.out.println("Task" + Task_3);
        byte banana = 80;
        System.out.println("Масса банана составляет " + banana + " грамм");
        byte milk = 105;
        System.out.println("Масса 100 мл молока составляет " + milk + " грамм");
        byte iceCream = 100;
        System.out.println("Масса одного пломбира составляет " + iceCream + " грамм");
        byte egg = 70;
        System.out.println("Масса одного яйца сотавляет " + egg + " грамм");
        short breakfast = (short) (5*banana + 2*milk + 2*iceCream + 4*egg);
        System.out.println("Масса завтрака составляет " + breakfast + " грамм");
        double breakfastMass = breakfast*0.001;
        System.out.println("Масса завтрака составляет " + breakfastMass + " киллограмм");

        byte Task_4 = 4;
        System.out.println("Task" + Task_4);
        byte weightDown = 7;
        System.out.println("Вес похудения составляет " + weightDown + " кг");
        short weightDowngr = (short) (weightDown*1000);
        System.out.println("Вес похудения составляет " + weightDowngr + " гр");
        short dayWeightDown250 = (short) (weightDowngr/250);
        System.out.println("Для похудения на 7 кг при снижении 250 грамм подадобится " + dayWeightDown250 + " дней");
        short dayWeightDown500 = (short) (weightDowngr/500);
        System.out.println("Для похудения на 7 кг при снижении 500 грамм понадобится " + dayWeightDown500 + " дней");
        short averageNumber = (short) ((dayWeightDown500 + dayWeightDown250)/2);
        System.out.println("Среднее колличество дней для похудения составляет " + averageNumber + " дней");

        byte Task_5 = 5;
        System.out.println("Task" + 5);
        int salaryMasha = 67760;
        System.out.println("Зарплата Маши составляет " + salaryMasha + " рублей");
        int salaryDenis = 83690;
        System.out.println("Зарплата Дениса составляет " + salaryDenis + " рублей");
        int salaryKristina = 76230;
        System.out.println("Зарплата Кристины составляет " + salaryKristina + " рублей");
        double salaryMashaUp10 = salaryMasha * 0.1 + salaryMasha;
        System.out.println("Зарплата Маши после повышения составит " + salaryMashaUp10 + " рублей");
        double salaryDenisUp10 = salaryDenis * 0.1 + salaryDenis;
        System.out.println("Зарплата Дениса после повышения составит " + salaryDenisUp10 + " рублей");
        double salaryKristinaUp10 = salaryKristina * 0.1 + salaryKristina;
        System.out.println("Зарплата Кристины после повышения составит " + salaryKristinaUp10 + " рублей");
        double salaryMashaYear10 = salaryMashaUp10 * 12;
        double salaryDenisYear10 = salaryDenisUp10 * 12;
        double salaryKristinaYear10 = salaryKristinaUp10 * 12;
        double salaryMashaYear = salaryMasha * 12;
        double salaryDenisYear = salaryDenis * 12;
        double salaryKristinaYear = salaryKristina * 12;
        double salaryUpMasha = salaryMashaYear10 - salaryMashaYear;
        double salaryUpDenis = salaryDenisYear10 - salaryDenisYear;
        double salaryUpKristina = salaryKristinaYear10 - salaryKristinaYear;
        System.out.println("Маша теперь зарабатывает " + salaryMashaUp10 + " рублей. Годовой доход вырос на  " + salaryUpMasha + " рублей");
        System.out.println("Денис теперь зарабатывает " + salaryDenisUp10 + " рублей. Годовой доход вырос на  " + salaryUpDenis + " рублей");
        System.out.println("Кристина теперь зарабатывает " + salaryKristinaUp10 + " рублей. Годовой доход вырос на  " + salaryUpKristina + " рублей");

    }
}
