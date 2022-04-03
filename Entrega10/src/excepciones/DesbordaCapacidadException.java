package Entrega10.src.excepciones;

public class DesbordaCapacidadException extends RuntimeException {
    public DesbordaCapacidadException() {

    }

    public DesbordaCapacidadException(String s) {
        super(s);
    }
}
