package org.example.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    // Возвращает отсортированный лист  по именам
    public List<User> getSortedUsersByName(List<User> users) {
        return null;
    }

    //  Возвращает лист тех которые начинаются с prefix
    public List<User> getUsersStartedWithString(List<User> users, String prefix) {
        return null;
    }

    //  Возвращает мапу имя и кол-во в списке
    public Map<String, Integer> getCountOfNames(List<User> users) {
        return null;
    }

    //  Возвращает immutable лист пользователей с максимальным возростом
    public List<User> getUsersWithMaxAge(List<User> users) {
        return null;
    }

    //  Возвращает уникальные возрасты
    public List<User> getSetOfAges(List<List<User>> users) {
        return null;
    }

    //  Возвращает первого попавшегося "Сергея"
    public User getFirstSergey(List<User> users) {
        return null;
    }

    //  Возвращает сумму всех возрастов, а так же вывести каждый возраст
    public Long getSumOfAges(List<User> users) {
        return null;
    }

    //  Возвращает сумму всех возрастов, а так же вывести каждый возраст
    public Map<String, List<User>> getUsersGroupByCountry(List<User> users) {
        return null;
    }

    //  Закрепим
    public void quiz() {
        Stream.of("b", "a", "d", "c")
                .map(val -> val + 1)
                .peek(System.out::println);


        Stream.of("b", "a", "d", "c")
                .map(val -> val + 1)
                .peek(System.out::println)
                .forEach(System.out::println);


        Stream.of("b", "a", "d", "c")
                .map(val -> val + 1)
                .peek(System.out::println)
                .sorted()
                .forEach(System.out::println);


        List<String> list = Stream.of("b", "a", "d", "c")
                .map(val -> val + "t")
                .toList();

        list.add("w");
        System.out.println(list.size());
    }


    @Getter
    @AllArgsConstructor
    public static class User {

        private String name;
        private String country;
        private int age;
    }
}
