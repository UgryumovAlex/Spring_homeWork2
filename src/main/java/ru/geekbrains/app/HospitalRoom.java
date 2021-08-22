package ru.geekbrains.app;

public class HospitalRoom {
    private int roomNumber;
    private IDoctor doctor;

    public HospitalRoom(int roomNumber, IDoctor doctor) {
        this.roomNumber = roomNumber;
        this.doctor = doctor;
    }

    public void setDoctor(IDoctor doctor) {
        this.doctor = doctor;
    }

    public IDoctor getDoctor() {
        return doctor;
    }
}
