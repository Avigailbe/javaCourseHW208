package home_work208;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class MyAlarm implements Clock {

    public MyAlarm(){
    }

    @Override
    public void printFirstRequest(){

        System.out.println("The alarm time will be: "+ LocalDate.now().atTime(11,30));
        soundAlarm();
    }

    @Override
    public void printSecondRequest(){

        System.out.println("The stop time is: "+ LocalDate.now().atTime(11,35));
    }

    @Scheduled(fixedDelay = 1000)
    public void soundAlarm(){
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    }
}
