package com.mirea;
public abstract class Swim {
    // абстрактный метод плавать()
    abstract void style();

    // абстрактный класс может содержать и обычный метод
    void run() {
        System.out.println("Куда идешь?");
    }
}


