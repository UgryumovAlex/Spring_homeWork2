package ru.geekbrains.app;

public class HospitalRoom {
    private int roomNumber;
    private IDoctor doctor;

    public HospitalRoom(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setDoctor(IDoctor doctor) {
        this.doctor = doctor;
    }

    public IDoctor getDoctor() {
        return doctor;
    }
}
