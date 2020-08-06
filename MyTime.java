package home_work208;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class MyTime implements Clock{
    public MyTime() {
    }

    @Override
    public void printFirstRequest(){

        System.out.println("The year is now: "+ LocalDateTime.now().getYear());
    }

    @Override
    public void printSecondRequest(){

        System.out.println("The day is now: "+LocalDateTime.now().getDayOfWeek());
    }

}
