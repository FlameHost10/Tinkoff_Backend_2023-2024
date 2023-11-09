package edu.hw3;

import java.util.PriorityQueue;

public class Task6{

    public static class StockExchange implements StockMarket{
        private final PriorityQueue<Stock> stocks = new PriorityQueue<>();

        @Override
        public void add(Stock stock) {
            stocks.add(stock);
        }

        @Override
        public void remove(Stock stock) {
            stocks.remove(stock);
        }

        @Override
        public Stock mostValuableStock() {
            if (this.size() == 0) {
                return null;
            }
            return stocks.peek();
        }

        public int size() {
            return stocks.size();
        }

        @Override
        public String toString() {
            return stocks.toString();
        }
    }
}
