package pro.sky.onlinestoredemo.Exceptions;

public class BasketNotFoundException extends RuntimeException{
    public BasketNotFoundException (String message) {
        super(message);
    }
}
