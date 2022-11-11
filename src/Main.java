public class Main {
    public static void main(String[] args) {

    /* Task 1 */

        int    varInt    = 1;
        byte   varByte   = 2;
        short  varShort  = 3;
        long   varLong   = 4;
        float  varFloat  = (float) 5.6;
        double varDouble = 7.8;

    System.out.println(
              "Значение переменной " + "varInt" + " с типом " + "Int" + " равно " + varInt +  "\n"
            + "Значение переменной " + "varByte" + " с типом " + "Byte" +  " равно " + varByte + "\n"
            + "Значение переменной " + "varShort" + " с типом " + "Short" +  " равно " + varShort + "\n"
            + "Значение переменной " + "varLong" + " с типом " + "Long" +  " равно " + varLong + "\n"
            + "Значение переменной " + "varFloat" + " с типом " + "Float" +  " равно " + varFloat + "\n"
            + "Значение переменной " + "varDouble" + " с типом " + "Double" +  " равно " + varDouble +"\n"
    );

    /* Task 2 */
    /* 27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67. */

          varByte   = 2;
          varInt    = 569;
          int  varInt2    = -159;
          varShort  = 27897;
          varLong   = 987678965549L ; /* L !!!! */
          varFloat  =  27.12F; /* F !!!!! */
          varDouble = 67.;

        System.out.println(
                "Значение переменной " + "varInt" + " с типом " + "Int" + " равно " + varInt +  "\n"
                        + "Значение переменной " + "varInt2" + " с типом " + "Int" + " равно " + varInt2 +  "\n"
                        + "Значение переменной " + "varByte" + " с типом " + "Byte" +  " равно " + varByte + "\n"
                        + "Значение переменной " + "varShort" + " с типом " + "Short" +  " равно " + varShort + "\n"
                        + "Значение переменной " + "varLong" + " с типом " + "Long" +  " равно " + varLong + "\n"
                        + "Значение переменной " + "varFloat" + " с типом " + "Float" +  " равно " + varFloat + "\n"
                        + "Значение переменной " + "varDouble" + " с типом " + "Double" +  " равно " + varDouble +"\n"
        );

        /* Task 3 */

        System.out.println("На каждого ученика рассчитано " + (480 / (23+27+30)) + " листов бумаги\n") ;

        /* Task 4 */

        byte bottlePerMinute = 16/2;

        System.out.println(
                "За 20 минут машины произвела бутылок " +  bottlePerMinute * 20  + " штук \n"
              + "За сутки машины произвела бутылок " +  bottlePerMinute * 24*60 + " штук \n"
              + "За 3 дня машины произвела бутылок " +  bottlePerMinute * 3*24*60  + " штук \n"
              + "За 1 месяц машины произвела бутылок " +  bottlePerMinute * 30*24*60 +" штук \n"
        );

    /* Task 5 */
        byte numClasses = 120 / (2+ 4);
        System.out.println(
                "В школе, где " + numClasses + " классов, нужно " + numClasses * 2 + " банок белой краски и " + numClasses  * 4 + " банок коричневой краски"
        );
        /* Task 6 */
        short banansWeight = 5 * 80 ;
        short milkWeight = 200 / 100 * 105 ;
        short icecreamWeight = 2 * 100 ;
        short eggsWeight = 4 * 70 ;
        short coctailWeight = (short) (banansWeight + milkWeight + icecreamWeight +  eggsWeight);
        System.out.println(
                "Вес спортивного коктейля " + coctailWeight  + " грамм или " + coctailWeight / 1000 + " килограмм ! "
        );

        /* Task 7 */
        short deltaWeight = 7 * 1000 ;
        short firstDelta = 500;
        short secondDelta = 250;
        short avgDelta = (short) ((firstDelta + secondDelta) / 2  );
        float avgDays =  (float) deltaWeight / ( (float)(firstDelta + secondDelta) / 2);
        System.out.println(
                "Вес спортсмена уменьшится на " + deltaWeight + " грамм за " + deltaWeight / firstDelta   + " дней , если он будет худеть по " + firstDelta + " грамм в день \n"
             +  "Вес спортсмена уменьшится на " + deltaWeight + " грамм за " + deltaWeight / secondDelta   + " дней , если он будет худеть по " + secondDelta + " грамм в день \n"
             +  "Вес спортсмена уменьшится на " + deltaWeight + " грамм за " + (double) avgDays + " дней , если он будет худеть по " + avgDelta + " грамм в день \n"
        );

        /* Task 8 */
        int currSalary ;
        int newSalary ;
        currSalary = 67760;
        newSalary = currSalary / 100 * 110 ;
        System.out.println(
                "Маша теперь получает " + newSalary  +  " рублей. Годовой доход вырос на " + (newSalary - currSalary) * 12   + " рублей\n"
        );
        currSalary = 83690;
        newSalary = currSalary / 100 * 110 ;
        System.out.println(
                "Денис теперь получает " + newSalary  +  " рублей. Годовой доход вырос на " + (newSalary - currSalary) * 12   + " рублей\n"
        );
        currSalary = 76230;
        newSalary = currSalary / 100 * 110 ;
        System.out.println(
                "Кристина теперь получает " + newSalary  +  " рублей. Годовой доход вырос на " + (newSalary - currSalary) * 12   + " рублей\n"
        );

        /*  End  */
    }
}