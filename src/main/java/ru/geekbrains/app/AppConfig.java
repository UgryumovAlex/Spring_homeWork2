package ru.geekbrains.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="cardiologist")
    public IDoctor cardiologist() {
        return new Cardiologist();
    }

    @Bean(name="hospitalRoom")
    public HospitalRoom hospitalRoom(IDoctor cardiologist) {
        HospitalRoom hospitalRoom = new HospitalRoom(100/*roomNumber*/);
        hospitalRoom.setDoctor(cardiologist);
        return hospitalRoom;
    }

    @Bean(name="hosptalRegistry")
    public HospitalRegistry hospitalRegistry(HospitalRoom hospitalRoom) {
        HospitalRegistry hospitalRegistry = new HospitalRegistry();
        hospitalRegistry.setCardiologistRoom(hospitalRoom);
        return hospitalRegistry;
    }
}
