package edu.hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test6 {
    @Test
    @DisplayName("Биржа")
    void StockExchangeTest(){
        Task6.StockExchange stockExchange = new Task6.StockExchange();
        Stock tinkoff = new Stock("tinkoff", 5.66),
            sber = new Stock("sber", 8.31),
            vtb = new Stock("vtb", 4.78);

        stockExchange.add(tinkoff);
        stockExchange.add(sber);
        System.out.println(stockExchange + " -> " + stockExchange.mostValuableStock());

        stockExchange.remove(sber);
        System.out.println(stockExchange + " -> " + stockExchange.mostValuableStock());

        stockExchange.add(vtb);
        System.out.println(stockExchange + " -> " + stockExchange.mostValuableStock());



    }
}
