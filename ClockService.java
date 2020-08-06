package home_work208;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ClockService{

 @Autowired
 private List<Clock> clocks;

 private int currentType;

 //a
 public void firstRequest(){
     System.out.println("**************"+clocks.get(currentType).getClass().getSimpleName()+"*****************");

     try{
         clocks.get(currentType).printFirstRequest();
     }
     //if currentType is larger than list size
     catch (ArrayIndexOutOfBoundsException e){
         throw new RuntimeException(e);
     }
 }

 //b
 public void secondRequest() throws ArrayIndexOutOfBoundsException{
     try {
         clocks.get(currentType).printSecondRequest();
     }
     //if currentType is larger than list size
     catch (ArrayIndexOutOfBoundsException e){
         throw new RuntimeException(e);
     }
 }

 //c
 public void getNextType(){
         currentType++;
     if (currentType == clocks.size()){
         currentType = -1;
         //to test exception, uncomment below. There will be an exception but the alarm will still run afterwards.
         //currentType=5;
     }
 }

 public void useClocks(){
     System.out.println("using clocks...");
     while (currentType!=-1){
         firstRequest();
         secondRequest();
         getNextType();
     }

 }

}
