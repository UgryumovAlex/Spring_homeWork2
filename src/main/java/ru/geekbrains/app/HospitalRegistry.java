package ru.geekbrains.app;

public class HospitalRegistry {
    private HospitalRoom cardiologistRoom;

    public void setCardiologistRoom(HospitalRoom cardiologistRoom) {
        this.cardiologistRoom = cardiologistRoom;
    }

    public HospitalRoom cardiologistRefferal() {
        return cardiologistRoom;
    }
}
