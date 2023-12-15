package edu.hw7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Task3 {
    public record Person(int id, String name, String address, String phoneNumber) {

        @Override public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return id == person.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    interface PersonDatabase {
        void add(Person person);
        void delete(int id);

        List<Person> findByName(String name);
        List<Person> findByAddress(String address);
        List<Person> findByPhone(String phone);
    }


    public static class PersonDatabaseFind implements PersonDatabase{
        private Set<Person> database = new HashSet<>();
        private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        private final Lock readLock = readWriteLock.readLock();
        private final Lock writeLock = readWriteLock.writeLock();

        @Override
        public void add(Person person) {
            writeLock.lock();
            database.add(person);
            writeLock.unlock();
        }

        @Override
        public void delete(int id) {
            writeLock.lock();
            database.remove(new Person(id, null, null, null));
            writeLock.unlock();
        }

        @Override
        public List<Person> findByName(String name) {
            List<Person> listByName;
            readLock.lock();
            listByName = database.stream().filter(x -> x.name.equals(name)).toList();
            readLock.unlock();
            return listByName;
        }

        @Override
        public List<Person> findByAddress(String address) {
            List<Person> listByAddress;
            readLock.lock();
            listByAddress = database.stream().filter(x -> x.address.equals(address)).toList();
            readLock.unlock();
            return listByAddress;

        }

        @Override
        public List<Person> findByPhone(String phone) {
            List<Person> listByPhone;
            readLock.lock();
            listByPhone = database.stream().filter(x -> x.phoneNumber.equals(phone)).toList();
            readLock.unlock();
            return listByPhone;
        }
    }


}
