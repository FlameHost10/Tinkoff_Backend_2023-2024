package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test5 {
    @Test
    @DisplayName("Среднее значение продолжительности сеанса")
    void ValidationRussianLicensePlatesTest(){

        String test1 = "А123ВЕ777",
            test2 = "О777ОО177",
            test3 = "123АВЕ777",
            test4 = "1621МА10",
            test5 = "1A22Ma20",
            test6 = "fsfwef22";

        String ansTest1 = Task5.ValidationRussianLicensePlates(test1),
            ansTest2 = Task5.ValidationRussianLicensePlates(test2),
            ansTest3 = Task5.ValidationRussianLicensePlates(test3),
            ansTest4 = Task5.ValidationRussianLicensePlates(test4),
            ansTest5 = Task5.ValidationRussianLicensePlates(test5),
            ansTest6 = Task5.ValidationRussianLicensePlates(test6);

        System.out.println(test1 + " " + ansTest1);
        System.out.println(test2 + " " + ansTest2);
        System.out.println(test3 + " " + ansTest3);
        System.out.println(test4 + " " + ansTest4);
        System.out.println(test5 + " " + ansTest5);
        System.out.println(test6 + " " + ansTest6);


    }
}
