package edu.hw3;

import java.util.List;
import java.util.Collection;
import java.util.Iterator;

public class Task8 {

    public static class BackwardIterator<E> implements Iterator<E> {

        private List<E> list;
        private int cursor;

        public BackwardIterator(List<E> list){
            this.list = list;
            this.cursor = list.size();
        }

        @Override
        public boolean hasNext() {
            return cursor > 0;
        }

        @Override
        public E next() {
            cursor--;
            return list.get(cursor);
        }
    }
}
