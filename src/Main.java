public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        byte a = 1;
        System.out.println("Значение переменной 'a' с типом 'byte' равно " + a);
        short b = 150;
        System.out.println("Значение переменной 'b' с типом 'short' равно " + b);
        int c = 33000;
        System.out.println("Значение переменной 'c' с типом 'int' равно " + c);
        long d = 10000000000L;
        System.out.println("Значение переменной 'd' с типом 'long' равно " + d);
        float e = 1.123456f;
        System.out.println("Значение переменной 'e' с типом 'float' равно " + e);
        double f = 10.123456789;
        System.out.println("Значение переменной 'f' с типом 'double' равно " + f);

        System.out.println("Задача №2");
        float a1 = 27.12f;
        System.out.println("Значение переменной 'a1' с типом 'float' равно " + a1);
        long b1 = 987_678_965_549L;
        System.out.println("Значение переменной 'b1' с типом 'long' равно " + b1);
        float c1 = 2.786f;
        System.out.println("Значение переменной 'c1' с типом 'float' равно " + c1);
        short d1 = 569;
        System.out.println("Значение переменной 'd1' с типом 'short' равно " + d1);
        short e1 = -159;
        System.out.println("Значение переменной 'e1' с типом 'short' равно " + e1);
        short f1 = 27897;
        System.out.println("Значение переменной 'f1' с типом 'short' равно " + f1);
        byte g1 = 67;
        System.out.println("Значение переменной 'g1' с типом 'byte' равно " + g1);

        System.out.println("Задача №3");
        byte ludmilaPavlovna = 23;
        System.out.println("У Людмилы Павловны " + ludmilaPavlovna + " ученика.");
        byte annaSergeevna = 27;
        System.out.println("У Анны Сергеевны " + annaSergeevna + " учеников.");
        byte ekaterinaAndreevna = 30;
        System.out.println("У Екатерины Андреевны " + ekaterinaAndreevna + " учеников.");
        short totalSheets = 480;
        System.out.println("Всего " + totalSheets + " листов бумаги на все три класса.");
        int oneStudent = totalSheets / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги.");

        System.out.println("Задача №4");
        byte quantityProduced = 16;
            byte timeSpend = 2;
            int productivityOneMinute = quantityProduced / timeSpend;
        byte twentyMinutes = 20;
            int productivityTwentyMinutes = productivityOneMinute * twentyMinutes;
            System.out.println("За 20 минут машина произвела " + productivityTwentyMinutes + " штук бутылок.");
        short day = 24 * 60;
            int productivityDay = day * productivityOneMinute;
            System.out.println("За сутки машина произвела " + productivityDay + " штук бутылок.");
        int threeDays = day * 3;
            int productivityThreeDay = threeDays * productivityOneMinute;
            System.out.println("За 3 дня машина произвела " + productivityThreeDay + " штук бутылок.");
        int oneMonth = day * 30;
            int productivityOneMonth = oneMonth * productivityOneMinute;
            System.out.println("За 1 месяц машина произвела " + productivityOneMonth + " штук бутылок.");

        System.out.println("Задача №5");
            byte totalCansPaint = 120;
            byte oneClassWhitePaint = 2;
            byte oneClassBrownPaint = 4;
            int totalClass = totalCansPaint / (oneClassWhitePaint + oneClassBrownPaint);
            int totalWhitePaint = totalClass * oneClassWhitePaint;
            int totalBrownPaint = totalClass * oneClassBrownPaint;
            System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        System.out.println("Задача №6");
            byte bananas = 5;
                byte weightOneBanana = 80;
                int totalWeightBananas = bananas * weightOneBanana;
            short milkMl = 200;
                byte ml = 100;
                byte gram = 105;
                int totalWeightMilk = milkMl / ml * gram;
            byte iceCream = 2;
                byte weightOneIceCreamBriquette = 100;
                int totalWeightIceCream = iceCream * weightOneIceCreamBriquette;
            byte edge = 4;
                byte weightOneEdge = 70;
                int totalWeightEdge = edge * weightOneEdge;
            int weightSportsBreakfastGrams = totalWeightBananas + totalWeightMilk + totalWeightEdge + totalWeightIceCream;
                short conversionGramsKg = 1000;
                float weightSportsBreakfastKg = weightSportsBreakfastGrams / (float)conversionGramsKg;
            System.out.println("Вес такого спортзавтрака " + weightSportsBreakfastGrams + " грамм.");
            System.out.println("Вес такого спортзавтрака " + weightSportsBreakfastKg + " кг.");

        System.out.println("Задача №7");
            byte needToResetKg = 7;
            int needToResetGr = needToResetKg * conversionGramsKg;
            short minWeightLoss = 250;
            short maxWeightLoss = 500;
            int maxNumberDay = needToResetGr / minWeightLoss;
            int minNumberDay = needToResetGr / maxWeightLoss;
            int everageValue = (minNumberDay + maxNumberDay) / 2;
            System.out.println("Потребуется " + maxNumberDay + " дней на похудение, при потере веса в " + minWeightLoss + " грамм в день.");
            System.out.println("Потребуется " + minNumberDay + " дней на похудение, при потере веса в " + maxWeightLoss + " грамм в день.");
            System.out.println("В среднем спортсмену потребуется " + everageValue + " день на похудение.");

        System.out.println("Задача №8");
            float percentageIncrease = 1.1f;
            byte year = 12;
            int salaryMasha = 67760;
                int annualIncomeMasha = salaryMasha * year;
                float newSalaryMasha = (float)salaryMasha * percentageIncrease;
                float newAnnualIncomeMasha = (float)newSalaryMasha * year;
                float differenceAnnualIncomeMasha = (float)newAnnualIncomeMasha - annualIncomeMasha;
                System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceAnnualIncomeMasha + " рублей.");
            int salaryDenis = 83690;
                int annualIncomeDenis = salaryDenis * year;
                float newSalaryDenis = (float)salaryDenis * percentageIncrease;
                float newAnnualIncomeDenis = (float)newSalaryDenis * year;
                float differenceAnnualIncomeDenis = (float)newAnnualIncomeDenis - annualIncomeDenis;
                System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceAnnualIncomeDenis + " рублей.");
            int salaryKristina = 76230;
                int annualIncomeKristina = salaryKristina * year;
                float newSalaryKristina = (float)salaryKristina * percentageIncrease;
                float newAnnualIncomeKristina = (float)newSalaryKristina * year;
                float differenceAnnualIncomeKristina = (float)newAnnualIncomeKristina - annualIncomeKristina;
                System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceAnnualIncomeKristina + " рублей.");



    }
}