package UserException;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try{
            new Main().ME();
        }
        catch (WrongDayException e){
            System.out.println(e.toString());
        }
    }
    void ME() throws  WrongDayException{
        int d = new Date().getDay();
        if (d!= 2 && d!=5){
           throw  new WrongDayException("Только по вторникам и пятницам!!!");
        }
        else{
            System.out.println("ИНФА!!!!!!");
        }
    }
    class WrongDayException extends Exception{
        public WrongDayException() { }

        public WrongDayException(String message) {
            super(message);
        }
    }
}
