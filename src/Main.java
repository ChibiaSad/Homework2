public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1(){
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.6f;
        double d = 7.8;
    }

    public static void task2(){
        float weightOfTheFirstBoxer = 78.2f, weightOfTheSecondBoxer = 82.7f;
        float totalWeight = weightOfTheFirstBoxer + weightOfTheSecondBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        System.out.println("Разница в весе " + Math.abs(weightOfTheFirstBoxer - weightOfTheSecondBoxer) + " кг\n");
    }

    public static void task3(){
        int weightOfBananas = 5 * 80, weightOfMilk = 200 / 100 * 105, weightOfIceCream = 2 * 100 , weightOfEggs = 4 * 70;
        float totalGrams = weightOfEggs + weightOfBananas + weightOfMilk + weightOfIceCream;
        System.out.println("Завтрак спортсмена весит " + totalGrams/1000 + " кг\n");

    }

    public static void task4(){
        int weightNeedToLose = 7;
        float maxNumberOfDays = weightNeedToLose/0.25f;
        float minNumberOfDays = weightNeedToLose/0.5f;
        System.out.println("Если каждый день сбрасывать 250г, то понадобится " + maxNumberOfDays + " дней");
        System.out.println("Если каждый день сбрасывать 500г, то понадобится " + minNumberOfDays + " дней");
        System.out.println("В среднем понадобится " + ((maxNumberOfDays+minNumberOfDays)/2f) + " день\n");
    }

    public static void task5(){
        int salaryMasha = 67760, salaryDenis = 83690, salaryKris = 76230;
        int yearSalaryMasha1 = salaryMasha * 12, yearSalaryDenis1 = salaryDenis * 12, yearSalaryKris1 = salaryKris * 12;
        System.out.printf("Годовой доход без повышения:\nМаша - %d рублей\nДенис - %d рублей\nКристина - %d рублей\n\n",
                yearSalaryMasha1, yearSalaryDenis1, yearSalaryKris1);

        float yearSalaryMasha2 = yearSalaryMasha1 * 1.1f, yearSalaryDenis2 = yearSalaryDenis1 * 1.1f, yearSalaryKris2 = yearSalaryKris1 * 1.1f;
        System.out.printf("Годовой доход c повышением:\nМаша - %.0f рублей\nДенис - %.0f рублей\nКристина - %.0f рублей\n\n",
                yearSalaryMasha2, yearSalaryDenis2, yearSalaryKris2);

        System.out.printf("Увеличение годового дохода:\nМаша - %.0f рублей\nДенис - %.0f рублей\nКристина - %.0f рублей\n\n",
                yearSalaryMasha2 - yearSalaryMasha1, yearSalaryDenis2 - yearSalaryDenis1, yearSalaryKris2 - yearSalaryKris1);
    }
}