package org.example;

public abstract class Animal {
    public abstract void speak();

public class Cat extends Animal {
    public void speak()
        {
            System.out.println("cat says meow!");
        }
}

public class Dog extends Animal{
    public void speak()
    {
        System.out.println("dog says woof!");
    }
}