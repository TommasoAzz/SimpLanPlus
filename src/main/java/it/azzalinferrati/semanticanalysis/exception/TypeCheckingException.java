package it.azzalinferrati.semanticanalysis.exception;

public class TypeCheckingException extends Exception{
    private static final long serialVersionUID = 1L;
    
    public TypeCheckingException(String message) {
        super(message);
    }
}
