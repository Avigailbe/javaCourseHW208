package home_work208;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
public class MyCalendar implements Clock{
    public MyCalendar() {
    }

    @Override
    public void printFirstRequest(){
        System.out.println("The hour is now: "+LocalDateTime.now().getHour());
    }

    @Override
    public void printSecondRequest(){
        System.out.println("The minutes are now: "+LocalDateTime.now().getMinute());
    }
}
