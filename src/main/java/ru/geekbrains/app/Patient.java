package ru.geekbrains.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Patient {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        HospitalRegistry hreg = context.getBean("hosptalRegistry",HospitalRegistry.class );
        HospitalRoom refferal = hreg.cardiologistRefferal();
        refferal.getDoctor().doHealing();
    }
}
