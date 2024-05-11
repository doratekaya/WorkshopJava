package zoomanagment.zoomanegment.entities;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(){

    }
    public InvalidAgeException(String msg){
        super(msg);
    }
}
