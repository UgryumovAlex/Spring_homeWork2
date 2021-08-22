package ru.geekbrains.app;

public class Patient {
    public static void main(String[] args) {
        HospitalRegistry hreg = new HospitalRegistry();
        HospitalRoom refferal = hreg.cardiologistRefferal();
        refferal.getDoctor().doHealing();
    }
}
