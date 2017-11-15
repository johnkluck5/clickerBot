//John Kluck
//johnkluck5@gmail.com
//clicker bot

package clickbot;

import java.awt.event.InputEvent;
import java.awt.Robot;

public class ClickBot {
    
    public static int mask = InputEvent.BUTTON1_MASK;
    public static int exitClick = InputEvent.BUTTON2_MASK;

    public static void main(String[] args){
        
        int count = 0;
        
        try{
            boolean click = true;
            
            Robot robot = new Robot();
            //set start delay
            Thread.sleep(5000);
            while(click){
                
                robot.mousePress(mask);
                robot.mouseRelease(mask);
                count++;
                //set delay between clicks
                Thread.sleep(1);
                
                //set number of clicks
                if (count > 10000){
                    click = false;
                }    
                
            }
        
        }
        catch (final Exception e){
            throw new RuntimeException(e);
        }
    }


}