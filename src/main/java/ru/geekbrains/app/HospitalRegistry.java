package ru.geekbrains.app;

public class HospitalRegistry {
    private IDoctor cardiologist;
    private HospitalRoom cardiologistRoom;

    public HospitalRoom cardiologistRefferal() {
        cardiologist = new Cardiologist();
        cardiologistRoom = new HospitalRoom(100, cardiologist);

        return cardiologistRoom;
    }
}
