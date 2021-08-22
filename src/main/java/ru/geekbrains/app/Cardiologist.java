package ru.geekbrains.app;

public class Cardiologist implements  IDoctor{
    @Override
    public void doHealing() {
        System.out.println("Снял кардиограмму. Расписал схему лечения");
    }
}
