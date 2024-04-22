package org.example;


import com.google.gson.Gson;
import org.example.Domen.Person;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Person person = new Person("Alex", "Ivashin", 38);
        Person person1 = new Person("Ivan", "Petrov", 21);
        Person person2 = new Person("Alex", "Ivashin", 38);

        // Cериализуем из объекта в JSON
        System.out.println();
        System.out.println("Cериализации в формат JSON");
        Gson gson = new Gson();
        String personGson = gson.toJson(person);
        System.out.println(personGson);

        // Десериализуем из JSON в оъект Person
        System.out.println();
        System.out.println("Десериализации из JSON в объект");
        Person personDes = gson.fromJson(personGson, Person.class);
        System.out.println(personDes);

        // hashCode (Хэшкод) объекта
        System.out.println();
        System.out.println("hashCode объектов");
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        // сравнение объектов по equals
        System.out.println();
        System.out.println("equals объектов");
        System.out.println(person2.equals(person1));
        System.out.println(person.equals(person2));


    }
}