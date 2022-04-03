package Entrega10.src.excepciones;

public class RaizNegativaException extends RuntimeException {
    public RaizNegativaException(){
        
    }
    public RaizNegativaException(String mensaje){
        super(mensaje);
    }
}
